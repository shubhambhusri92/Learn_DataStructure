package com.path.seekers.learning;

public class ShellSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int gap = (intArray.length / 2); gap > 0; gap /= 2) {

			// here we are considering i=gap=3 initialize the loop with this and increment
			// the i
			// we are also taking a variable j which will check for gap initialize with
			// j=i=gap because we don't want to change the vale of i

			for (int i = gap; i < (intArray.length); i++) {

				// this element we have taken for comparing with the gap values
				int newElement = intArray[i];

				int j = i;

				// condition for checking j>= gap means if 3 is the gap this will traverse only
				// for gap values
				while (j >= gap && (intArray[j - gap] > newElement)) {
					intArray[i] = intArray[j - gap];
					j -= gap; // i.e. j= j-gap e.g. if j was initially 6 now it become j = 3 and again it's
								// eligible to traverse one time more
				}

				intArray[j] = newElement; // with this -22 will shift to front of array as here j = 0 because with above
											// loop j = j- gap (3 - 3)

			}

		}

		for (int element : intArray) {
			System.out.println(element);
		}
	}
}
