package com.basicsOfDataStructure;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6};
		rev(arr);
	}
	
	
	public static void rev(int[] arr)
	{
		int x=0,y=0;
		int[] narr= new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			narr[x]=arr[i];
			x++;
			
		}
		
		for(int i : narr)
		{
			arr[y]=i;
			y++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
