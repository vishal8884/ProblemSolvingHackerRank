package com.gfg.hashing;

import java.util.ArrayList;
import java.util.Collections;

public class CommonElements {

	public static void main(String[] args) {

		ArrayList<Integer> v1 = new ArrayList<Integer>();
		v1.add(3);
		v1.add(4);
		v1.add(2);
		v1.add(2);
		v1.add(4);
		ArrayList<Integer> v2 = new ArrayList<Integer>();
		v2.add(3);
		v2.add(2);
		v2.add(2);
		v2.add(7);
		
		ArrayList<Integer> res = common_element(v1, v2);
		System.out.println("res :: "+res);
	}

	public static ArrayList<Integer> common_element(ArrayList<Integer> v1, ArrayList<Integer> v2) {
		ArrayList<Integer> res = new ArrayList<>();
		Collections.sort(v1);
		Collections.sort(v2);
//		System.out.println("v1 :: "+v1);
//		System.out.println("v2 :: "+v2);
		
		
		for(int i=0;i<v1.size();i++) {
			for(int j=0;j<v2.size();j++) {
				if(v1.get(i) == v2.get(j)) {
					res.add(v1.get(i));
					//System.out.println("v1.get(i) :: "+v1.get(i)+"    v1.get(j) :: "+v1.get(j)+"     i :: "+i+"     j :: "+j);
					break;
				}
			}
			//System.out.println();
		}
		
		
		
		return res;
	}
}
