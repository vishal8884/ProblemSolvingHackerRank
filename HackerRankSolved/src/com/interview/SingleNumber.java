package com.interview;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {

		int[] arr = { 4, 1, 2, 1, 2 };
		int[] arr2= {1,3,1,-1,3};
		int res=singleNumber(arr2);
		System.out.println("res :: "+res);

	}

	public static int singleNumber(int[] arr) 
	{
        int c=0,res=0,c2=0;
        int n=arr.length;
		Arrays.sort(arr);
		
		System.out.println("arr :: "+Arrays.toString(arr));
		
		for(int i=0;i<n-1;i++)
		{
			if((c%2==0)&&(arr[i]!=arr[i+1]))                   //this is to check all condition except last
			{
				res=arr[i];
				System.out.println("arr[i] :: "+arr[i]+"   i :: "+i+"    c :: "+c);
				c2++;
				break;
			}
			c++;
		}
		
		
		if((c2==0)&&(arr[n-1]!=arr[n-2]))                       //this is to check the last element
			res=arr[n-1];
		
		return res;
	}

}
