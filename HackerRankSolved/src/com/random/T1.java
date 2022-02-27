package com.random;

import java.util.Arrays;
import java.util.List;

public class T1 {

	public static void main(String[] args) {

		insertionSort2(3, Arrays.asList(1, 2, 4, 5, 3));

	}

	public static void insertionSort2(int n, List<Integer> arr) 
	{

		int arrLen= arr.size();
		int lastElem = arr.get(arrLen-1);
		
		List<Integer> arr2 = arr;
		
		
		System.out.println("arr :: "+arr);
		
		if (arr.get(arrLen - 2) > lastElem) 
		{
			arr2.set(arrLen - 1, arr.get(arrLen - 2));
		}
		System.out.println("arr inside :: "+arr+"                        arr.get(i) :: "+arr.get(arrLen - 2)+"    lastElem :: "+lastElem);
		
		for(int i=arrLen-2;i>=0;i--)
		{
			
			if(arr.get(i) > lastElem)    //each time test fails copy the value of lower index to current index
			{
				arr2.set(i,arr.get(i-1));
				System.out.println("arr insideg :: "+arr+"             i :: "+i+"    arr.get(i) :: "+arr.get(i)+"    lastElem :: "+lastElem);
			}
			else
			{
				//System.out.println("i :: "+i+"     arr[i] :: "+arr.get(i));
				arr.set(i,lastElem);
				System.out.println("arr inside :: "+arr+"              i::  "+i+"    arr.get(i) :: "+arr.get(i)+"    lastElem :: "+lastElem);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void insertionSort1(int n, List<Integer> arr) {

		System.out.println("///////////////////////////arr before :: " + arr);
		int len = arr.size(), temp = arr.get(len - 1);

		if (temp < arr.get(len - 2)) {
			arr.set(len - 1, arr.get(len - 2));
		}
		System.out.println("arr inside loop 0:: " + arr);

		for (int i = len - 2; i >= 0; i--) {
			if (arr.get(i) > temp) {
				// System.out.println("i :: "+i+" arr[i] :: "+arr.get(i));
				arr.set(i, arr.get(i - 1));
				System.out.println("arr inside loop :: " + arr + "        i :: " + i);

			} else {
				if (i + 1 < len - 1)
					arr.set(i + 1, temp);
				break;
			}

//			
		}

		System.out.println("arr after  :: " + arr);

	}

	public static int introTutorial(int V, List<Integer> arr) {

		System.out.println("arr :: " + arr);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == V)
				return i;
		}

		return -1;
	}

}
