package com.sort;

import java.util.Arrays;

public class QuickSort3 {

	
	
	public static int c=0;
	
	public static void main(String[] args) {

		long[] arr = {2, 3, 4, 5, 6};
		System.out.println("arr before :: "+Arrays.toString(arr));
		
		long res = inversionCount(arr, arr.length);
		
		System.out.println("res :: "+res);
		
	}
	
	public static long inversionCount(long arr[], long N) {
		Long i = new Long(N);
		int high = i.intValue();
		quickSort(arr, 0,high-1);
		
		return c;
	}
	
	public static void quickSort(long[] arr,int low,int high) {
		if(low<high) {
			int pi=partition(arr, low, high);
			System.out.println("arr :: "+Arrays.toString(arr)+"      pi :: "+pi);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	public static int partition(long[] arr,int low,int high) {
		
		long pilot = arr[high];
		int i = low-1;
		
		for(int j=low;j<high;j++) {
			if(arr[j]<pilot) {
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr,i+1,high);
		
		return i+1;
	}
	
	public static void swap(long[] arr,int i,int j) {
		long temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
