package com.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

	public static void main(String[] args) {
		
		List<Integer> scores = Arrays.asList(10 ,5 ,20 ,20 ,4 ,5 ,2 ,25,1);
		breakingRecords(scores);

	}

	public static List<Integer> breakingRecords(List<Integer> scores) {
		
		System.out.println("scores :: "+scores);
		
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,maxCount=0,minCount=0;
		
		List<Integer> res= new ArrayList<Integer>();

		
		for(int i=0;i<scores.size();i++) {
			if(scores.get(i)>max) {
				max = scores.get(i);
				System.out.println("max inside :: "+max);
				maxCount++;
			}
			if(scores.get(i)<min) {
				min = scores.get(i);
				System.out.println("min inside :: "+min);
				minCount++;
			}
		}
	
		System.out.println("max :: "+max+"    maxCount :: "+maxCount);
		System.out.println("min :: "+min+"    minCount :: "+minCount);
		
		res.add(maxCount-1);
		res.add(minCount-1);
		
		System.out.println(res);
		
		return res;
	}

}
