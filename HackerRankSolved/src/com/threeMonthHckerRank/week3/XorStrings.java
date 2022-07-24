package com.threeMonthHckerRank.week3;

import java.util.Scanner;

public class XorStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		getXor(s1, s2);
		//getIndidualXor('1', '1');
	}
	
	public static void getXor(String s1,String s2) {
		
		String res = "";
		for(int i=0;i<s1.length();i++) {
			res=res+getIndidualXor(s1.charAt(i), s2.charAt(i));
		}
		
		System.out.println(res);
		System.out.println(res.length());
	}
	
	
	public static char getIndidualXor(char a, char b) {
		if(a=='0' && b=='0') {
			return '0';
		}
		if(a=='0' && b=='1') {
			return '1';
		}
		if(a=='1' && b=='0') {
			return '1';
		}
		if(a=='1' && b=='1') {
			return '0';
		}
		else 
			return '0';
		
	}

}
