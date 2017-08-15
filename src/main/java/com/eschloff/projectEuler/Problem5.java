package com.eschloff.projectEuler;

//The sum of the squares of the first ten natural numbers is,
//1^2 + 2^2 + ... + 10^2 = 385
//The square of the sum of the first ten natural numbers is,
//(1 + 2 + ... + 10)^2 = 55^2 = 3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Problem5 {

	public static void main(String[] args) {
		System.out.println(Math.abs(sumOfSquares(100) - squareOfSums(100)));
	}

	public static int sumOfSquares(int n) {
		int sum = 0;
		for (int i=1; i<n; i++) {
			sum += i*i;
		}
		return sum;
	}
	
	public static int squareOfSums(int n) {
		int base = (n+1)*n/2;
		return base*base;
	}
}
