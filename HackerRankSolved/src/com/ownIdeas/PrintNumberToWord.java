package com.ownIdeas;

public class PrintNumberToWord {
	
	
	public static void main(String[] args) {
		printAsWord(961);
	}
	
	
	public static void printAsWord(int x)
	{
        int last=0;
        String num="";  	
        int n=rev(x);
		while(n!=0)
		{
			last=n%10;
			n=n/10;
			System.out.println("last :: "+last +"   n :: "+n);
			
			switch(last)
			{
			case 0:
				num=num+" zero";
				break;
			case 1:
				num=num+" one";
				break;
			case 2:
				num=num+" two";
				break;
			case 3:
				num=num+" three";
				break;
			case 4:
				num=num+" four";
				break;
			case 5:
				num=num+" five";
				break;
			case 6:
				num=num+" six";
				break;
			case 7:
				num=num+" seven";
				break;
			case 8:
				num=num+" eight";
				break;
			case 9:
				num=num+" nine";	
				break;
			}
		}
		System.out.println("num :: "+num);
	}
	
	
	public static int rev(int n)
	{
		int digit=0,rev=0;
		while(n!=0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		
		return rev;
	}

}



