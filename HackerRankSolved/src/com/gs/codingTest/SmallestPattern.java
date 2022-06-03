package com.gs.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SmallestPattern {

	public static void main(String[] args) {

		int res = findPossibleSmallestNumberMatchingPattern("MM");
		
		System.out.println("res :: "+res);
	}

	static int findPossibleSmallestNumberMatchingPattern(String pattern) {

		int digit =0,y=1;
		int[] arr = new int[pattern.length()+1];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = y;
			y++;
		}
		pattern = pattern +"T";
		System.out.println("arr :: "+Arrays.toString(arr));
		
		System.out.println();
		List<Integer> list = new ArrayList<>();
		int n = arr.length,x=0;
		
		for(int i=0;i<n;i++) {
			
			if(pattern.charAt(x)=='M') {
				if((i!=n-1) && (arr[i]<arr[i+1])) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			else if(pattern.charAt(x)=='N') {
				if((i!=n-1) && (arr[i]>arr[i+1])) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			System.out.println("arr btw :: "+Arrays.toString(arr));
			x++;
		}
		
		System.out.println();
		System.out.println("res arr :: "+Arrays.toString(arr));
		
		String fin = "";
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == arr[i+1] && (i!=arr.length-1)) {
				
			}
		}
		
		 
		
		System.out.println("fin :: "+fin);
		return Integer.valueOf(fin);
	}
	
	static int findPossibleSmallestNumberMatchingPattern2(String pattern) {

		int digit =0;
		List<Integer> list = new ArrayList<>();
		if(pattern.charAt(0)=='M') {
			digit = 2;
		}
		else if(pattern.charAt(0) == 'N') {
			digit = 1;
		}
		list.add(digit);
		
		System.out.println("digit :: "+digit+"     list :: "+list);
		
		int next=0;
		for(int i=1;i<pattern.length();i++) {
			
			if(pattern.charAt(i)=='M') {
				digit = digit+1;
				while(list.contains(digit)) {
					digit++;
				}
				list.add(digit);
			}
			else if(pattern.charAt(i) == 'N') {
				digit = digit-1;
				while(list.contains(digit)) {
					digit--;
				}
				list.add(digit);
			}
			System.out.println("pattern :: "+pattern.charAt(i)+"    next :: "+digit);
		}
		
		System.out.println("digit :: "+digit+"      list :: "+list);
		
		return -1;
	}
	
       public int addDigit(int a,int b) {
		
		String sres = Integer.toString(a)+Integer.toString(b);
		int res = Integer.valueOf(sres);
		return res;
	}

}
