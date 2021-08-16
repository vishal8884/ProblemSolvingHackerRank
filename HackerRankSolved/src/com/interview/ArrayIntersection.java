package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayIntersection {

	public static void main(String[] args) {

		int[] arr1= {4,9,5};
		int[] arr2= {9,4,9,8,4};
		
		int[] arr3= {1,2,2,1};
		int[] arr4= {2};
		
		intersect(arr1,arr2);
		
	}
	
	
	public static int[] intersect(int[] arr1, int[] arr2) 
	{
		
		System.out.println("arr1 :: "+Arrays.toString(arr1));
		System.out.println("arr2 :: "+Arrays.toString(arr2));
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{	
				 if(!map.containsValue(j))
				 map.put(i,j);
				}
			}
		}
		
		System.out.println("map :: "+map);
		int[] res= new int[map.size()];
		int x=0;
		
		 for (Map.Entry<Integer,Integer> entry : map.entrySet())
		 {
			    res[x++]=arr1[entry.getKey()];
		 }
		
		 System.out.println("res :: "+Arrays.toString(res));
		 
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] intersect2(int[] arr1, int[] arr2) 
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println("arr1 :: "+Arrays.toString(arr1));
		System.out.println("arr2 :: "+Arrays.toString(arr2));
		
		int prev=0,x=0;
		List<Integer> reslist = new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println("i :: "+i+"     j :: "+j );
					reslist.add(arr1[i]);
					break;
				}
			}
		}
		
		System.out.println("reslist :: "+reslist);
		
		int[] res= new int[reslist.size()];
		
		for(int i : reslist)
			res[x++]=i;
		
		return res;
	}


}


//if((i!=prev)&&(arr1[i]==arr2[j]))