package com.pratice;

public class ReverseAString {
	public static void main(String[] args) {
		String str = "My Name is Khan";
		String ary[] = str.split(" ");
		System.out.println(ary);
		String ary2[] = reverse(ary);
		System.out.println(ary2);
		for (String string : ary2) {
			System.out.println(string);
		}
		
	}
	public static String[] reverse(String array[]) {
		String []arr=  new String[array.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= array[array.length-1-i];
		}
		return arr;
	}
}
