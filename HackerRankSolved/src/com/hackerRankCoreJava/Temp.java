package com.hackerRankCoreJava;

import java.util.ArrayList;
import java.util.List;

public class Temp {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(0);
		list.add(-1);
		list.add(-1);
		
		plusMinus(list);
	}
	
	
	 public static void plusMinus(List<Integer> arr) {
		    // Write your code here
		    
		    long pos=0,neg=0,zero=0;
		    
		    double posRatio=0,negRatio=0,zeroRatio=0;
		    
		    for(Integer i : arr)
		    {
		        if(i>0)
		          pos++;
		        if(i<0)
		          neg++;
		        if(i==0)
		          zero++;    
		    }
		    
		    posRatio=pos/arr.size();
		    negRatio=neg/arr.size();
		    zeroRatio= zero/arr.size();
		    
		    System.out.printf("%6f%n",(double)pos/arr.size());
		    System.out.printf("%6f%n",(double)neg/arr.size());
		    System.out.printf("%6f%n",(double)zero/arr.size());

		    }

		}
