package com.ownIdeas;

public class Fibonacci {

	public static void main(String[] args) {

		int res = fib2(8);
		System.out.println(res+"  res");
	}
	
	public static int fib(int n)
    {
        if (n <= 1)
           return n;
     return fib(n-1) + fib(n-2);
    }
	
	
	
	 public static int fib2(int n)
	    {
	        int num1 = 0, num2 = 1;
	  
	        int counter = 0;
	  
	        // Iterate till counter is N
	        while (counter < n) {
	  
	            // Print the number
	            System.out.print(num1 + " ");
	  
	            // Swap
	            int num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	            counter++;
	        }
	        System.out.println();
	        return num1;
	    }

}
