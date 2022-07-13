package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseRowAndColumMatrix {

	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> l1 = Arrays.asList(12, 42, 83, 108);
		List<Integer> l2 = Arrays.asList(56, 125, 56, 49);
		List<Integer> l3 = Arrays.asList(15, 78, 101, 43);
		List<Integer> l4 = Arrays.asList(62, 93, 114, 119);

		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		
		reverseColumn(list, 2);
	}
	
	public static List<List<Integer>> reverseColumn(List<List<Integer>> list,int col) {
		
		int x = list.size()-1;
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.get(i).size();j++) {
				if(j==col && i<list.size()/2) {
					int temp = list.get(i).get(j);
					list.get(i).set(j, list.get(x).get(j));
					list.get(x).set(j, temp);
					System.out.println("elem :: "+list.get(i).get(j)+"    temp :: "+temp);
					x--;
				}
			}
		}
		System.out.println("list :: "+list);
		
		return list;
	}

}
