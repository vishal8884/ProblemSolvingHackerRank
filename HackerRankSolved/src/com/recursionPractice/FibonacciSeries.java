package com.recursionPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fib(5);

	}
	
	
	public static int fib(int n)
	{
		
		if(n==0 || n==1)
			return n;
		
		int res=fib(n-1)+fib(n-2);
		
		System.out.println("res :: "+res+"    n :: "+n);
		
		return res;
	}

}
