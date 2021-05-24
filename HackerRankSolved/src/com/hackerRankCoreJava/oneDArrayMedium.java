package com.hackerRankCoreJava;

public class oneDArrayMedium {

	public static void main(String[] args) {

		int[] arr = {0,1,1,0,0,1,1,0,1};
		int[] arr2 = {0,0,1,1,1,0};
		int[] arr3 = {0,1,0};
		boolean a=canWin(1,arr3);
		System.out.println(a);
		
	}
	
	// good one copied
	private static boolean isSolvable(int leap, int[] game, int i) {
	    // Base Cases
	    if (i >= game.length) {
	        return true;
	    } else if (i < 0 || game[i] == 1) {
	        return false;
	    }
	            
	    game[i] = 1; // marks as visited

	    // Recursive Cases
	    return isSolvable(leap, game, i + leap) || 
	           isSolvable(leap, game, i + 1) || 
	           isSolvable(leap, game, i - 1);
	}
	
	public static boolean canWin2(int leap, int[] game) {
	    return isSolvable(leap, game, 0);
	}
	 // my own still passes most of casses
	 public static boolean canWin(int leap, int[] arr) {

	        int n=arr.length;
	        int m=n-1;
	        boolean insidei=false;
	        int i=0;
	        while(i<n)
	        {
	           if(i+1>m || i+leap>m)
	           {
	        	   return true;
	           }
	           if((i+1<n)&&(arr[i+1]==0)&&(insidei==false))
	           {
	        	   i=i+1;
	           }
	           else if((i+leap<n)&&(arr[i+leap]==0))
	           {
	        	   i=i+leap;
	        	   insidei=false;
	           }
	           else
	           {
	        	   if((i-1>=0)&&(arr[i-1]==0))
	        	   {
	        		   i=i-1;
	        		   insidei=true;
	        	   }
	        	   else
	        	   {
	        		   return false;
	        	   }
	           }
	           System.out.println("i :: "+i);
	        }
	        
	        return false;
	    }

}
