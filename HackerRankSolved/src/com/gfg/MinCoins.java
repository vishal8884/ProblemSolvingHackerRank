package com.gfg;

import java.util.Arrays;

public class MinCoins {

	public static void main(String[] args) {

		
		int[] arr = {9, 6, 5, 1};
		//int res = findMinCoins(arr, 12);
		
		long res2 = countWays(arr,arr.length, 11);
	    
		System.out.println("res2 :: "+res2);
	}
	
	static long countWays(int S[], int m, int n)
    {
        //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)

        // table[i] will be storing the number of solutions
        // for value i. We need n+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (n = 0)
        long[] table = new long[n+1];

        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)

        // Base case (If given value is 0)
        table[0] = 1;
        System.out.println("table :: "+Arrays.toString(table));
        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++)
        {
            for (int j=S[i]; j<=n; j++)
            {
                table[j] += table[j-S[i]];
                System.out.println("table arr :: "+table[j]);
            }
        }
        
        
        System.out.println("table :: "+Arrays.toString(table));

        
        return table[n];
    }
	
	public static int findMinCoins(int[] arr , int v)
	{
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
			System.out.println("i :: "+i+"    arr[i] :: "+arr[i]+"    sum :: "+sum);
		}
		
		return -1;
	}

}
