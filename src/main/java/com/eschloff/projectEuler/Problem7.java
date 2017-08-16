package com.eschloff.projectEuler;

import java.util.ArrayList;

public class Problem7 {

//	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//	What is the 10 001st prime number?
	
	public static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println(nthPrime(10001));
	}

	public static int nthPrime(int n) {
		int i = 2;
		while (primes.size() < n) {
			if (isPrime(i)) {
				primes.add(i);
			}
			i++;
		}
		return primes.get(n-1);
	}
	
	public static boolean isPrime(int n) {
		boolean isNotPrime = false;
		for (int prime : primes) {
			if (n % prime == 0) {
				isNotPrime = true;
				break;
			}
		}
		return !isNotPrime;
	}
}
