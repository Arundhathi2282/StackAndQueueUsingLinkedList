package com.bridgelabz.stacklinkedlist;

public class Stack {

	public static void main(String[] args) {
		StackLinkedList stack = new StackLinkedList();
		System.out.println(stack.size());
		stack.push(70);
		stack.push(30);
		stack.push(56);
		System.out.println(stack.size());
		stack.displayElements();
	}
}
