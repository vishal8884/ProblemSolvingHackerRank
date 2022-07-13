package com.hackerearth;

public class Temp {

	public static void main(String[] args) {

		//rev(10);
		
		revs("123");
	}
	
	public static void revs(String a) {
		for(int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}
	}
	
	public static void rev(int a) {
		System.out.println(a);
		
		while(a!=0) {
			int dig=a%10;
			System.out.println("dig :: "+dig);
			a=a/10;
		}
	}

}
