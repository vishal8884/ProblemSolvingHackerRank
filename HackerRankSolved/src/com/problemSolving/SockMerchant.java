package com.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SockMerchant {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10 ,20, 20, 10, 10, 30, 50, 10, 20);
		
		int res = sockMerchant(list.size(),list);
		
		System.out.println("res :: "+res);
	}

	
	public static int sockMerchant(int n, List<Integer> ar) {

		int c=0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			
		   if(!map.containsKey(ar.get(i))) {
			   map.put(ar.get(i),1);
		   }
		   else {
			   int val=map.get(ar.get(i));
			   val++;
			   map.put(ar.get(i),val);
		   }
		}
		
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue()>=2)
			{
				if(m.getValue()==2)
				   c++;
				else {
					c=c+m.getValue()/2;
				}
			}
			System.out.println("val :: "+m.getKey()+"    c :: "+c);		
		}
		
		System.out.println("map :: "+map);
		
		return c;
	}
	
	
	public static int sockMerchant2(int n, List<Integer> ar) {

		Collections.sort(ar);
		System.out.println("ar :: "+ar);
		int c=0;
		
		for(int i=0;i<n;i++) {
			
			if((i<n-2) && (ar.get(i) == ar.get(i+1)) && (ar.get(i) != ar.get(i+2))) {
				c++;
			}
			System.out.println("ar.get(i) :: "+ar.get(i)+"      i :: "+i+"      c :: "+c);
		}
		
		if(ar.get(n-1) == ar.get(n-2)) {
			c++;
		}
		
		return c;
	}

}
