package com.recursionPractice;

public class PrintNumberUsingRecursion {

	public static void main(String[] args) {

		num(10);
	}
	
	
	
	public static void num(int n)
	{
		if(n==20)              // base case
			return;
		
		System.out.println("n :: "+n);     //actual work
		 
		
		num(n+1);                     //recursive call
	}

}
