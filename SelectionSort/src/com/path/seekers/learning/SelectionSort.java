package com.path.seekers.learning;

public class SelectionSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int lastUnsortedIndex = (intArray.length - 1); lastUnsortedIndex > 0; lastUnsortedIndex--) {

			int largest = 0;

			for (int i = 1; i <= lastUnsortedIndex; i++) {

				if (intArray[i] > intArray[largest])
					largest = i;

			}

			// here after iterating the loop what we have to do is swap the last value in
			// the unsorted partition

			swap(intArray, largest, lastUnsortedIndex);
		}
		
		for(int element : intArray)
		{
			System.out.println(element);
		}

	}

	private static void swap(int[] array, int largest, int lastUnsortedIndex) {

		int temp = array[largest];
		array[largest] = array[lastUnsortedIndex];
		array[lastUnsortedIndex] = temp;

	}
}
