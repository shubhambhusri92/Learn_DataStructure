package com.path.seekers.learning;

// recusrion is somewhat when a method calls itself multiple time tail recusrion is not supported in java
public class Recursion {

	public static void main(String[] args) {
		int value = recursiveFactorial(3);
		System.out.println(value);
	}

	private static int recursiveFactorial(int num) {

		// this is breaking condition otherwise we 'll get stack overflow exception
		if (num == 0)
			return 1;

		// here this function is calling itself
		return num * recursiveFactorial(num - 1);

	}
}

// Eg. 1! = 1 * 0! = 1
// 2! = 2 * 1 = 2 * 1!
// 3! = 3 * 2 * 1 = 3* 2!

// from above eg. we can easily found that it's calling n * (n-1)!

// Note : the calls made successively will be pushed to call stack and popup from call stack as we start get the results
// Also iterative calls are faster than recursive calls