package com.gs.codingTest;

public class Temp {

	public static void main(String[] args) {

		int d =8;
		int a=3;
		
		String sres = Integer.toString(d)+Integer.toString(a);
		
		int res = Integer.valueOf(sres);
		
		System.out.println(res);
	}
	
	public int addDigit(int a,int b) {
		
		String sres = Integer.toString(a)+Integer.toString(b);
		int res = Integer.valueOf(sres);
		return res;
	}

}
