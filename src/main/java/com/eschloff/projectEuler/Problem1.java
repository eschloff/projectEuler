package com.eschloff.projectEuler;

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

public class Problem1 {

	public static void main(String[] args) {
		System.out.print(sumOfMultiples(3,5,1000));
	}
	
	public static int sumOfMultiples(int mult1, int mult2, int max) {
		int currentSum = 0;
		for (int i = 1; i < max; i++) {
			if ((i / mult1 * mult1 == i) || (i / mult2 * mult2 == i)) {
				currentSum += i;
			}
		}
		return currentSum;
	}

}
