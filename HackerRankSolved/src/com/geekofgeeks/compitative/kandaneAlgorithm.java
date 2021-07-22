package com.geekofgeeks.compitative;

import java.util.Arrays;

public class kandaneAlgorithm {
	
	public static void main(String[] args) {
		
		int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};
		kandane(arr);
	}
	
	
	
	public static void kandane(int[] arr)
	{
		int min=Integer.MIN_VALUE;
		int max=0,sum=0;
		
		System.out.println("arr :: "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			max=max+arr[i];
			
			if(min<max)
				min=max;
			
			if(max<0)
			{
				max=0;
			}
			System.out.println("max :: "+max+"   min :: "+min);	
		}
		
		
		System.out.println("res :: "+min);
	}

}
