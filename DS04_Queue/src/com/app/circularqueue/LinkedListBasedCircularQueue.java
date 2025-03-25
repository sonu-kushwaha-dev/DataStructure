package com.app.circularqueue;

public class LinkedListBasedCircularQueue<T> {

	Node<T> rear, front = null;

	// isEmpty, enQueue,deQueue,display

	// Checking if the circular is empty or not
	private boolean isEmpty() {
		return front == null;
	}

	// Adding new node to existing or empty circular queue
	private void enQueue(T data) {

		Node<T> newNode = new Node<T>(data);

		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			newNode.next = front;
			rear = newNode;
		}
	}

	// Removing node from existing circular queue.
	private void deQueue() {

		if (isEmpty()) {
			System.out.println("Queue is empty, No records for De-Queue");
		} else {

			if(rear==front) {
				rear=front=null;
			}
			else {
			rear.next = front.next;
			front = front.next;
			}
		}
	}
	
	// This method use to traversal the circular linked list
	private void traversal() {
		
		if(isEmpty()) {
			System.out.println("Circular queue is empty, no node for traversal.");
		}
		
		else {
			Node<T>  curr_node=front;
			do {
				System.out.println(" "+curr_node.data);
				curr_node=curr_node.next;
			} while (curr_node!=front);
		}
	}
	
	public static void main(String[] args) {
		
		LinkedListBasedCircularQueue<Integer> queue = new LinkedListBasedCircularQueue<>();

		// print empty queue
		queue.traversal();

		// Adding ele in queue
		queue.enQueue(12);
		queue.enQueue(13);
		queue.enQueue(14);
		queue.enQueue(15);
		queue.enQueue(16);
		
		// traversing the queue
		queue.traversal();

		// De-queuing the a node.
		queue.deQueue();
		
		System.out.println("Travesring the queue after removing a node.");
		//Traversing the queue;
		queue.traversal();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		
		

		System.out.println("Travesring the queue after removing a node.");
		//Traversing the queue;
		queue.traversal();

		// Adding ele in queue
		queue.enQueue(17);
		queue.enQueue(18);
		
		System.out.println("Travesring the queue .");
		//Traversing the queue;
		queue.traversal();
		
				
	}

}
