package com.ownIdeas;

import java.util.Arrays;

public class KthLargest {

	public static void main(String[] args) {

		int[] arr = {5,3,7,2,9,0};
		kLarge(arr,3);
	}
	
	
	public static void kLarge(int[] arr,int k)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Third largest :: "+arr[k-1]);
	}

}
