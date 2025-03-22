package com.app;

public class LinkedListBasedStack<T> {

	Node<T> head;

	public LinkedListBasedStack() {
		this.head = null;
	}

	public void push(T data) {

		Node<T> ele = new Node<T>(data);

		if (head == null) {
			head = ele;
		} else {
			ele.next = head;
			head = ele;
		}
	}

	public T peek() {
		if (head == null) {
			return null;
		} else {
			return head.data;
		}
	}

	public void pop() {

		if (head == null) {
			System.out.println("Stack underflow");
		} else {
			head = head.next;
		}
	}

	public void display() {

		if (head == null) {
			System.err.println("Stack underflow");
		} else {
			Node<T> curr_node = head;

			while (curr_node != null) {
				System.out.println(curr_node.data);
				curr_node = curr_node.next;
			}
		}
	}

	public static void main(String[] args) {

		LinkedListBasedStack<Integer> stack = new LinkedListBasedStack<>();

		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		stack.push(17);
		stack.display();
		System.out.println("Pop a element");
		stack.pop();
		stack.display();
		System.out.println("Peek a element");
		stack.peek();
		stack.display();
	}

}
