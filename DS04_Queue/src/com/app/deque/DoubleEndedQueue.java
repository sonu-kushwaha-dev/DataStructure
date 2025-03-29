package com.app.deque;

public class DoubleEndedQueue<T> {

	Node<T> front, rear;

	public DoubleEndedQueue() {
		this.front = null;
		this.rear = null;
	}

	// isEmpty, addFront, addRear, deleteFront, deleteRear, traversal

	private boolean isEmpty() {
		return front == null;
	}

	private void addFront(T data) {
		Node<T> newNode = new Node<T>(data);

		if (front == null) {

			front = newNode;
			rear = newNode;
		} else {
			front.pre = newNode;
			newNode.next = front;
			front = newNode;
		}
	}

	private void addRear(T data) {
		Node<T> newNode = new Node<T>(data);

		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			newNode.pre = rear;
			rear = newNode;
		}
	}

	private void deleteFront() {

		if (isEmpty()) {
			System.out.println("Double Ended Queue is Empty");
		}

		else {

			if (rear == front) {
				rear = front = null;
			} else {
				front.next.pre = null;
				front = front.next;
				front.pre = null;
			}
		}
	}

	private void deleteRear() {

		if (isEmpty()) {
			System.out.println("Double Ended Queue is Empty");
		} else {
			if (rear == front) {
				rear = front = null;
			} else {
				rear = rear.pre;
				rear.next.pre = null;
				rear.next = null;
			}

		}
	}

	private void traversal() {

		if (isEmpty()) {
			System.out.println("No element for traversal");
		} else {
			Node<T> curr_node = front;

			while (curr_node != null) {
				System.out.println(" " + curr_node.data);
				curr_node = curr_node.next;
			}
		}
	}

	public static void main(String[] args) {

		DoubleEndedQueue<Integer> queue = new DoubleEndedQueue<>();

		// Traversing the queue
		queue.traversal();

		// adding element at rear end
		queue.addRear(12);
		queue.addRear(13);
		queue.addRear(14);

		// Adding element at front end
		queue.addFront(15);

		// adding element at rear end
		queue.addRear(16);

		// Traversing the queue
		queue.traversal();

		System.out.println("Removing the element from the front. ");
		// Removing element from front
		queue.deleteFront();
		queue.traversal();
		// removing all element from the queue

		System.out.println("Removing the element from the rear.");
		// Removing element from front
		queue.deleteRear();
		queue.traversal();

		System.out.println("Removing the element from the front. ");
		// Removing element from front
		queue.deleteFront();
		queue.traversal();
		// removing all element from the queue

		System.out.println("Removing the element from the rear.");
		// Removing element from front
		queue.deleteRear();
		queue.traversal();

		System.out.println("Removing the element from the rear.");
		// Removing element from front
		queue.deleteRear();
		queue.traversal();

	}

}
