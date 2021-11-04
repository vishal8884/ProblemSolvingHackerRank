package com.interview.strings.easy;

public class ReverseInteger {

	public static void main(String[] args) {

		reverse(123);
	}
	
    public static int reverse(int x) {
        
    	int rev=0,digit=0;
    	while(x!=0)
    	{
    		digit = x%10;
    		rev=rev*10+digit;
    		System.out.println("digit :: "+digit+"   rev :: "+rev);
    		x=x/10;
    	}
    	
    	return 0;
    }

}
