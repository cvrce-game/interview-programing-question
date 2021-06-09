package com.pratice.linklist;

public class LinkedList {
	Node head;

	public void insert(int value) {
		Node node = new Node();
		node.data = value;
		if (head == null) {
			head = node;
		} else {
			Node nd = head;
			while (nd.next != null) {
				nd = nd.next;
			}
			nd.next = node;
		}
	}

	public void traverse() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	public void insertAtFirste(int value) {
		Node node = new Node();
		node.data = value;

		node.next = head;
		head = node;
	}

	public void insertAtMiddle(int index, int value) {
		Node node = new Node();
		node.data = value;
		if (index == 0) {
			insertAtFirste(value);
			return;
		}
		Node n = head;
		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}

	public void deleteFromFirst() {
		Node node = head;

		head = node.next;
		node.next = null;
	}

	public void deleteFromMidle(int index) {
		Node node = head;

		Node temp = null;
		for (int i = 0; i < index - 1; i++) {
			node =  node.next;
		}
		temp = node.next;
		node.next = temp.next;
		
	}
}
