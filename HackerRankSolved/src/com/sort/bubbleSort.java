package com.sort;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		
		int[] arr = {11,2,33,5,44};
		//bulbbleSort(arr);
		bubbleSort(arr);
	}
	
	
	
	
	public static void bubbleSort(int[] arr)
	{
		System.out.println("Arr :: "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<arr.length;j++)
			{
				//System.out.println("i :: "+i+"    j :: "+j+"     arr[i] :: "+arr[i]+"     arr[j] :: "+arr[j] );
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Arrays after sorting :: "+Arrays.toString(arr));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void bulbbleSort(int[] arr)
	{
		System.out.println("Arrays before sort :: "+Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.println("i :: "+i+"    j::"+j);
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Arrays after sorting ::"+Arrays.toString(arr));
	}

}
