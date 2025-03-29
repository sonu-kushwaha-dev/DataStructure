package com.app.binarytree;

public class BinaryTree<T> {

	Node<T> root;

	public BinaryTree() {
		this.root = null;
	}

	// Pre-Order Traversal, In-order Traversal, Post-Order Traversal

	public void preOrderTraversal(Node<T> node) {

		if (node == null) {
			return;
		}

		System.out.println("Node element : " + node.data);
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	public void inOrderTraversal(Node<T> node) {

		if (node == null) {
			return;
		}
		inOrderTraversal(node.left);
		System.out.println("Node Element : " + node.data);
		inOrderTraversal(node.right);
	}

	public void postOrderTraversal(Node<T> node) {

		if (node == null) {
			return;
		}

		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.println("Node Element : " + node.data);
	}

	public static void main(String[] args) {

		System.out.println("Adding element in binary tree \n");
		BinaryTree<Integer> tree = new BinaryTree<>();

		// Level - 0
		// Data Node : 1
		tree.root = new Node<Integer>(10);

		// Level - 1
		// Data Node : 2
		tree.root.left = new Node<Integer>(12);
		tree.root.right = new Node<Integer>(14);

		// Level - 2
		// Data Node : 4
		tree.root.left.left = new Node<Integer>(15);
		tree.root.left.right = new Node<Integer>(16);

		tree.root.right.left = new Node<Integer>(21);
		tree.root.right.right = new Node<Integer>(22);

		
		System.out.println("Pre Order Traversal \n");
		tree.preOrderTraversal(tree.root);

		System.out.println("\n In Order traversal of Binary Tree");
		tree.inOrderTraversal(tree.root);

		System.out.println("\n Post Order traversal of BIary Tree");
		tree.postOrderTraversal(tree.root);

	}

}
