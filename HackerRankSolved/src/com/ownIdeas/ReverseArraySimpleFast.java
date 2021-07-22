package com.ownIdeas;

import java.util.Arrays;

public class ReverseArraySimpleFast {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6};
		rev(arr);
	}

	public static void rev(int[] arr)
	{
		int start=0;
		int temp=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			System.out.println("temp :: "+temp+"   start :: "+start+"   end :: "+end);
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		System.out.println("reversed array :: "+Arrays.toString(arr));
	}
}
