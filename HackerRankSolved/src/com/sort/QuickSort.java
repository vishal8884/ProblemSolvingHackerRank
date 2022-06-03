package com.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		 int[] arr = {1,52,2,8,4,7,3};
		 quickSort(arr, 0, arr.length-1);
		 
		 System.out.println("Sorted arr :: "+Arrays.toString(arr));
	}

	static void quickSort(int arr[], int low, int high) {
		
		if(low<high) {
			
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi-1);
			quickSort(arr, pi, high);
		}
	}

	static int partition(int arr[], int low, int high) {
		// your code here
		int pivot = arr[high];
		int j = low -1;
		
		for(int i=low;i<high;i++) {
			
			if(arr[i]<pivot) {
				j++;
				swap(arr,j,i);
			}
		}
		swap(arr,j+1,high);
		return j+1;
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
