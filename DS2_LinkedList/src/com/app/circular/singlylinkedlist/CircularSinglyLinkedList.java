package com.app.circular.singlylinkedlist;

public class CircularSinglyLinkedList<T> {

	Node<T> head;

	public CircularSinglyLinkedList() {
		this.head = null;
	}

	public void append(T data) {

		Node<T> newNode = new Node<>(data);

		if (head == null) {
			head = newNode;
			newNode.next = head;

		} else {
			Node<T> curr_node = head;

			while (curr_node.next != head) {
				// System.out.println("Loop"+curr_node.data);
				curr_node = curr_node.next;
			}
			curr_node.next = newNode;
			newNode.next = head;
		}
	}

	public void delete(T data) {

		if (head == null) {

			System.out.println("No Data");
		} else if (head.data.equals(data) && head == head.next) {
			head = null;
		}

		else if (head.data.equals(data) && head != head.next) {

			Node<T> curr_node = head.next;

			do {
				curr_node = curr_node.next;
			} while (curr_node.next != head);

			curr_node.next = head.next;
			head = head.next;
		} else {

			Node<T> curr_node = head;
			Node<T> pre_node = null;

			do {
				pre_node = curr_node;
				curr_node = curr_node.next;
			} while (curr_node.next != head && !curr_node.data.equals(data));

			if (curr_node.data.equals(data)) {
				pre_node.next = curr_node.next;
			} else {
				System.err.println("No Data");
			}
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

		CircularSinglyLinkedList<Integer> node = new CircularSinglyLinkedList<>();

		node.append(12);
		node.append(13);
		node.append(14);
		node.append(15);
		node.append(16);
		node.traversal();
		System.out.println("\n-----------");
		node.delete(12);
		node.append(17);
		node.append(18);
		node.traversal();
		System.out.println("\n-----------");
		node.delete(18);
		node.traversal();

	}

}
