package com.eschloff.projectEuler;

import java.util.HashMap;

//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

public class Problem4 {

	public static void main(String[] args) {
		System.out.println(largestPalindrome(3));
//		System.out.println(isPalindrome("98789"));
	}

	public static int largestPalindrome(int n) {
		int rangeMax = (int) Math.pow(10.0, (double) n);
		int rangeMin = (int) Math.pow(10.0, (double) (n-1));
		int largestPalindromeProduct = 0;
		for (int i = rangeMin; i < rangeMax; i++) {
			for (int j = rangeMin; j < rangeMax; j++) {
				int product = i * j;
				if (isPalindrome(Integer.toString(product))) {
					if (product > largestPalindromeProduct) {
						largestPalindromeProduct = product;
					}
				}
				//System.out.println(j);
			}
			//System.out.println(i);
		}

		return largestPalindromeProduct;
	}
	
	public static boolean isPalindrome(String s) {
		if (s.length() == 1 || s.length() == 0) {
			return true;
		} else {
			if (s.charAt(0) == s.charAt(s.length()-1)) {
				return isPalindrome(s.substring(1, s.length()-1));
			} else {
				return false;
			}
		}
	}
}
