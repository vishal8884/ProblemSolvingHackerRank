package com.interview;

import java.util.Arrays;

public class RemoveDublicatesFromSortedArray {

	public static void main(String[] args) {


		int[] arr= {0,0,1,1,1,2,2,3,3,4};
		int[] arr2= {1,1,2};
		int res=removeDuplicates(arr2);
		System.out.println("res :: "+res);
	}

	public static int removeDuplicates(int[] arr) 
	{
		System.out.println("arr :: "+Arrays.toString(arr));
		
        int n=arr.length,x=0,y=0;
        if(n==0) return 0;
        if(n==1) return 1;
        
        int[] temp= new int[n];
        
        for(int i=0;i<arr.length-1;i++)
        {
        	if(arr[i]!=arr[i+1])
        	{
        		temp[x]=arr[i];
        		x++;
        	}
        }
		temp[x]=arr[n-1];
        System.out.println("temp :: "+Arrays.toString(temp));
        
        Arrays.fill(arr,0);
        
        for(int i : temp)
        {
        	arr[y]=i;
        	y++;
        }
        System.out.println("final arr :: "+Arrays.toString(arr)+"      y ::"+x);
        
		return x+1;
	}

}
