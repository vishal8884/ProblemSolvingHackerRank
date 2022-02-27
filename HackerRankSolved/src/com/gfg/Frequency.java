package com.gfg;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter arr size");
//		int arrSize = sc.nextInt();
//		
//		
//        int[] arr = new int[arrSize];
//
//        System.out.println("Enter array elements");
//        for(int i=0;i<arrSize;i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//        
//        
//        System.out.println("Enter number rof l and r");
//        int noOfLandR=sc.nextInt();
//        
//        System.out.println("Enter values of l and r");
//        for(int i=0;i<noOfLandR;i++)
//        {
//        	int l =sc.nextInt();
//        	int r= sc.nextInt();
//        	
//        	int op= getFreq(arr, l, r);
//        	System.out.println("op :: "+op);
//        }
		
		
		
		int[] arr = {4 ,4 ,6 ,5,3 ,3 ,3 ,9};
           
		int res=getFreq(arr, 1, 4);
		
		System.out.println("res :: "+res);
	}
	
	
	public static int getFreq(int[] arr,int l,int r)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if((i!=arr.length-1) && arr[i]==arr[i+1])
			{
				if(!map.containsKey(arr[i]))
				{
					map.put(arr[i],1);
				}
				else
				{
					int val = map.get(arr[i]);
					val++;
					map.put(arr[i],val);
				}
			}
			else
			{
				if(!map.containsKey(arr[i]))
				{
					map.put(arr[i],1);
				}
				else
				{
					int val = map.get(arr[i]);
					val++;
					map.put(arr[i],val);
				}
			}
		}

		Collection<Integer> freqOfNumbers = map.values();
	
		
		System.out.println("map :: "+map);

		int sum=0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			int freq = entry.getValue();
			if(freq>=l && freq<=r)
			{
				int mul = entry.getKey()*entry.getValue();
				sum=sum+mul;
			}
		}
		
		return sum;
	}

}
