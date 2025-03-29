package com.app.binarytree;

public class Node<T> {
	T data;
	Node<T> left;
	Node<T> right;

	public Node(T data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
