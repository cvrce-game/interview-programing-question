package com.pratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateFromList {
	public static void main(String[] args) {
		int arr1[] = { 4, 4, 7, 8, 8, 9 };
		int arr2[] = { 2, 3, 6, 8, 90, 58, 58, 60 };
		int arr3[] = { 3, 6, 5, 7, 8, 19, 32 };
		findDuplicates(arr1);
	}

	public static void findDuplicates(int arr[]) {
		Set<Integer> intSet = new HashSet<Integer>();
		ArrayList<Integer> ll = new ArrayList<Integer>();
		for(int val: arr) {
			if(!intSet.add(val)) {
				ll.add(val);
			}
		}
		ll.forEach(val ->System.out.println(val));
	}
}
