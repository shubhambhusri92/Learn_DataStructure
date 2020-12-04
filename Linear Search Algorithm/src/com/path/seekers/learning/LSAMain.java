package com.path.seekers.learning;

public class LSAMain {

	public static void main(String[] args) {

		int[] array = { 20, 35, -15, 7, 55, 1, -22 };

		// here length = 7 and index = 6
		System.out.println(findElementInArray(array, -15));
		System.out.println(findElementInArray(array, 8888));
		System.out.println(findElementInArray(array, 1));
		System.out.println(findElementInArray(array, -22));

	}

	private static int findElementInArray(int[] array, int element) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return i;
			}
		}

		return -1;

	}
}
