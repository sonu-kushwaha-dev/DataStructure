package com.app.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> {

	Node<T> root;

	public BinarySearchTree() {
		this.root = null;
	}

	
	public void insert(T val) {
		root = insertNode(root, val);
	}

	private Node<T> insertNode(Node<T> node, T val) {
		if (node == null) {
			return new Node<>(val);
		}
		if (val.compareTo(node.data) < 0 || val.compareTo(node.data) == 0) {
			node.left = insertNode(node.left, val);

		} else if (val.compareTo(node.data) > 0) {
			node.right = insertNode(node.right, val);

		}
		return node;
	}

	public void inOrderTraversal(Node<T> node) {
		if (node == null) {
			return;
		}

		inOrderTraversal(node.left);
		System.out.println("Val : " + node.data);
		inOrderTraversal(node.right);
	}

	public void preOrderTraversal(Node<T> node) {

		if (node == null) {
			return;
		} else {

			System.out.println("Val : " + node.data);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}

	public void postOrderTraversal(Node<T> node) {

		if (node == null) {
			return;
		} else {

			System.out.println("Val : " + node.data);
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
		}
	}

	public void delete(T val) {

		root = deleteNode(root, val);
	}

	public Node<T> deleteNode(Node<T> node, T val) {

		if (node == null) {
			return node;
		}

		if (val.compareTo(node.data) < 0) {
			node.left = deleteNode(node.left, val);
		} else if (val.compareTo(node.data) > 0) {
			node.right = deleteNode(node.right, val);
		}

		else {

			if (node.left == null) {
				return node.right;
			} else if (node.right == null) {
				return node.left;
			} else {

				Node<T> temp = minValueNode(node.right);
				node.data = temp.data;
				node.right = deleteNode(node.right, temp.data);
			}
		}

		return node;
	}

	public Node<T> minValueNode(Node<T> node) {

		while (node.left != null) {
			node = node.left;
		}
		return node;
	}

	public boolean search(T val) {

		Node<T> curr_node = root;

		while (curr_node != null) {

			if (val.compareTo(curr_node.data) < 0) {
				curr_node = curr_node.left;
			}

			else if (val.compareTo(curr_node.data) > 0) {
				curr_node = curr_node.right;
			}

			else if (val.compareTo(curr_node.data) == 0) {
				return true;
			}
		}
		return false;
	}
	
	public void findMinValue(){
		
		Node<T> curr_node =root;
		
		while(curr_node.left !=null) {
			curr_node=curr_node.left;
		}
		
		System.out.println("Min value is : "+curr_node.data);
	}
	
	public int findHeight() {
		return findHeightOfBinaryTree(root);
	}
	
	public int findHeightOfBinaryTree(Node node) {
		
		if(node==null) {
			return -1;
		}
		return 1+ Math.max(findHeightOfBinaryTree(node.left),findHeightOfBinaryTree(node.right));
	}
	
	public void findMaxValue(){
		
		Node<T> curr_node =root;
		
		while(curr_node.right !=null) {
			curr_node=curr_node.right;
		}
		
		System.out.println("Max value is : "+curr_node.data);
	}
	

	public static void main(String[] args) {

		BinarySearchTree<Integer> tree = new BinarySearchTree<>();

		tree.insert(30);
		tree.insert(18);
		tree.insert(45);
		tree.insert(10);
		tree.insert(42);
		tree.insert(67);

		System.out.println("I Order Traversal");
		tree.inOrderTraversal(tree.root);

		System.out.println("Search key 30 in binary tree "+tree.search(30));
		
		System.out.println("Deleting Node 30");
		tree.delete(30);

		System.out.println("In-Order Traversal");
		tree.inOrderTraversal(tree.root);
		
		System.out.println("Search key 30 in binary tree "+tree.search(30));
		
		tree.findMinValue();
		tree.findMaxValue();
		
		System.out.println("Height of binary tree");
		System.out.println("Height : "+tree.findHeight());
		
		tree.insert(19);
		tree.insert(80);
		tree.insert(62);
		tree.insert(61);
		tree.insert(8);
		
		System.out.println("Height of binary tree");
		System.out.println("Height : "+tree.findHeight());
		
		
	}
}
