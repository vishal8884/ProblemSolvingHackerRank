package com.interview;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {

		int[] arr= {6,0,2,3,0,1};
		moveZeros(arr);
	}

	public static void moveZeros(int[] arr) {

		System.out.println("arr :: "+Arrays.toString(arr));
		int n=arr.length,x=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				//System.out.println("i :: "+i+"     arr[i] :: "+arr[i]);
				arr[x++]=arr[i];
			}
		}
		
		System.out.println("arr between :: "+Arrays.toString(arr)+"    x :: "+x);
		
		for(int i=x;i<n;i++)
			arr[i]=0;
		System.out.println("arr result :: "+Arrays.toString(arr)+"    x :: "+x);
	}

}
