package com.path.seekers.learning;

public class InsertionSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		// here we have taken firstUnsortedIndex as index 1 (as from index 1 to last
		// they all are in unsorted partition) and index 0 element in
		// sorted partition
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < (intArray.length); firstUnsortedIndex++) {

			int newElement = intArray[firstUnsortedIndex];

			int i;
			for (i = firstUnsortedIndex; (i > 0 && (intArray[i - 1] > newElement)); i--) {
				intArray[i] = intArray[i - 1];
			}

			// here i will alwayz be zero after iterating
			intArray[i] = newElement;

		}

		for (int element : intArray) {
			System.out.println(element);
		}
	}
}
