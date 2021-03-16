package com.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {

	public static void main(String[] args) {

		List<Integer> s = new ArrayList<Integer>(Arrays.asList(2,2,1,3,2));
		
		birthday(s,4,3);
	}
	
	
	static int birthday(List<Integer> s, int d, int m) {
	
		ArrayList<Integer> list = (ArrayList<Integer>)s;
		int sum = 0,c=0;
	    for(int i=0;i<=s.size()-m;i++)
	    {
	    	sum=0;
	    	for(int j=i;j<i+m;j++)
	    	{
	    		sum = sum + list.get(j);
	    		System.out.println("i :: "+i+"      j :: "+j+"      sum :: "+sum);
	    	}
	    	if(sum==d)
	    	{
	    		c++;
	    	}
	    }
		System.out.println(c);
		return c;
	}
}



//static int birthday(List<Integer> s, int d, int m) {
//
//    for(int i=0;i<s.size();i++)
//    {
//    	for(int j=i+1;j<s.size();j++)
//    	{
//    		if(s.get(i)+s.get(j) == d)
//    		{
//    			System.out.println(s.get(i)+" +  "+s.get(j));
//    		}
//    	}
//    }
//	
//	return 0;
//}