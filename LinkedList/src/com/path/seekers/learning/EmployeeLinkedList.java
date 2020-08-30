package com.path.seekers.learning;

public class EmployeeLinkedList {

	private EmployeeNode head;

	// defines size of linked list
	private int size;

	// for best performance we should add the element to the beginning so we don't
	// traverse the list looking for an insertion point
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}

	public EmployeeNode removeFromFront() {

		if (isEmpty()) {
			return null;
		}

		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null); // this is not mandatory but for cleaning all references we are doing this and
									// this is optional
		return removedNode;

	}

	// returns size of linked list
	public int getSize() {
		return size;
	}

	// check for list is empty or not
	public boolean isEmpty() {
		return head == null;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}

		System.out.print("null");
	}
}
