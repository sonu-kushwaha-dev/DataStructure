package com.app;

public class ArrayBasedSimpleQueue {

	int rear;
	int front;
	int capacity;
	int[] element;

	public ArrayBasedSimpleQueue(int size) {
		this.rear = -1;
		this.front = -1;
		this.capacity = size;
		this.element = new int[size];
	}

	public boolean isFull() {

		if (rear == capacity - 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {

		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(int ele) {

		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (rear == -1) {
				front++;
			}
			element[++rear] = ele;
		}
	}

	public int deQueue() {
		if (isEmpty()) {
			return -1;
		} else {

			if (rear == front) {
				int data = element[front];
				rear = front = -1;

				return data;
			}

			return element[front++];
		}
	}

	public void display() {

		if (isEmpty()) {
			System.out.println("Queue is empty, No element to display");
		}

		else {

			for (int i = front; i <= rear; i++) {
				System.out.println(element[i] + " ");
			}
		}
	}

	public void trackPointer() {

		System.out.println("front : " + front + " Rear : " + rear);
	}

	public static void main(String[] args) {

		ArrayBasedSimpleQueue q = new ArrayBasedSimpleQueue(3);

		System.out.println("Printing element");
		q.display();

		System.out.println("Adding one element");
		q.enQueue(12);

		System.out.println("Printing element");
		q.display();

		q.enQueue(13);
		q.enQueue(14);

		System.out.println("Printing element");
		q.display();

		System.out.println("Adding one more element");
		q.enQueue(15);
		q.trackPointer();

		System.out.println("Removing a ele");
		System.out.println("DeQueue : " + q.deQueue());
		q.trackPointer();

		System.out.println("Printing element");
		q.display();

		System.out.println("DeQueue : " + q.deQueue());
		System.out.println("Printing element");
		q.display();
		q.trackPointer();

		System.out.println("DeQueue : " + q.deQueue());
		System.out.println("Printing element");
		q.display();
		q.trackPointer();
	}

}
