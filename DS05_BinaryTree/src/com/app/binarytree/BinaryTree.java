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

	public boolean searchKey(Node<T> root, T key) {

		if (root == null) {
			return false;
		}
		if (root.data.equals(key)) {
			return true;
		}
		return searchKey(root.left, key) || searchKey(root.right, key);
	}

	public boolean updateKey(Node<T> root, T oldKey, T newKey) {

		if (root == null) {
			return false;
		}
		if (root.data.equals(oldKey)) {
			root.data = newKey;
			return true;
		}
		return updateKey(root.left, oldKey, newKey) || updateKey(root.right, oldKey, newKey);
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

		// search key in binary tree
		boolean flag = tree.searchKey(tree.root, 14);
		if (flag)
			System.out.println("\nKey Found");
		else
			System.out.println("\nKey not found");

		// update key with new key value
		boolean flag1 = tree.updateKey(tree.root, 21, 50);
		if (flag1)
			System.out.println("\nKey updated with new key");
		else
			System.out.println("\nKey not found");

		System.out.println("\nupdate binary tree is : ");
		tree.preOrderTraversal(tree.root);

	}

}
