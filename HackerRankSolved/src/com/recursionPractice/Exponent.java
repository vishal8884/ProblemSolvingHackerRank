package com.recursionPractice;

public class Exponent {

	public static void main(String[] args) {

		getExponent(2, 3);
	}

	
	
	public static int getExponent(int num,int l)
	{ 
		if(l == 0)                        //base case
			return num;
		
		
		int sol=(int) (num*getExponent(num,l-1));		     //recursive call
		
		System.out.println("num :: "+num+"    exp :: "+l+"    sol :: "+sol);
		
		return sol;
		 
	}
	
	
	
	
	
	
	
	
//	
//	public static long getExponentBig(long num,long exp)
//	{ 
//		if(exp == 0)                        //base case
//			return num;
//		
//		
//		int long=num*getExponent(num,exp-1);		     //recursive call
//		
//		System.out.println("num :: "+num+"    exp :: "+exp+"    sol :: "+sol);
//		
//		return sol;
//		 
//	}
}
