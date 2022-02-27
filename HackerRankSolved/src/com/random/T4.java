package com.random;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(82,49, 82, 82, 41, 82, 15, 63, 38, 25);
		int birthdayCakeCandles = birthdayCakeCandles(list);
		
		System.out.println(birthdayCakeCandles);
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		
		Collections.sort(candles);
		int max=candles.get(candles.size()-1),c=0;
		
		System.out.println(candles);
		
		for(int i=candles.size()-1;i>=0;i--)
		{
			if(candles.get(i)!=max)
			{
				continue;
			}
			else
			{
				c++;
			}
				
		}
		
		
        return c;
	}

}
