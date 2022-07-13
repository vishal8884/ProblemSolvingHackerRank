package com.threeMonthHckerRank.week3;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivision2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2,2,1,3,2);
		birthday(list,4,2);
	}

	public static int birthday(List<Integer> s, int d, int m) {
        for(int i=0;i<s.size();i++) {
           for(int j=i;j<i+m;j++) {
        	   System.out.println("i :: "+i+"     j :: "+j);
           }
           System.out.println();
        }
		
		return -1;
	}

}


//for(int i=0;i<s.size();i++) {
//	for(int j=i;j<s.size();j++) {
//		if(s.get(i)+s.get(j))
//		System.out.println("i :: "+i+"     j :: "+j+"         s.get(i) :: "+s.get(i)+"      s.get(j) :: "+s.get(j));
//	}
//	System.out.println();
//}
//
//return -1;