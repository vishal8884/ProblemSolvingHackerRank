package com.problemSolving;

public class karpekarNumbers {

	public static void main(String[] args) {

		kaprekarNumbers(1,100);
		
	}
	

	public static void kaprekarNumbers(int p, int q) 
	{
   
		int square=0,digit=0,sum1=0,sum2=0;
		String squares="";
		for(int i=p;i<=q;i++)
		{
			sum1=0;
			square=i*i;
			squares=Integer.toString(square);
			
			sum1=getSum1(squares);
			sum2=getSum2(squares);
			
			//if(sum==i)
			System.out.println("i :: "+i+"   square :: "+square+"    squares :: "+squares+"   sum1 :: "+sum1+"    sum2 :: "+sum2);
			
	
		}
		
	}
	
	

	public static int getSum1(String s)
	{
		int x=0,sum1=0;
		for(int i=0;i<s.length()/2;i++)
		{
			x=Integer.parseInt(String.valueOf(s.charAt(i)));
			sum1=sum1+x;
			//System.out.println("i :: "+i+"   x :: "+x+"    sum1 :: "+sum1);
		}
		
		sum1=0;

		return sum1;
	}
	
	public static int getSum2(String s)
	{
		int sum2=0,x=0;
		for(int i=s.length()/2;i<s.length();i++)
		{
			x=Integer.parseInt(String.valueOf(s.charAt(i)));
			sum2=sum2+x;
			//System.out.println("i :: "+i+"   x :: "+x+"    sum :: "+sum2);
		}
		return sum2;
	}
	
	

}










/*
public static int getSum(String s)
	{
		int x=0,sum=0;
		for(int i=0;i<s.length();i++)
		{
			x=Integer.parseInt(String.valueOf(s.charAt(i)));
			sum=sum+x;
			System.out.println("i :: "+i+"   x :: "+x+"    sum :: "+sum);
		}
		
		return sum;
	}
*/