package com.pratice;

import java.util.*;

public class SeperateAnargamInDiffList {

	public static void main(String args[]) {

		String[] arr1 = { "cat", "dog", "god", "tac", "fish", "cat", "ogd", "act", "lion" };

		Set<String> set = arrayToSet(arr1);
		Map<String, List<String>> map = new HashMap<>();

		for (String str : set) {
			map = updateMap(map, str);
		}
		System.out.println("map " + map);
	}

	private static Map<String, List<String>> updateMap(Map<String, List<String>> map, String str) {
		String key = sortString(str);
		List<String> list = null;
		if (map.containsKey(key)) {
			list = map.get(key);
		} else {
			list = new ArrayList<>();
		}
		list.add(str);
		map.put(key, list);
		return map;
	}

	private static String sortString(String inputString) {
		// convert input string to char array
		char tempArray[] = inputString.toCharArray();

		// sort tempArray
		Arrays.sort(tempArray);

		// return new sorted string
		return new String(tempArray);
	}

	private static Set<String> arrayToSet(String[] arr) {
		Set<String> set = new HashSet<>();
		Arrays.stream(arr).forEach((s) -> {
			set.add(s);
		});
		return set;
	}
}
