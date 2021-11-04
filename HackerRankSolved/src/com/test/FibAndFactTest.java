package com.test;

public class FibAndFactTest {
	
	public static void main(String[] args) {
		
		//fact(5);
		System.out.println(fib(2));
		
		System.out.println("exponent ::  "+getExponent(2, 9));
	}
	
	
	public static int fib(int n)
	{
		if(n==0 || n==1)
			return n;
		
		int res= fib(n-1)+fib(n-2);
		return res;
	}
	
	public static int fact(int n)
	{
	
		if(n<=1)
		{
			return n;
		}
		int res=0;
		
		res=n*fact(n-1);
		
		System.out.println("res :: "+res);
		
		return res;
	}
	
	
	public static int getExponent(int n, int p)
	{
		if(p==0)
			return 1;
		
		int exp = n*getExponent(n, p-1);
		
		return exp;
	}

}
