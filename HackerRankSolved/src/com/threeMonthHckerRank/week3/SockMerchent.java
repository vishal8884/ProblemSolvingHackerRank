package com.threeMonthHckerRank.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SockMerchent {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1 ,1, 3, 1, 2, 1, 3, 3, 3, 3));
		int res = sockMerchant(list.size(), list);
		
		System.out.println("res :: "+res);
	}

	public static int sockMerchant(int n, List<Integer> ar) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<ar.size();i++) {
			if(!map.containsKey(ar.get(i))){
				map.put(ar.get(i),1);
			}
			else {
				int count = map.get(ar.get(i));
				count++;
				map.put(ar.get(i), count);
			}
		}
		
		System.out.println(map);
		int total=0;
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue()<=1)
				continue;
			else {
				total=total+m.getValue()/2;
				System.out.println("val :: "+m.getValue()+"    m.getValue()%2   :: "+m.getValue()/2+"     total :: "+total);
			}
		}
		
		return total;
	}

}
