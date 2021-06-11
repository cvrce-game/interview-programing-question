package com.pratice.queue;

public class Queue {
	int maxsize = 5;
	int queue[] = new int[maxsize];
	int front = 0;
	int rear = -1;
	int currentSize = 0;

	public void enQueue(int value) {
		if (isQueueFull()) {
			System.out.println("Queue is Full");
			return;
		}
		if (rear == maxsize - 1) {
			rear = -1;
		}
		rear++;
		currentSize++;
		queue[rear] = value;
	}

	public boolean isQueueFull() {
		return currentSize == maxsize;
	}

	public void deQueue() {
		if (isQueueEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		int result = queue[front];
		System.out.println("Removed from Queue : " + result);
		front++;
		if (front == maxsize) {
			front = 0;
		}
		currentSize--;
	}

	public boolean isQueueEmpty() {
		return currentSize == 0;
	}

	public void display() {
		if (isQueueEmpty()) {
			System.out.println("Queue is empty..Nothing to display");
			return;
		}
		for (int i = front; i <= rear; i++) {
			System.out.println(queue[i] + " ");
		}
	}
}
