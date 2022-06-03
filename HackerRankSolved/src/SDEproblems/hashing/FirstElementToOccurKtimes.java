package SDEproblems.hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstElementToOccurKtimes {

	public static void main(String[] args) {

		int[] arr = {1, 7, 4, 3, 4, 8, 7};
		int res = firstElementKTime(arr, arr.length, 2);
		
		System.out.println("res :: "+res);

	}

	public static int firstElementKTime(int[] a, int n, int k) {

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(a[i])) {
				int val = map.get(a[i]);
				val++;
				map.put(a[i], val);
			}
			else {
				map.put(a[i],1);
			}
		}
		
		System.out.println("map :: "+map);
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==k) {
				return entry.getKey();
			}
		}
		
		
		return -1;
	}

}
