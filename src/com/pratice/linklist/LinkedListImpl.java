package com.pratice.linklist;

public class LinkedListImpl {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(11);
		list.insert(10);
		list.insert(9);
		System.out.println("***After Insert****");
		list.traverse();
		System.out.println("*******");
		System.out.println("***After Insert At first****");
		list.insertAtFirste(13);
		list.traverse();
		System.out.println("*******");
		System.out.println("***After Insert At Middle****");
		list.insertAtMiddle(0,111);
		list.traverse();
		System.out.println("*******");
		System.out.println("***After Delete At First****");
		list.deleteFromFirst();
		list.traverse();
		System.out.println("*******");
		System.out.println("***After Delete At Middle****");
		list.deleteFromMidle(2);
		list.traverse();
		System.out.println("*******");
	}
}
