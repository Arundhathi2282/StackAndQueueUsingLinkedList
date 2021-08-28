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

	/**
	 * This method will push an element into the stack
	 * 
	 * @param data
	 */
	public void push(int data) {
		Node tempNode = new Node(data);
		tempNode.next = top;
		top = tempNode;
		size++;
	}

	/**
	 * This method will pop an element from the stack
	 * 
	 * @return
	 */
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

	/**
	 * This method will give the top most element in the stack
	 * 
	 * @return
	 */
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		return top.data;
	}

	/**
	 * This method will return your stack size
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * This method will check your stack is empty or not
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * This method will print all the elements present in the stack
	 */
	public void displayElements() {
		Node current = top;
		while (current.next != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}
}
