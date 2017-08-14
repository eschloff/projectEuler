package com.eschloff.projectEuler;

import java.util.ArrayList;

//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
		
public class Problem3 {
	
	public static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println(largestPrimeFactor(600851475143L));
	}

	public static int largestPrimeFactor(long n) {
		int i = 2;
		primes.add(i);
		ArrayList<Integer> factors = new ArrayList<Integer>();

		while (n != 1) {
			if (isPrime(i)) {
				primes.add(i);
				while (n % i == 0) {
					n = n/i;
					factors.add(i);
				}
			}
			i++;
		}
		
		return factors.get(factors.size()-1);
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
