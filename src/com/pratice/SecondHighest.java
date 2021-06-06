package com.pratice;

public class SecondHighest {

	public static void main(String[] args) {
		int intList[] = { 12, 21, 3, 44, 5, 89, 22 };
		int highest = 0;
		int secondHight = 0;
		for (int l : intList) {
			if (l > highest) {
				secondHight = highest;
				highest = l;
			} else if (l > secondHight) {
				secondHight = l;
			}
		}
		System.out.println(highest);
		System.out.println(secondHight);
	}
}
