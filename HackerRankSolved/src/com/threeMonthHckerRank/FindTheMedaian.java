package com.threeMonthHckerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedaian {

	public static void main(String[] args) {

		int res = findMedian(Arrays.asList(5,3,1,2,4));
		System.out.println("res :: "+res);
	}

	public static int findMedian(List<Integer> arr) {
		System.out.println("before sort arr :: "+arr);
		Collections.sort(arr);
		System.out.println("after sort arr "+arr);
		
		int len = arr.size();
		
		int mid = (len-1)/2;
		
		System.out.println(mid);
		
		return arr.get(mid);
	}

}
