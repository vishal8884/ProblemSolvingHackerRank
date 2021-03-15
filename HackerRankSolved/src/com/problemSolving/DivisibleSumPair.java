package com.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DivisibleSumPair {

	public static void main(String[] args) {

		squares(24,49);
//		squares(465868129 , 988379794);

	}
	
	
	// Complete the squares function below.
    static int squares(int a, int b) {

    	int numOfSquares = 0;
        int x = 1;
        while(x*x < a)
        	x++;
        while(x*x <= b)
        {
            numOfSquares++;
            x++;
        }
        
        
        return numOfSquares;
    }
	
	
	
	
	
	
//    for(int j=1;j<b;j++)
//	{
//		if(j*j==i) 
//		{
//			c++;
//			System.out.println(c);
//		}
//	}
	
	
	
	
	
	
	

	static void bonAppetit(List<Integer> bill, int k, int b)
	{
       bill.remove(k);
       
       int sum=0;
       for(int i : bill)
       {
    	   sum=sum+i;
       }
       int b1 = sum/2;
       if(b-b1==0)
       {
    	   System.out.println("Bon Appetit");
       }
       else
       {
    	   System.out.println(b-b1);
       }
	}

	
	
	
	
	
	
	
	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

		if (d1 == d2 && m1 == m2 && y1 == y2) {
			return 0;
		}
		if (m1 == m2 && y1 == y2 && d1 != d2) {
			int date = 15 * (d1 - d2);
			return date;
		}
		if (m1 != m2 && y1 == y2) {
			int date = 500 * (m1 - m2);
			return date;
		}
		if (y1 != y2) {
			return 10000;
		}
		return 0;
	}

	static int designerPdfViewer(int[] h, String word) {

		int x = 0, maxval = 0, c = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char i = 'a'; i <= 'z'; i++) {
			map.put(i, h[x]);
			x++;
		}
		System.out.println(map);

		for (int i = 0; i < word.length(); i++) {
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getKey() == word.charAt(i)) {
					c++;
					System.out.println("key :: " + entry.getKey() + "  value :: " + entry.getValue() + "   c ::" + c);
					if (entry.getValue() > maxval)
						maxval = entry.getValue();
				}
			}
		}
		System.out.println(maxval);
		return c * maxval;
	}

	static int migratoryBirds(List<Integer> arr) {

		int max = 0, max_val = 0;
		System.out.println(arr);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int c = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (!map.containsKey(arr.get(i))) {
				map.put(arr.get(i), 1);
			} else {
				int count = map.get(arr.get(i));
				count++;
				map.put(arr.get(i), count);
			}
		}

		System.out.println(map);

		for (int i = 0; i < map.size(); i++) {
			if (map.get(arr.get(i)) > max) {
				max = map.get(arr.get(i));
				max_val = arr.get(i);
			}
		}
		System.out.println("max :: " + max + "   max val :: " + max_val);

		return max_val;
	}

//	 if(map.get(arr.get(i))> max)
//	 {
//		 max = arr.get(i);
//		 System.out.println("max :: "+max);
//	 }

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {

		int max = 0, sum = 0;
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				sum = keyboards[i] + drives[j];
				if (sum <= b && sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max + " the maximum possible is");
		if (max == 0)
			return -1;
		else
			return max;
	}

	static int divisibleSumPairs(int n, int k, int[] arr) {

		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == k || (arr[i] + arr[j]) % k == 0) {
					System.out.println("arr[i] ::" + arr[i] + "  arr[j] ::" + arr[j]);
					c++;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(c);

		return c;
	}
}

//static int getMoneySpent(int[] keyboards, int[] drives, int b) {
//    
//	int max=0,sum=0;
//	for(int i=0;i<keyboards.length;i++)
//	{
//		for(int j=0;j<drives.length;j++)
//		{
//			sum = keyboards[i]+drives[i];
//			if(sum<=b)
//			{
//			System.out.println("keyboard[i] :: "+keyboards[i]+"    drives[i] :: "+drives[i]);
//			if(sum>max)
//				max=sum;
//			}
//		}
//	}
//	if(max==0)
//	return -1;
//	else
//	return max;	
//}