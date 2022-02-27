package com.random;

import java.util.Arrays;
import java.util.List;

public class T2 {

	public static void main(String[] args) {

		countApplesAndOranges(7,10,4,12,Arrays.asList(2,3,-4),Arrays.asList(3,-2,-4));
	}

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) 
	{
		int appleCount=0,orangeCount=0;

		for(int i=0;i<apples.size();i++)
		{
			apples.set(i,apples.get(i)+a);
			int apple=apples.get(i);
			if(apple>=s && apple<=t)
				appleCount++;
			System.out.println("apple :: "+apple);
		}
		for(int i=0;i<oranges.size();i++)
		{
			oranges.set(i,oranges.get(i)+b);
			int orange = oranges.get(i);
			if(orange>=s && orange<=t)
				orangeCount++;
			System.out.println("orange :: "+orange);
		}
		
		System.out.println("apples :: "+apples);
		System.out.println("oranges :: "+oranges);
		
		System.out.println("appleCount :: "+appleCount);
		System.out.println("orangeCount :: "+orangeCount);
		
	}

}
