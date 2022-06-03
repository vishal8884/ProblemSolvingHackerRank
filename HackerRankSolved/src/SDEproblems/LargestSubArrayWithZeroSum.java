package SDEproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestSubArrayWithZeroSum {

	public static void main(String[] args) {

		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		int res = maxLen(arr, arr.length);

		System.out.println("res :: " + res);
	}

	public static int maxLen(int arr[], int n) {

		int sum=0,c=0,c_max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			sum=0;
			c=0;
			for(int j=i;j<n;j++) {
				c++;
				sum = sum + arr[j];
				if(sum==0) {
					if(c>c_max) {
						c_max=c;
					}
				}
				System.out.println("i :: "+i+"     arr[i] :: "+arr[i]+"      j :: "+j+"      arr[j] :: "+arr[j]+"     sum :: "+sum+"      c :: "+c+"     c_max :: "+c_max);
			}
			System.out.println();
		}
		
		
		return c_max;
	}

	
	
	public static int kandaneAlgo(int arr[], int n) {

		int sum=0,max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			sum = sum + arr[i];
			if(max<sum) {
				max = sum;
			}
			System.out.println("sum :: "+sum+"     arr[i] :: "+arr[i]+"   max :: "+max);
			if(sum<0) {
				sum=0;
			}
		}
		
		
		return max;
	}
//	public static int maxLen(int arr[], int n) {
//
//		int sum = 0, c = 0, maxc = 0;
//		List<Integer> list = new ArrayList<>();
//		for (int i = 0; i < arr.length; i++) {
//			sum = 0;
//			c = 0;
//			maxc = 0;
//			for (int j = i; j < arr.length; j++) {
//
//				sum = sum + arr[j];
//				c++;
//
//				if (c > maxc) {
//					maxc = c;
//				}
//				if (sum == 0) {
//					list.add(maxc);
//					System.out.println("arr[i] :: " + arr[i] + "    arr[j] :: " + arr[j] + "     sum :: " + sum
//							+ "      c :: " + c + "     maxc :: " + maxc);
//				}
//			}
//			System.out.println();
//		}
//
//		System.out.println(list);
//		Collections.sort(list);
//
//		return list.get(list.size() - 1);
//	}

}
