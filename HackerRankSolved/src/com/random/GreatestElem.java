package com.random;

public class GreatestElem {

	public static void main(String[] args) {

		int[] arr = {44,3,67,18,82,35,144,23,3,6,4,22,999,32,2,5};
		
		printGreatest(arr);
	}
	
	
	public static void printGreatest(int[] arr)
	{
		int n= arr.length;
		int high=arr[0];
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>high)
			{
				high = arr[i];
				System.out.println("arr[i] :: "+arr[i]+"          high :: "+high);
			}
			
		}
	}

}
