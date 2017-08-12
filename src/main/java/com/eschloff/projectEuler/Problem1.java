package com.eschloff.projectEuler;

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
