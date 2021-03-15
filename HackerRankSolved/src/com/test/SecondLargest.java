package com.test;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 33, 22, 2, 33, 0 };
		SecondLargest(arr, arr.length);
	}

	public static void SecondLargest(int[] arr, int len) {

		Arrays.sort(arr);
        System.out.println("Sorted array ::"+Arrays.toString(arr));
		for (int i = len - 2; i >= 0; i--) {
			if (arr[i] != arr[len - 1]) 
			{
				System.out.println("the second largest element is :: " + arr[i]);
				break;
			}
		}

	}

//	for (int i = len - 2; i >= 0; i--) 
//	  {
//	    // If the element is not
//	    // equal to largest element
//	    if (arr[i] != arr[len - 1]) 
//	    {
//	    	System.out.println("Second largest element is ::"+arr[i]);
//	    }
//	  }

	static void print2largest(int arr[], int arr_size) {
		int i, first, second;

// There should be 
// atleast two elements
		if (arr_size < 2) {
			System.out.printf(" Invalid Input ");
			return;
		}

// Sort the array
		Arrays.sort(arr);

// Start from second last element
// as the largest element is at last
		for (i = arr_size - 2; i >= 0; i--) {
// If the element is not
// equal to largest element
			if (arr[i] != arr[arr_size - 1]) {
				System.out.printf("The second largest " + "element is %d\n", arr[i]);
				return;
			}
		}

		System.out.printf("There is no second " + "largest element\n");
	}

}
