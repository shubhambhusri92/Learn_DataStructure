package com.path.seekers.learning;

public class Main {

	public static void main(String[] args) {

		ArrayQueue queue = new ArrayQueue(10);

		queue.add(new Employee("Shubham", "Arora", 123));
		queue.add(new Employee("Ved", "Arora", 345));
		queue.add(new Employee("Anita", "Arora", 345));
		queue.add(new Employee("Rishav", "Madan", 345));
		queue.add(new Employee("Ayush", "Shrivastava", 345));

		queue.printQueue();

		queue.remove();
		queue.remove();

		// queue.printQueue();

		System.out.println(queue.peek());

		queue.printQueue();

	}
}
