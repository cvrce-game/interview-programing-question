package com.pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Pratice {

	public static void main(String[] args) {
		List<Integer> listArray = new ArrayList<Integer>();
		
		listArray.add(21);
		listArray.add(21);
		listArray.add(21);
		listArray.add(21);
		
		ListIterator<Integer> ltr = listArray.listIterator();
		while (ltr.hasNext()) {
			int value = ltr.next();
			System.out.println(value);
			ltr.add(20);
		}
		
		ltr = listArray.listIterator();
		while (ltr.hasNext()) {
			int value = ltr.next();
			System.out.println(value);
		}
		
	}
	
}
