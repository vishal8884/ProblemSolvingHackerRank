package com.favourate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfAllCharPresent {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		List<String> list2= Arrays.asList("the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog");
		list.addAll(list2);
		int solve = solve2(list);
		
		System.out.println("solve :: "+solve);
	}
	
	
	 public static int solve2(ArrayList<String> A)
	 {
	        int[] arr = new int[26] ;
	        Arrays.fill(arr,0) ;
	        for(String words : A)
	        {
	            words = words.toLowerCase() ;
	            for(int i = 0; i < words.length(); i++)
	            {
	                arr[(words.charAt(i)) - 'a'] = 1 ;
	            }
	        }

	        for(int i : arr){
	            if(i == 0) return 0 ;
	        }

	        return 1 ;
	    }
	
	public static int solve(ArrayList<String> A) {
        boolean vis[] = new boolean[26];
        for(String x: A){
            for(int i = 0; i < x.length(); ++i)
            {
                vis[x.charAt(i)-'a'] = true;
                System.out.println("i :: "+i+"    vis[x.charAt(i)-'a'] :: "+vis[x.charAt(i)-'a']+"     x.charAt(i) :: "+x.charAt(i));
            }
        }
        for(int i = 0; i < 26; ++i){
            if(!vis[i]){
                return 0;
            }
        }
        return 1;
    }

}
