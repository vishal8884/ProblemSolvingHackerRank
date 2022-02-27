package com.hackerRankCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class H1 {

	public static void main(String[] args) {

//		long[] arr = {1000000001,1000000002,1000000003,1000000004,1000000005};
//		
//		List<Long> list = Arrays.stream(arr)
//	      .boxed()
//	      .collect(Collectors.toList());
//		
//		
//		long res=aVeryBigSum(list);
//		
//		System.out.println("res :: "+res);
		
		
		List<Integer> l1 = Arrays.asList(11,2,4);
		List<Integer> l2 = Arrays.asList(4,5,6);
		List<Integer> l3 = Arrays.asList(10,8,-12);
		
		List<List<Integer>> list = Arrays.asList(l1,l2,l3);
		
		
		diagonalDifference(list);
		
	}
	
	
	public static int diagonalDifference(List<List<Integer>> arr) 
	{
	    // Write your code here
		int leftDiagonalSum=0,rightiagonalSum=0,diff=0,len=0;
				
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println("arr :: "+arr.get(i)+"          i :: "+i);
			for(int j=0;j<arr.get(i).size();j++)
			{
				if(i==0 &&j==0)
				len=arr.get(i).size()-1;
				System.out.println("i :: "+i+"  j :: "+j+"         l :: "+arr.get(i).get(j));
				if(i==j)
				{
					leftDiagonalSum=leftDiagonalSum+arr.get(i).get(j);
				}
				if(j-i==len)
				{
					System.out.println("len :: "+len+"   rightDiagonalSum :: "+rightiagonalSum);
					rightiagonalSum=rightiagonalSum+arr.get(i).get(j);
					len=len-2;
				}
			}
		}
		
		System.out.println("leftDiagonalSum :: "+leftDiagonalSum+"    rightDiagonalSum :: "+rightiagonalSum);
		
		System.out.println(Math.abs(leftDiagonalSum-rightiagonalSum));
		return -1;

	}
	
	

	public static long aVeryBigSum(List<Long> ar) {
		// Write your code here
		long sum = 0;
		

		 for(Long i : ar)
		 {
			 sum=sum+i;
		 }

		return sum;

	}

}
