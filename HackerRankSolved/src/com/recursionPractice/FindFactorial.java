package com.recursionPractice;

public class FindFactorial {

	public static void main(String[] args) {

		int res=fact(5);
		
		System.out.println("res :: "+res);
	}
	
	
	
	public static int fact(int n)
	{
		if(n<=1)
			return 1;
		
		int prevFact=0,res=0;
		
		prevFact=fact(n-1);
		
		res=n*prevFact;
		
		System.out.println("n :: "+n+"   prev fact :: "+prevFact+"      fact :: "+res);
		
		return res;
	}

}
