package com.app;

public class ArraysBasedStacks<T> {

	private int capacity;
	private T stack[];
	private int top;

	@SuppressWarnings("unchecked")
	public ArraysBasedStacks(int capacity) {
		this.capacity = capacity;
		this.top = -1;
		this.stack = (T[]) new Object[capacity];
	}

	public boolean isFull() {
		if (capacity == (top + 1))
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public void push(T data) {

		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		} else {
			stack[++top] = data;
		}
	}

	public T pop() {

		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return null;
		} else {

			return stack[top--];
		}
	}

	public T peek() {

		if (isEmpty()) {
			System.err.println("Stack Underflow");
			return null;
		} else {

			return stack[top];
		}
	}

	public void display() {

		if (isEmpty()) {
			System.out.println("Stack UnderFlow");
		} else {

			for (int i = top; i > -1; i--) {
				System.out.println(stack[i]);
			}
		}
	}

	public static void main(String[] args) {

		ArraysBasedStacks<Integer> stack = new ArraysBasedStacks<>(8);

		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		stack.push(17);
		stack.push(18);
		stack.push(19);
		stack.push(20);

		System.out.println("Peek : " + stack.peek());

		System.out.println("All element of stack");
		stack.display();

		System.out.println("Removing all element of satck");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		System.out.println("pop element from empty stack");
		stack.display();
	}

}
