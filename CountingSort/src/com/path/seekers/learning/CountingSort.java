package com.path.seekers.learning;

public class CountingSort {

	public static void main(String[] args) {

		int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
		countingSort(intArray, 1, 10);

		for (int element : intArray) {
			System.out.println(element);
		}

	}

	private static void countingSort(int[] input, int min, int max) {
		int countArray[] = new int[(max - min) + 1];

		// putting elements in counting array as if element is 5 then index in counting
		// array should be 4th i.e.[input[i] -min]
		for (int i = 0; i < input.length; i++) {
			countArray[input[i] - min]++;
		}

		int j = 0;
		// putting elements back to the array and check eg. if there are 2 2's it will
		// iterate 2 two times and putting one by one in the array

		for (int i = min; i <= max; i++) {
			while (countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;
			}
		}
	}
}
