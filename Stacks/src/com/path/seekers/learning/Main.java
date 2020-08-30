package com.path.seekers.learning;

public class Main {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(10);

		stack.push(new Employee("Shubham", "Arora", 123));
		stack.push(new Employee("Ved", "Arora", 345));
		stack.push(new Employee("Anita", "Arora", 345));
		stack.push(new Employee("Rishav", "Madan", 345));
		stack.push(new Employee("Ayush", "Shrivastava", 345));

		System.out.println(stack.peek());

		stack.printStack();
		
		System.out.println("Popped :" + stack.pop());
		
		stack.printStack();
	}
}
