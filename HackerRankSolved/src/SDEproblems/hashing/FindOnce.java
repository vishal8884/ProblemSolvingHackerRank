package SDEproblems.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindOnce {

	public static void main(String[] args) {

		int[] arr = { 1, 7, 4, 3, 4, 8, 7 };
		findOnce(arr, arr.length);
	}

	public static int findOnce(int arr[], int n) {

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				int val = map.get(arr[i]);
				val++;
				map.put(arr[i], val);
			} else {
				map.put(arr[i], 1);
			}
		}

		System.out.println("map :: " + map);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1)
				return entry.getKey();
		}

		return -1;
	}

}
