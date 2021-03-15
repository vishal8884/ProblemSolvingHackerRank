package com.leetcodesolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		int[] arr = {4,3,2,7,8,2,3,1};
		int[] arr2 = {1,1};
		findDisappearedNumbers2(arr2);

	}
	
	public static List<Integer> findDisappearedNumbers2(int[] nums) {
        
   	 List<Integer> list = new ArrayList<Integer>();
   	 
   	 Set<Integer> set = new HashSet<Integer>();
   	 
   	 for(int i : nums)
   		 set.add(i);
   	 
   	 for(int i=1;i<=nums.length;i++)
   	 {
   		 if(!set.contains(i))
   		 {
   			 list.add(i);
   		 }
   	 }
   	 System.out.println(list);
   	 return list;
   }
	
     public static List<Integer> findDisappearedNumbers(int[] nums) {
        
    	 List<Integer> list = new ArrayList<Integer>();
    	 int c=0;
    	 Arrays.sort(nums);
    	 System.out.println(Arrays.toString(nums));
    	 for(int i=1;i<=nums.length;i++)
    	 {
    		 for(int j=0;j<nums.length;j++)
    		 {
    			
    			 if(i!=nums[j])
    			 {
    				 System.out.println("i :: "+i+"   nums[j] :: "+nums[j]);
    				 c++;
    			 }
    		 }
    		 System.out.println();
    		 if(c==nums.length)
    			 list.add(i);
    		 System.out.println("i :: "+i+"  c :: "+c);
    		 c=0;
    	 }
    	 System.out.println(list);
    	 return list;
    }
	
	
	
	
	
	
	
	
	
	public static int thirdMax2(int[] nums) {
		TreeSet<Integer> set = new TreeSet<>();
		for(int i = 0; i < nums.length; i++){
		set.add(nums[i]);
		if(set.size() > 3)
		set.remove(set.first());
		}
		return set.size() == 3 ? set.first() : set.last();
		}
	
    public static int thirdMax(int[] nums) {
    	
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i : nums)
        {
        	set.add(i);
        }
        System.out.println(set);
        for(int i : set)
        {
        	list.add(i);
        }
    	System.out.println(list);
    	Collections.sort(list);
    	
    	
    	if(list.size()==1)
    		return list.get(0);
    	
    	if(list.size()==2)
    		return list.get(list.size()-1);
    	
    	return list.get(list.size()-3);
    }
	
	
	
	
	
	
	
	
	
	public static int heightChecker(int[] heights) {
		
		 int[] sorted = heights.clone();
	        Arrays.sort(sorted);
	        
	        int nb = 0;
	        for(int i=0;i<heights.length;i++){
	            if(sorted[i] != heights[i]){
	                nb++;
	            }
	        }
	        return nb;
    }
	
	
	
	
	
	 public static int removeElement(int[] nums, int val) {
	      
		 int c=0,x=0;
		 
	     for(int i=0;i<nums.length;i++)
	     {
	    	 if(nums[i]!=val)
	    	 {
	    		 nums[x++]=nums[i];
	    		 c++;
	    	 }
	     }
		 return c;
	 }
	
	
	
	
	 public static int[] sortArrayByParity(int[] arr) {
	        
		 int x=0,e=0;
		 int[] res = new int[arr.length];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]%2==0)
			 {
				 res[x++]=arr[i];
				 e++;
				 System.out.println("e :: "+e);
			 }
			 if(arr[i]%2!=0)
			 {
				 int o = e+1;
				 res[e++]=arr[i];
			 }
		 }
		 System.out.println(Arrays.toString(res));
		 return res;
	 }
	
	
	
	
	

	public static void moveZeroes(int[] nums) {

		int x=0,c=0,c2=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
				nums[x++] = nums[i];
			if(nums[i]==0)
				c++;
		}
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println(c);
		
		int l=nums.length-1;
		while(c2<c)
		{
			c2++;
			nums[l]=0;
			l--;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	
	
	
	

	public static int removeDuplicates(int[] arr) {

		int n = arr.length;
		if (n == 0 || n == 1)
			return n;

		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}

		arr[j++] = arr[n - 1];
		System.out.println(Arrays.toString(arr));
		return j;
	}

	public static int[] replaceElements(int[] arr) {
		int maxVal = -1;
		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = maxVal;
			System.out.println("temp :: " + temp + "   arr[i] :: " + arr[i] + "     maxVal :: " + maxVal);
			maxVal = Math.max(maxVal, temp);
			System.out.println("Maxval :: " + maxVal);
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

//	public static int[] replaceElements(int[] arr) {
//
//		int[] temp = new int[arr.length];
//		temp[arr.length-1]=-1;
//		int max=0,x=0;
//		
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[j]>arr[i])
//				{
//					System.out.println("arr[i] :: "+arr[i]+" arr[j] :: "+arr[j]);
//					arr[x++]=arr[j];
//				}
//			}
//		}
//		
//		arr[arr.length-1]=-1;
//		System.out.println(Arrays.toString(arr));
//		
//		return arr;
//	}

	public static int findMaxConsecutiveOnes(int[] nums) {

		int c = 0, max = 0;
		if (nums.length <= 0)
			return 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1)
				c = 0;
			if (nums[i] == 1) {
				c++;
				if (c > max) {
					max = c;
					System.out.println(max);
				}
			}

		}
		System.out.println(max);
		return max;
	}

}
