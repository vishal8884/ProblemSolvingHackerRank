package com.recursionPractice;

public class numberToWords {

	static int c=0;
	
	public static void main(String[] args) {
		
		getWords(846);
		
	}
	
	
	public static void getWords(int n)
	{
		c++;
		if(n==0)
			return;         // returns from 8 then 4 and then 6 marked below
        
		String[] arr = {"zero" ,"one" ,"two","three","four","five","six","seven","eight","nine"};
		
		System.out.println(" before number :: "+n%10+"     word :: "+arr[n%10]+"         method called :: "+c+"     n :: "+n);
		
		getWords(n/10);               //after 0 return below steps takes place
//		n=n%10;
		
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
