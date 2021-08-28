package com.bridgelabz.stacklinkedlist;

public class StackLinkedList {

	private Node top;
	private int size;

	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int data) {
		Node tempNode = new Node(data);
		tempNode.next = top;
		top = tempNode;
		size++;
	}

	public int pop() {
		int result = 0;
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			result = top.data;
			top = top.next;
			size--;
		}
		return result;

	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		return top.data;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void displayElements() {
		Node current = top;
		while (current.next != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}
}
