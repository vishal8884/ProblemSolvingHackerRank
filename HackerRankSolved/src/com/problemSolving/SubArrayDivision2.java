package com.problemSolving;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivision2 {

	public static void main(String[] args) {
		
		List<Integer> s = Arrays.asList(1 ,2 ,1, 3, 2);
		
		int[] arr = {1 ,2 ,1, 3, 2};
		
		//SubArraySum(arr, arr.length);
		birthday(s,3,3);

	}


	public static int birthday(List<Integer> s, int d, int m) {
		
		int length = s.size();
	    int numWays = 0, sum = 0;

	    System.out.println(length-m);
	    
	    for(int i = 0 ; i <= (length - m) ; i++)
	    {
	        for(int j = 0 ; j < m ; j++)
	        {
	            sum = sum + s.get(j+i);
	            int t = i+j;
	            System.out.println("i :: "+i+"    j :: "+j+"     i+j :: "+t+"     s[i+j] :: "+s.get(i+j)+"     sum :: "+sum);
	        }
	        if(sum == d)
	        {
	            numWays++;
	        }
	        sum = 0;
	    }
	    
	    System.out.println("numWays :: "+numWays);
	    
	    return numWays;
	}

	
	  public static long SubArraySum(int arr[], int n)
	    {
	        long result = 0,temp=0,c=0;
	      
	        // Pick starting point
	        for (int i = 0; i < n; i ++)
	        {
	            // Pick ending point
	            temp=0;
	            System.out.println("temp made 0");
	            for (int j = i; j < n; j ++)
	            {
	                // sum subarray between current
	                // starting and ending points
	                temp+=arr[j];
	                result += temp ;
	                if(temp==4)
	                	c++;
	                System.out.println("i :: "+i+"     j :: "+j+"      arr[i] :: "+arr[i]+"     arr[j] :: "+arr[j]+"     temp :: "+temp+"    result :: "+result);
	            }
	        }
	        
	        System.out.println(c);
	        
	        return result ;
	    }

}
