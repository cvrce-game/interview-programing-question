package com.pratice.stack;

public class StackImpl {
	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.push(2);
		stk.push(4);
		stk.push(6);
		stk.push(8);
		stk.push(10);
		System.out.println("Stack Peek Value: "+stk.peek());
		stk.push(12);
		
		stk.pop();
		System.out.println("Stack After pop: "+stk.peek());
		
		stk.traverse();
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		stk.traverse();
		System.out.println(stk.pop());
	}
}
