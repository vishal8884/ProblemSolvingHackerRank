package com.threeMonthHckerRank.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthDay {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(5,2,2,1,5,3,2));
		
		int res = birthday(list,9,2);
		System.out.println("res :: "+res);
	}

	public static int birthday(List<Integer> list, int d, int m) {

		int sum=0,c=0,res=0;
		
		for(int i=0;i<list.size();i++) {
			sum = sum + list.get(i);
			c++;
			System.out.println("i :: "+i+"     sum :: "+sum+"     c :: "+c);
			
			if(c==m) {
				if(sum == d)
					res++;
				i=i-(m-1);
				c=0;
				sum=0;
				System.out.println();
			}
		}
		
		return res;
	}

}
