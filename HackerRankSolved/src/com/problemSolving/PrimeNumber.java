package com.problemSolving;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {

		getPrimeNumbers(10);

	}

	public static void getPrimeNumbers(int num) {

		List<Integer> primeNumbers = new ArrayList<Integer>();

		for (int i = 2; i < num; i++) {
			int c = 0;
			for (int j = i; j >= 1; j--) {
				System.out.println("i :: " + i + "     j :: " + j);
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2)
				primeNumbers.add(i);
		}

		System.out.println("primeNumbers :: " + primeNumbers);
	}

}
