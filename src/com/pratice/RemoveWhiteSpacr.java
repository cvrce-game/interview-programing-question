package com.pratice;

import java.util.Iterator;

public class RemoveWhiteSpacr {
	public static void main(String[] args) {
		String str = "  dff   enkrfeori  ";
		char[] chr = str.toCharArray();
		StringBuilder builder = new StringBuilder();
		for(char c:chr) {
			if (!Character.isWhitespace(c)) {
				builder.append(c);
			}
		}
		System.err.println(builder);
	}
}
