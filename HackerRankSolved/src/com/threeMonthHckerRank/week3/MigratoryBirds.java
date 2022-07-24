package com.threeMonthHckerRank.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1,4,4,4,5,3));
		int res = migratoryBirds(list);
		System.out.println("res :: "+res);
	}

	public static int migratoryBirds(List<Integer> ar) {

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
		
		int max=0,maxkey=0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>max) {
				max = entry.getValue();
				maxkey=entry.getKey();
			}
			System.out.println("entry :: "+entry+"    max :: "+max+"     maxkey ::"+maxkey);
		}
		return maxkey;
	}

}
