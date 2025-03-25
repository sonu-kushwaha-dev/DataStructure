package com.app.simplequeue;

public class LinkedListBasedSimpleQueue<T> {

	Node<T> front, rear;

	public LinkedListBasedSimpleQueue() {
		this.front = null;
		this.rear = null;
	}

	public boolean isEmpty() {

		if (front == null || rear == null) {
			return true;
		}

		else {
			return false;
		}
	}

	public void enQueue(T data) {
		Node<T> newNode = new Node<T>(data);

		if (isEmpty()) {
			rear = front = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	public T deQueue() {

		if (isEmpty()) {
			System.out.println("Queue is empty,Can't de queue element");
			return null;
		}

		else {

			T data = front.data;
			front = front.next;
			if (front == null)
				rear = null;
			return data;
		}
	}

	public void display() {

		if (isEmpty()) {
			System.out.println("Queue is empty, no data to display");
		} else {
			Node<T> curr_node = front;
			while (curr_node != null) {
				System.out.println(curr_node.data + " ");
				curr_node = curr_node.next;
			}
		}
	}

	public static void main(String[] args) {

		LinkedListBasedSimpleQueue<Integer> queue = new LinkedListBasedSimpleQueue<>();

		queue.display();
		queue.enQueue(12);
		queue.enQueue(13);
		queue.enQueue(14);
		queue.enQueue(15);
		queue.display();
		System.out.println("De queue element");
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.display();
	}
}
