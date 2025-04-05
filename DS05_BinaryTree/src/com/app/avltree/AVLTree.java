package com.app.avltree;

public class AVLTree<T extends Comparable<T>> {

	Node<T> root;

	public AVLTree() {
		this.root = null;
	}

	// sorted key of AVl tree
	public void inOrderTraversal() {
		inOrderTraversal(root);
	}

	public void inOrderTraversal(Node<T> node) {

		if (node == null) {
			return;
		}

		inOrderTraversal(node.left);
		System.out.println("Val : " + node.data);
		inOrderTraversal(node.right);
	}

	public int height(Node<T> node) {

		if (node == null) {
			return -1;
		} else {
			return 1 + Math.max(height(node.left), height(node.right));
		}
	}

	public int getBalancefactor(Node node) {

		if (node == null) {
			return 0;
		}
		return (height(node.left) - height(node.right));
	}

	// Right Right Rotation
	public Node<T> rightRotation(Node<T> z) {

		Node<T> y = z.left;
		Node<T> T3 = y.right;

		y.right = z;
		z.left = T3;
		return y;
	}

	// Left Left Rotation
	public Node<T> leftRotation(Node<T> z) {

		Node<T> y = z.right;
		Node<T> T2 = y.left;

		y.left = z;
		z.right = T2;
		return y;
	}

	// Adding key in AVL tree
	public void insert(T key) {
		root = insert(root, key);
	}

	public Node<T> insert(Node<T> node, T key) {

		if (node == null) {
			return new Node<T>(key);
		}

		else if (key.compareTo(node.data) < 0) {
			node.left = insert(node.left, key);
		} else if (key.compareTo(node.data) > 0) {
			node.right = insert(node.right, key);
		}
		int factor = getBalancefactor(node);

		// left left imbalance (Require right right rotation)
		if (factor > 1 && key.compareTo(node.left.data) < 0) {
			return rightRotation(node);
		}
		// right right imbalance (Require left left rotation)
		if (factor < -1 && key.compareTo(node.right.data) > 0) {
			return leftRotation(node);
		}
		// left right imbalance (Require left right rotation)
		if (factor > 1 && key.compareTo(node.left.data) > 0) {
			Node<T> left = leftRotation(node.left);
			return rightRotation(left);
		}
		// Right Left Imbalance (Require Right Left rotation )
		if (factor < -1 && key.compareTo(node.right.data) < 0) {
			 Node<T> right = rightRotation(node.right);
			 return leftRotation(right);
		}
		
		return node;
	}

	public static void main(String[] args) {

		AVLTree<Integer> tree = new AVLTree<>();

		System.out.println("Adding key in AVL tree");
		tree.insert(30);
		tree.insert(18);
		tree.insert(40);

		System.out.println("Traversing AVL tree");
		tree.inOrderTraversal();

		System.out.println("Heigh : " + tree.height(tree.root));

		System.out.println("Factor : " + tree.getBalancefactor(tree.root));
		System.out.println("Adding a keys");
		tree.insert(16);
		System.out.println("Factor : " + tree.getBalancefactor(tree.root));

		System.out.println("Travesring : ");
		tree.inOrderTraversal();
		System.out.println("Height : "+tree.height(tree.root));
		
		tree.insert(14);
		System.out.println("Factor : " + tree.getBalancefactor(tree.root));

		System.out.println("Travesring : ");
		tree.inOrderTraversal();
		System.out.println("Height : "+tree.height(tree.root));
		
		
	}

}
