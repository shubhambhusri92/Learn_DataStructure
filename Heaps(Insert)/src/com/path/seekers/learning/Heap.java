package com.path.seekers.learning;

public class Heap {

	private int[] heap;
	private int size;

	public Heap(int capacity) {
		System.out.println("Defining Capacity");
		heap = new int[capacity];
	}

	public boolean isFull() {
		return size == heap.length;
	}

	public int getParent(int index) {
		System.out.println("Finding Parent");
		return (index - 1) / 2; // no need to use floor as we are using integers nd it'll automatically be round
								// off to lowest whole number
	}

	public void insert(int value) {
		if (isFull()) {
			System.out.println("Heap is Full");
			throw new IndexOutOfBoundsException("Heap is Full");
		}
		heap[size] = value;
		fixHeapAbove(size);
		size++;
	}

	private void fixHeapAbove(int index) {
		System.out.println("Heapifying........");
		int newValue = heap[index];
		while (index > 0 && newValue > heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}

		heap[index] = newValue;
	}

}
