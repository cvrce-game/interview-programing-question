package com.pratice;

public class StringReverse {
	public static void main(String[] args) {
//		String str = "i am good";
//		System.out.println(reverse(str));

		String str2 = "welcome to ey";
		reverse2(str2);
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

	public static String reverse2(String sf) {
		String[] spltArr = sf.split(" ");
		int count = 0;
		char[] ch = new char[sf.length()];
		for (int i = 0; i < sf.length(); i++) {
			if ((i == (spltArr[0].length() + 2)) || (i == ((spltArr[0].length() + 1) + (spltArr[1].length() + 1)))
					|| (i == ((spltArr[0].length() + 2) + (spltArr[1].length() + 2) + (spltArr[2].length() + 2)))) {
				ch[count] = ' ';
				count++;
			}
			if (sf.charAt((sf.length() - 1) - i) == ' ') {
				continue;
			} else {
				ch[count] = sf.charAt((sf.length() - 1) - i);
				count++;
			}
		}
		System.out.println(new String(ch));
		return null;
	}
}
