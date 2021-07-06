package com.pratice;

import java.util.HashMap;
import java.util.Map;

public class FindPair {

	public static void main(String[] args) {
		// write your code here
		// Find all the pair of elements from given array which having sum equal or
		// greater than given number

		int[] arr = { 4, 3, 6, 5, 8, 2, 1, 9, 20, 7, 6, 5 };
		int sum = 8;
		findPair(arr,sum);
	}

	public static void findPair(int[] arr, int sum) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] >= sum) {
					map.put(arr[i] + "+" + arr[j], arr[i] + arr[j]);
				}
			}
		}
		System.out.println(map);
	}

}
