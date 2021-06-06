package com.pratice;

public class VowelCheck {
	public static void main(String[] args) {
		String str = "grtyr";
		System.out.println(vowelCheck(str));
	}
	public static boolean vowelCheck(String in) {
		return in.matches(".*[aeiou].*");
	}
}
