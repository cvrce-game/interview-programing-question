package com.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindAllPairWithSum {

	public static void main(String[] args) {
		// write your code here
		// Find all the pair of elements from given array which having sum equal or
		// greater than given number

		int[] arr = { 4, 3, 6, 5, 8, 2, 1, 9, 20, 7, 6, 5 };

		Set<ArrayList<Integer>> ifHasPairWithSum = hasPairWithSum(arr, 8);
		System.out.println("Has Pair with Sum of given number : " + ifHasPairWithSum);

		Set<ArrayList<Integer>> ifHasPairWithSumEqualAndGreater = hasPairWithSumEqualOrGreater(arr, 8);
		System.out
				.println("Has Pair with Sum equal and greater than given number : " + ifHasPairWithSumEqualAndGreater);
	}

	private static Set<ArrayList<Integer>> hasPairWithSum(int[] arr, int givenNum) {
		Set<Integer> intSet = new HashSet<>();
		Set<ArrayList<Integer>> data = new HashSet<>();
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if (intSet.contains(arr[i])) {
				ArrayList<Integer> arrayAtAddress = new ArrayList<>();
				arrayAtAddress.add(arr[i]);
				arrayAtAddress.add(givenNum - arr[i]);
				data.add(arrayAtAddress);
			} else {
				intSet.add(givenNum - arr[i]);
			}
		}
		return data;
	}

	private static Set<ArrayList<Integer>> hasPairWithSumEqualOrGreater(int[] arr, int givenNum) {
		Set<Integer> intSet = new HashSet<>();
		Set<ArrayList<Integer>> data = new HashSet<>();
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if (intSet.contains(arr[i]) || arr[i] >= givenNum) {
				ArrayList<Integer> arrayAtAddress = new ArrayList<>();
				arrayAtAddress.add(arr[i]);
				if (arr[i] < givenNum) {
					arrayAtAddress.add(givenNum - arr[i]);
				}
				data.add(arrayAtAddress);
				intSet.remove(arr[i]);
			} else {
				intSet.add(givenNum - arr[i]);
			}
		}

		System.out.println("Having sum equal or element greater than given number: " + data);

		int[] tempArr = new int[intSet.size()];
		int count = 0;
		for (Integer i : intSet) {
			tempArr[count] = givenNum - i;
			count++;
		}
		Set<ArrayList<Integer>> data1 = hasPairWithSumGreater(tempArr, givenNum);
		System.out.println("Having sum greater than given number: " + data1);
		data.addAll(data1);
		System.out.println("Having sum equal or greater than given number: " + data);
		return data;
	}

	private static Set<ArrayList<Integer>> hasPairWithSumGreater(int[] arr, int givenNum) {
		Set<Integer> intSet = new HashSet<>();
		Set<ArrayList<Integer>> data = new HashSet<>();
		int len = arr.length;
		Arrays.sort(arr);
		int endIndex = arr.length % 2 != 0 ? arr.length % 2 : arr.length / 2;
		int[] arr1 = splitArray(arr, 0, endIndex);
		int[] arr2 = splitArray(arr, arr1.length, arr.length);
		int i = 0, j = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] + arr2[j] >= givenNum || arr1[i] >= givenNum || arr2[j] >= givenNum) {
				ArrayList<Integer> a = new ArrayList<>();
				if (arr1[i] + arr2[j] >= givenNum) {
					a.add(arr1[i]);
					a.add(arr2[j]);
					j++;
					i++;
				} else if (arr1[i] >= givenNum) {
					a.add(arr1[i]);
					i++;
				} else if (arr2[j] >= givenNum) {
					a.add(arr2[j]);
					j++;
				}
				data.add(a);
			} else if (j == arr2.length - 1) {
				j = 0;
				i++;
			} else {
				j++;
			}
		}

		return data;
	}

	private static int[] splitArray(int[] arr, int startIndex, int endIndex) {
		int[] spliceArr = new int[endIndex - startIndex];
		int count = 0;
		for (int i = startIndex; i < endIndex; i++) {
			spliceArr[count] = arr[i];
			if (i == endIndex - 1) {
				break;
			}
			count++;
		}
		return spliceArr;
	}
}
