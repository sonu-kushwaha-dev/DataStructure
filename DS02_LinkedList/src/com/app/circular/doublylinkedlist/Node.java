package com.app.circular.doublylinkedlist;

public class Node<T> {
	T data;
	Node<T> pre;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.pre = null;
		this.next = null;
	}
}
