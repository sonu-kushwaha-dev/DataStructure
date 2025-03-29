package com.app.deque;

public class Node<T> {
	
	T data;
	Node<T> pre,next;
	
	public Node(T data) {
		super();
		this.data = data;
		this.pre = null;
		this.next = null;
	}
	

}
