package com.eschloff.projectEuler;

import java.util.ArrayList;
import java.util.HashMap;

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Problem5 {

	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		System.out.println(leastCommonMultiple(20));
	}

	public static int leastCommonMultiple(int n) {
		HashMap<Integer,Integer> factors = new HashMap<Integer,Integer>();
		for (int i=2; i<=n; i++) {
			if (isPrime(i)) {
				primes.add(i);
				factors.put(i, 1);
			} else {
				int p = i;
				for (int prime : primes) {
					int m = 0;
					while (p % prime == 0) {
						m++;
						p = p/prime;
						
					}
					if (factors.get(prime) < m) {
						factors.put(prime, m);
					}
				}
			}
		}
		int product = 1;
		for (int factor : factors.keySet()) {
			product = (int) (product*Math.pow(factor, factors.get(factor)));
		}
		return product;
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
