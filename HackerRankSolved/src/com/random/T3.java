package com.random;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(254961783,604179258, 462517083, 967304281, 860273491);
		miniMaxSum(list);
	}

	public static void miniMaxSum(List<Integer> arr) {

		long minSum=0,maxSum=0;
		
		Collections.sort(arr);
		
		for(int i=0;i<arr.size();i++)
		{
			if(i<arr.size()-1)
			minSum=minSum+arr.get(i);
			
			if(i>0)
			maxSum=maxSum+arr.get(i);
		}
		
		System.out.println(minSum+" "+maxSum);
		
	}

}
