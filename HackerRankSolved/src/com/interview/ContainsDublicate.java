package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDublicate {

	public static void main(String[] args) {

		int[] arr= {1,2,3,1};
		boolean res=containsDuplicate(arr);
		System.out.println(res);
	}

	
	public static boolean containsDuplicate(int[] arr)
	{
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i : arr)
			set.add(i);
		
       return set.size()!=arr.length;
	}
	
	
	
	
	
	
	public boolean containsDuplicate3(int[] nums) {
	    Arrays.sort(nums);
	    for (int i = 0; i < nums.length - 1; ++i) {
	        if (nums[i] == nums[i + 1]) return true;
	    }
	    return false;
	}
	
	
	
	
	
	
	
	public static boolean containsDuplicate2(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				   return true;
			}
		}
		
       return false;
	}

}
