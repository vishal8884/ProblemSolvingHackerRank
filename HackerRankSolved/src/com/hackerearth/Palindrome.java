package com.hackerearth;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String rev = rev(s);
		
		if(s.equals(rev)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

	public static String rev(String s) {

		StringBuilder rev = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			rev.append(s.charAt(i));
		}
		
		return rev.toString();
	}

}
