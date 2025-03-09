package com.app.singlylinkedlistgeneric;

public class SinglyLinkedList<T> {

	Node<T> head;

	public SinglyLinkedList() {
		this.head = null;
	}

	public void insert(T data) {

		Node<T> newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void traversal() {

		if (head == null) {
			System.out.println("No Element");
		} else {
			Node<T> temp = head;

			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public void search(T data) {

		if (head == null) {
			System.out.println("No Element");
		} else {
			Node<T> temp = head;

			while (temp != null) {
				if (temp.data == data) {
					System.err.println("Element Found");
					break;
				}
				temp = temp.next;
			}
		}
	}

	public void update(T oldData, T newData) {

		if (head == null) {
			System.out.println("No Data");
		} else {

			Node<T> temp = head;

			while (temp != null) {

				if (temp.data == oldData) {
					temp.data = newData;
					break;
				}
				temp = temp.next;
			}
		}
	}

	public void delete(T data) {

		if (head == null) {
			System.out.println("No data");
		} else if (head.data.equals(data)) {
			head = head.next;
		} else {

			Node<T> temp = head;
			Node<T> preNode =null;

			while (temp != null && !temp.data.equals(data)) {
				preNode = temp;
				temp = temp.next;
			}

			if (temp != null ) {
				System.out.println("Data Found");
				preNode.next=temp.next;
			} 
			else {
				System.out.println("No Data");
			}
		}
	}

	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> node = new SinglyLinkedList<>();
		node.insert(1);
		node.insert(2);
		node.insert(3);
		node.traversal();

	}

}
