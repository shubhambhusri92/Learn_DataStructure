package com.path.seekers.learning;

public class BSTMain {

	public static void main(String[] args) {

		// array must be sorted for BST
		int[] array = { -22, -15, 1, 7, 20, 35, 55, 77 };

		System.out.println("Index for element 1 is " + searchElementIndex(array, 1));
		System.out.println("Index for element 7 is " + searchElementIndex(array, 7));
		System.out.println("Index for element 55 is " + searchElementIndex(array, 55));
		System.out.println("Index for element 888 is " + searchElementIndex(array, 888));

		System.out.println(recursiveBinarySearch(array, -15));
		System.out.println(recursiveBinarySearch(array, 35));
		System.out.println(recursiveBinarySearch(array, 8888));
		System.out.println(recursiveBinarySearch(array, 1));
	}

	private static int searchElementIndex(int[] array, int elementToSearch) {

		// divide the array into two halves
		int start = 0;
		int end = array.length;
		int iterationStatement = 0;

		System.out.println("Element for " + elementToSearch + " starts");
		while (start < end) // bcoz if start == end then we have hit end of array
		{
			System.out.println("Iteration statement -- " + iterationStatement++);
			int midPoint = (start + end) / 2; // first time mid point will come 3
			int element = array[midPoint]; // array[3] is 7
			// compare element with elementToSearch
			if (elementToSearch == element) {
				System.out.println("Element for " + elementToSearch + " ends");
				return midPoint;
			} else if (elementToSearch < element) {
				// search for left side
				end = midPoint;
			} else {
				// search to right side
				start = midPoint + 1;
			}
		}

		System.out.println("Element for " + elementToSearch + " ends");

		return -1;
	}

	public static int recursiveBinarySearch(int[] input, int value) {
		return recursiveBinarySearch(input, 0, input.length, value);
	}

	public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
		if (start >= end) {
			return -1;
		}

		int midpoint = (start + end) / 2;
		System.out.println("midpoint = " + midpoint);

		if (input[midpoint] == value) {
			return midpoint;
		} else if (input[midpoint] < value) {
			return recursiveBinarySearch(input, midpoint + 1, end, value);
		} else {
			return recursiveBinarySearch(input, start, midpoint, value);
		}
	}
}
