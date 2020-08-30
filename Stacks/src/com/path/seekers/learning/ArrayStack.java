package com.path.seekers.learning;

import java.util.EmptyStackException;

public class ArrayStack {

	private Employee[] stack;
	private int top;

	// here we are defining the size of array when constructor is called
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}

	// defining a push operation
	public void push(Employee employee) {
		// check whether the size of array gets full
		if (top == stack.length) { // mandatory to check this otherwise ArraysIndexOutOfBoundException we 'll get
			System.out.println("Starting Resizing the Array ---------");

			// if arrays gets full needs to resize it
			Employee[] newArray = new Employee[2 * stack.length];
			// now copy all the elements of previous array to new array
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			// assign the new array to previous one
			stack = newArray;

			System.out.println("Resizing of Array ENds ---------------");
			// Note : here time complexity is O(n) as we are copying all elements from one
			// array to another
		}

		// push the element to top of stack

		stack[top++] = employee; // Note : here time complexity is O(1)
	}

	// defining a pop operation... here we are not taking any argument because stack
	// always works on the top of it so by default
	public Employee pop() {

		// check if the stack is empty or not if empty no need to remove any element
		if (isEmpty())
			throw new EmptyStackException();

		Employee employee = stack[--top]; // here we have taken [--top] because top always consist the value for next
											// element which is yet not added to stack so for removing the element we
											// have to take the last element in the stack which is [top-1]

		stack[top] = null; // setting top element to null
		return employee;
	}

	// defining a peek operation
	public Employee peek() {
		if (isEmpty())
			throw new EmptyStackException();

		return stack[top - 1];
	}

	// defining the size of stack
	public int size() {
		return top;
	}

	// check if the stack is empty or not
	public boolean isEmpty() {
		return top == 0;
	}

	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}
