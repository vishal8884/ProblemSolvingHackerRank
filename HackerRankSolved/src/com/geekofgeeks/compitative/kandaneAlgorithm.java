package com.geekofgeeks.compitative;

import java.util.Arrays;

public class kandaneAlgorithm {
	
	public static void main(String[] args) {
		
		int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};
		kandane(arr);
	}
	
	
	
	public static void kandane(int[] arr)
	{
		int max_so_far=Integer.MIN_VALUE;
		int max_ending_here=0,sum=0;
		
		System.out.println("arr :: "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			max_ending_here = max_ending_here + arr[i];
			
			if(max_ending_here>max_so_far)
				max_so_far=max_ending_here;
			
			if(max_ending_here<0)
			{
				max_ending_here=0;
			}
			System.out.println("max_ending_here :: "+max_ending_here+"   max_so_far :: "+max_so_far);	
		}
		
		
		System.out.println("res :: "+max_so_far);
	}

}
