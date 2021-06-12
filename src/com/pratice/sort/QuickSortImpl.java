package com.pratice.sort;

public class QuickSortImpl {
	static int arr[];

	public static void main(String[] args) {
		arr = new int[] { 12, 4, 5, 99, 20, 40, 22, 44, 11 };
		quickSort(0, arr.length - 1);
		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static void quickSort(int begin, int end) {
		if (begin < end) {
			int pivortalIndex = partition(begin, end);

			quickSort(begin, pivortalIndex - 1);
			quickSort(pivortalIndex + 1, end);
		}
	}

	private static int partition(int begin, int end) {
		int pivot = arr[begin];
		int i = begin;
		int j = end;

		while (i < j) {
			while (arr[i] <= pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i < j) {
				swap(i, j);
			}
		}

		swap(begin, j);

		return j;
	}

	private static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
}
