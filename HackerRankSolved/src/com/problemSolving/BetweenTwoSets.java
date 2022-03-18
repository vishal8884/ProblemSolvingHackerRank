package com.problemSolving;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(12, 18);
		List<Integer> b = Arrays.asList(16, 32, 96);

		getTotalX(a, b);
		getPrimeNumber();

	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {

		// find LCM of a

		// find HCF of b

		return -1;
	}

	public static void getPrimeNumber() {
		int i = 0;
		int num = 0;
		// Empty String
		String primeNumbers = "";

		for (i = 1; i <= 100; i++) {
			int counter = 0;    // it should increse to to 2 because each number can devide by itself or 0
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}

}
