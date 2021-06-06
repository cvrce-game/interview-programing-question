package com.pratice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestNumber {

	public static void main(String[] args) {
		int arr[] = {10, 324, 45, 90, 9808};
        int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
		
		List<Integer> list = Arrays. asList(20, 10, 100, 140, 250);
		Integer maxList = Collections.max(list);
		System.out.println(maxList);
		Collections.reverse(list);
		System.out.println(list);
	}
}
