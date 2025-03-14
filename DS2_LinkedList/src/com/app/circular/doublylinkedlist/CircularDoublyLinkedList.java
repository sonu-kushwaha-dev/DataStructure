package com.app.circular.doublylinkedlist;

public class CircularDoublyLinkedList<T> {

	Node<T> head;

	public CircularDoublyLinkedList() {
		this.head = null;
	}

	public void append(T data) {

		Node<T> newNode = new Node<T>(data);

		if (head == null) {
			head = newNode;
			head.next = head;
			head.pre = head;
		}

		else {
			Node<T> curr_node = head;

			do {
				System.out.println("k");
				curr_node = curr_node.next;
			} while (curr_node.next != head);

			newNode.pre = curr_node;
			newNode.next = curr_node.next;

			curr_node.next = newNode;
			head.pre = newNode;

		}
	}

	public void traversal() {

		if (head == null) {
			System.out.println("No Data");
		} else {
			Node<T> curr_node = head;

			do {
				System.out.print("->" + curr_node.data);
				curr_node = curr_node.next;

			} while (curr_node != head);
		}
	}

	public static void main(String[] args) {

		CircularDoublyLinkedList<Integer> node = new CircularDoublyLinkedList<>();
		node.append(12);
		node.append(13);
		node.append(14);
		node.append(15);
		node.traversal();
	}

}
