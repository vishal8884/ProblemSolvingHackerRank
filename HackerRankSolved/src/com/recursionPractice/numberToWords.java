package com.recursionPractice;

public class numberToWords {

	public static void main(String[] args) {
		
		getWords(842);
		
	}
	
	
	public static void getWords(int n)
	{
		
		if(n==0)
			return;

		String[] arr = {"zero" ,"one" ,"two","three","four","five","six","seven","eight","nine"};
		
		getWords(n/10);
		n=n%10;
		
        System.out.println("number :: "+n%10+"     word :: "+arr[n%10]);		

		
	}
	
	
	
	
	
	
	
	
	
	
	

	
	public static String getWords2(int n)
	{
		
		String[] arr = {"zero" ,"one" ,"two","three","four","five","six","seven","eight","nine"};
		
		if(n<10)
			return arr[n];
		
		while(n!=0)
		{
			int digit=n%10;
			n=n/10;
			System.out.println("digit :: "+digit);
		}
		
		return "no";
		
	}
}
