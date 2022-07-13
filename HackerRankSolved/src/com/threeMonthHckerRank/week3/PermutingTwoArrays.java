package com.threeMonthHckerRank.week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(1,2,2,1);
		List<Integer> b = Arrays.asList(3,3,3,4);
		
		String res = twoArrays(5, a, b);
		System.out.println("res :: "+res);
	}

	public static String twoArrays(int k, List<Integer> a, List<Integer> b) {
		Collections.sort(a);
		Collections.sort(b);
		System.out.println("a :: "+a);
		System.out.println("b :: "+b);
		System.out.println();
		
		int c=0;
		
		for(int i=0;i<a.size();i++) {
			for(int j=i;j<b.size();j++) {
				if(a.get(i)+b.get(j)>=k) {
					if(i!=j) {
					    System.out.println("a :: "+a.get(i)+"    b :: "+b.get(j)+"      matched        b :: "+b+"           swapping i = "+i+"   with j = "+j);
					    swapListElem(b,i,j);
					}
					c++;
					break;
				}
				System.out.println("a :: "+a.get(i)+"    b :: "+b.get(j));
			}
			System.out.println();
		}
		
		System.out.println("a after :: "+a);
		System.out.println("b after :: "+b);
		
		String res = (a.size()==c)?"YES":"NO";
		
		return res;
	}
	
	
	public static void swapListElem(List<Integer> list,int a,int b) {
		int tempa = list.get(a);
		list.set(a,list.get(b));
		list.set(b, tempa);
		
	}

}
