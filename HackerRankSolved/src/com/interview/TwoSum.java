package com.interview;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = {2,7,11,15};
		int[] res=twoSum(arr,9);
		
		System.out.println("res :: "+Arrays.toString(res));
		
	}

	public static int[] twoSum(int[] arr, int target) {

		int[] res = new int[2];
		int n=arr.length,x=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				System.out.println("i :: "+i+"   j :: "+j);
				if(arr[i]+arr[j]==target)
				{
					res[0]=i;
					res[1]=j;
					return res;
				}
			}
		}
		
		return res;
	}
}
