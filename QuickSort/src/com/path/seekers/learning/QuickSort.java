package com.path.seekers.learning;

public class QuickSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		quickSort(intArray, 0, intArray.length);

		for (int element : intArray) {
			System.out.println(element);
		}
	}

	private static void quickSort(int[] input, int start, int end) {

		// this check is for 1 element
		if (end - start < 2)
			return;

		// this will return the index after sorting where everything left to pivot is
		// smaller and right to pivot is larger than pivot
		int pivotIndex = partition(input, start, end); // due to this we have put the pivot into it's correct position
		quickSort(input, start, pivotIndex); // this will deal with the left subarray
		quickSort(input, pivotIndex + 1, end); // this will deal with the right subarray

	}

	private static int partition(int[] input, int start, int end) {

		// this is using the first element as pivot i.e. 20

		int pivot = input[start]; // this will change according the input will get change as partition will be
									// done
		int i = start;
		int j = end;

		// here i will traverse from left to right and j will traverse from right to
		// left
		while (i < j) // because if i > j that means they have crossed
		{

			// Note : empty loop body because to check whether value at j is greater than
			// pivot and this loop will break if value at j will be less than pivot and this
			// loop will first break at -22 value of j
			while (i < j && input[--j] >= pivot)
				;

			// loop has been successfully executed till end or with some condition it breaks
			// and if breaks than we have to check whether i is less than j because might be
			// loop will break due to the crossed condition of i < j
			if (i < j) {
				input[i] = input[j];
			}

			// Note: empty loop body
			while (i < j && input[++i] <= pivot)
				;
			if (i < j) {
				input[j] = input[i];
			}

		}
		input[j] = pivot;
		return j;

	}

}
