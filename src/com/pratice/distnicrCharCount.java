package com.pratice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class distnicrCharCount {

	public static void main(String[] args) {
		String str = "Madam";
		System.out.println(charCount(str));
	}
	public static Map charCount(String in) {
		char[] ch =in.toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for(Character c : ch) {
			if(m.containsKey(c)) {
				m.put(c, (m.get(c)+1));
			} else {
				m.put(c, 1);
			}
		}
		return m;
	}
}
