package com.pratice;

public class StringReverse {
	public static void main(String[] args) {
		String str = "i am good";
		System.out.println(reverse(str));

		String str2 = "welcome to ey";
		System.out.println(reverseStrWithoutSpace(str2));
	}

	public static String reverse(String sf) {
		char[] ch = sf.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {
			char temp = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = temp;
		}
		return new String(ch);
	}

	private static String reverseStrWithoutSpace(String str) {
		char[] arr = str.toCharArray();
		char[] outputArr = new char[str.length()];

		int i = 0;
		int j = str.length() - 1;

		while (i < str.length() && j > 0) {
			if (arr[j] != ' ') {
				outputArr[j] = arr[i];
			} else {
				j--;
				continue;
			}

			if (arr[i] != ' ') {
				outputArr[i] = arr[j];
			} else {
				i++;
				continue;
			}
			i++;
			j--;
		}
		return new String(outputArr);
	}
}
