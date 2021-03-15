package com.test;

import java.util.Arrays;

public class sum67 {

	public static void main(String[] args) {

		int[] arr2 = {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7};
//		int[] arr = {1, 1, 6, 7, 2};
		sum67(arr2);
	}
	
	public static int sum67(int[] nums) {
		  int sum = 0;
		  boolean stop = false;
		  
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] == 6)
		      stop = true;
		    if (stop == false) {
		      sum += nums[i];
		      System.out.println("sum ::"+sum+"  nums[i] ::"+nums[i]);
		    }
		    if (nums[i] == 7 && stop == true)
		      stop = false;
		  }
		  return sum;
		}

}






//public static void sum67(int[] arr)
//{
//	System.out.println(Arrays.toString(arr));
//	int sum = 0,c=0;
//	boolean six= false;
//	boolean seven = false;
//	for(int i=0;i<arr.length;i++)
//	{
//		if(arr[i]==7 && six==true)
//		{
//			six=false;
//			seven=true;
//		}
//		if(arr[i]==6)
//		{
//			six=true;
//			c++;
//			continue;
//		}
//		if(!six) {
//		sum=sum+arr[i];
//		System.out.println("sum ::"+sum+"   arr[i] ::"+arr[i]);
//		}
//		
//		
//	}
//	int res = sum - (7*c);
//	System.out.println("final sum :: "+res);
//}




//
//
//public static void sum67(int[] arr)
//{
//	int sum = 0;
//	boolean six= false;
//	boolean seven = false;
//	for(int i=0;i<arr.length;i++)
//	{
//		if(arr[i]==7 && six==true)
//		{
//			six=false;
//			seven=true;
//		}
//		if(arr[i]==6)
//		{
//			six=true;
//			continue;
//		}
//		if(!six && arr[i]!=7) {
//		sum=sum+arr[i];
//		System.out.println("sum ::"+sum+"   arr[i] ::"+arr[i]);
//		}
//	}
//	
//}