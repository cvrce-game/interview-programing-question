package com.pratice.stack;

public class Stack {
	public int top = -1;
	int stack[] = new int[5];

	public void push(int value) {
		if (top == stack.length - 1) {
			System.out.println("Stack is full");
		} else {
			top++;
			stack[top] = value;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			int data = stack[top];
			stack[top] = 0;
			top--;
			return data;
		}
	}

	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

	public int peek() {
		return stack[top];
	}
	public void traverse() {
		for (int i = 0; i <= top; i++) {
			int value = stack[i];
			System.out.println(value);
		}
	}
}
