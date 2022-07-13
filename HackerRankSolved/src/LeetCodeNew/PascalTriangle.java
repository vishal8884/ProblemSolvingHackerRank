package LeetCodeNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangle {

	public static void main(String[] args) {

		List<List<Integer>> res = generate(5);
		
		System.out.println("res :: "+res);
	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int[] arr;
		
		for(int i=0;i<numRows;i++) {
			arr = new int[i+1];
			for(int j=0;j<i+1;j++) {
				if(j==0 || j==i) {
					arr[j]=1;
				}
				else {
					arr[j]=res.get(i-1).get(j-1) + res.get(i-1).get(j);
					System.out.println("i :: "+i+"    j :: "+j+"    arr[j] :: "+arr[j]);
				}
			}
			System.out.println();
			List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
			res.add(list);
		}
		
		return res;
	}

}
