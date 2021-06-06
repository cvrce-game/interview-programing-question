package com.pratice;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Papun";
		System.out.println(reverse(name));
	}
	public static StringBuilder reverse(String in) {
		StringBuilder stringBuilder = new StringBuilder(in);
		return stringBuilder.reverse();
	}
}
