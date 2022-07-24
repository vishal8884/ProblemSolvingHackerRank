package com.threeMonthHckerRank.copy2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArrays {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("ab","ab","abc");
		List<String> queries = Arrays.asList("ab","abc","bc");
		
		List<Integer> res = matchingStrings(strings, queries);
		System.out.println("res :: "+res);
	}

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		// Write your code here
		List<Integer> res = new ArrayList<>();
		int c=0;
		
		for(int i=0;i<queries.size();i++) {
			for(int j=0;j<strings.size();j++) {
				if(queries.get(i).equals(strings.get(j))) {
					c++;
				}
			}
			res.add(c);
			c=0;
		}
		
		return res;
	}

}
