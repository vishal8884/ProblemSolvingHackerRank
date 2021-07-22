package com.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6,7};
		int[] arr2= {1,100,3,99};  //expected    {3,99,1,100}
		
		rotate(arr,400);
	}
	
	
	public static void rotate(int[] arr,int k)
	 {
		 int n = arr.length; 
		 
		 k=k%arr.length;   //this is done so that it does not exceed k value
		 
		 rev(arr,0,n-1);
		 rev(arr,0,k-1);
		 rev(arr,k,n-1);
		 
		 System.out.println("rotated array 3:: "+Arrays.toString(arr)+"     k :: "+k);
	 }
	
	
	public static void rev(int[] arr,int start,int end)         //imp rev algo
	{
        while(start<end)
        {
        	int temp = arr[start];
        	arr[start]=arr[end];
        	arr[end]=temp;
        	start++;
        	end--;
        }
		
	}
	
	
	
	 
	
	
	
	
	public static void rotateRight(int[] arr,int k)
	{
		for(int i=0;i<k;i++)
		{
			rightRotateByone(arr);
		}
		
		System.out.println("result :: "+Arrays.toString(arr));
	}
	
	public static void rightRotateByone(int[] arr)                          // for right rotate always come from reverse(left rotate but rverse)
	{
		
		int temp = arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		
		arr[0]=temp;
		
	}
	
	
	
	
	
	
	
	
	
	public static void rotate2(int[] arr,int k)
	{
		
		System.out.println("arr before :: "+Arrays.toString(arr));
		
		int n=arr.length;

		ArrayList<Integer> t1= new ArrayList<Integer>();
		ArrayList<Integer> t2= new ArrayList<Integer>();
		
		for(int i=k+1;i<n;i++)
		{
			t1.add(arr[i]);
		}
		
		System.out.println("temp1 :: "+t1);
		
		for(int i=0;i<k+1;i++)
		{
			t2.add(arr[i]);
		}
		System.out.println("temp2 :: "+t2);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void leftRotate(int[] arr,int k)                          //for left rotate come from front
	{
		for(int i=0;i<k;i++)
		{
			leftRotateByOne(arr);
		}
	}

	public static void leftRotateByOne(int[] arr) {

		System.out.println("arr begining :: "+Arrays.toString(arr));
		int temp=0;
		temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		System.out.println("arr ending :: "+Arrays.toString(arr));
	}
}



/*

	
	public static void rev2(int[] arr)
	{
		int n=arr.length,x=0;
		
		int[] temp = new int[arr.length];
		for(int i=n-1;i>=0;i--)
		{
			temp[x++]=arr[i];
		}
		
		System.out.println("reversed arr :: "+Arrays.toString(temp));
	}
	
	

*/