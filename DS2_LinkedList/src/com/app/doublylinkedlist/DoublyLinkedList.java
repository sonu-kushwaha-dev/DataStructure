package com.app.doublylinkedlist;

public class DoublyLinkedList<T> {

	Node<T> head;

	public DoublyLinkedList() {
		this.head = null;
	}

	public void append(T data) {

		Node<T> new_node = new Node<>(data);

		if (head == null) {
			head = new_node;
		}

		else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
			new_node.previous = temp;
		}

	}

	public void traversal() {
		if (head == null) {
			System.out.println("No Data");
		} else {
			Node<T> curr_node = head;
			while (curr_node != null) {
				System.out.print("->" + curr_node.data);
				curr_node = curr_node.next;
			}
		}
	}

	public void search(T data) {
		if (head == null) {
			System.out.println("No data");
		} else {
			Node<T> curr_node = head;
			while (curr_node != null) {
				if (curr_node.data.equals(data)) {
					System.out.println("Data Found");
					break;
				}
				curr_node = curr_node.next;
			}
		}
	}

	public void update(T old_data, T new_data) {
		if (head == null) {
			System.out.println("No data");
		} else {
			Node<T> curr_node = head;

			while (curr_node != null) {

				if (curr_node.data.equals(old_data)) {
					curr_node.data = new_data;
					break;
				}
				curr_node = curr_node.next;
			}
		}

	}

	public void delete(T data) {

		if (head == null) {
			System.out.println("No Data");
		}

		else {

			Node<T> curr_node = head;
			
			while(curr_node!=null && !curr_node.data.equals(data)) {
				curr_node=curr_node.next;
			}
			
			if(curr_node==head) {
				head=curr_node.next;
				curr_node.previous=null;
			}
			
			if(curr_node.next!=null) {
				curr_node.previous.next=curr_node.next;
			}
			
			if(curr_node.previous!=null) {
				curr_node.next.previous= curr_node.previous;
			}

		}
	}

	public static void main(String[] args) {

		DoublyLinkedList<Integer> node = new DoublyLinkedList<>();

		System.out.println("Doubly Linked List Values : ");
		node.traversal();
		node.append(12);
		node.append(13);
		node.append(14);
		System.out.println("\nDoubly Linked List Values : ");
		node.traversal();

		node.append(15);
		node.append(16);
		System.out.println("\nDoubly Linked List Values : ");
		node.traversal();
		
		System.out.println("\nDeleting node 14");
		node.delete(14);
		node.traversal();
	}

}
