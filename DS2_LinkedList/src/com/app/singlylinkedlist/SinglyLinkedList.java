package com.app.singlylinkedlist;

public class SinglyLinkedList {
	Node head;

	SinglyLinkedList() {
		this.head = null;
	}

// Operation on linked list
// Insertion, Deletion, Traversal, Searching, Updating

	// Adding a element in liked list
	public void insert(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	// Deleting a element from linked list
	public void deleteNode(int data) {

		if (head == null) {
			System.out.println("No Element");

		} else if (head.data == data) {
			head = head.next;
		}

		else {
			Node temp = head;
			Node preNode = head;

			while (temp.next != null) {
				
				if (temp.data == data) {
					preNode.next = temp.next;
					break;
				}
				
				preNode = temp;
				temp = temp.next;
				
				//System.out.println("TEMP"+temp.data+ "pre "+preNode.data);
			}

			if (temp.data == data) {
	//			System.out.println("Last Lement");
//				System.out.println("2nd Data "+preNode.data);
				preNode.next = null;
			}

			else {
				System.out.println("No Element");
			}
		}
	}

	// Traversal of Linked List
	public void traversal() {

		if (head == null) {
			System.out.println("No element");
		} else {

			Node temp = head;

			while (temp.next != null) {
				System.out.println("Element : " + temp.data);
				temp = temp.next;
			}
			System.out.println("Element : " + temp.data);
		}
	}

	public void searching(int data) {

		if (head == null) {
			System.out.println("No Element");
		}

		else {
			Node temp = head;

			while (temp.next != null) {

				if (temp.data == data) {
					System.out.println("Element Found");
				}
				temp = temp.next;
			}

			if (temp.data == data) {
				System.out.println("Element Found");
			} else {
				System.out.println("Element Not Found");
			}
		}
	}
	
	public void update(int data) {

		if (head == null) {
			System.out.println("No Element");
		}

		else {
			Node temp = head;

			while (temp.next != null) {

				if (temp.data == data) {
					System.out.println("Element Found");
					temp.data=data;
				}
				temp = temp.next;
			}

			if (temp.data == data) {
				System.out.println("Element Found");
				temp.data=data;
			} else {
				System.out.println("Element Not Found");
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		SinglyLinkedList node = new SinglyLinkedList();
		
		node.insert(1);
		//node.traversal();
		node.insert(2);
		node.insert(3);
		node.insert(4);
		node.insert(5);
		node.insert(6);
	    node.insert(7);
		node.traversal();
		
		node.deleteNode(1);
		node.traversal();
		
		node.deleteNode(7);
		node.traversal();
		
		node.insert(8);
		node.traversal();
		

	}

}
