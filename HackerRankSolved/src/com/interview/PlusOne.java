package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {

		int[] digits= {9,8,9,9};
		int[] res=plusOne2(digits);
		
		System.out.println("res :: "+Arrays.toString(res));
	}

	
	
	
	public static int[] plusOne2(int[] arr)
	{
		System.out.println("arr before:: "+Arrays.toString(arr));
		int n=arr.length;
		
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]<9)
			{
				arr[i]++;
			    return arr;
			}
			arr[i]=0;
		}
		
		int[] narr = new int[n+1];       // this comes when any arr[i]<9 condition is not satisfied and not returned
		narr[0]=1;
		//ee
		
		return narr;     
	}
	
	
	
	public static int[] plusOne3(int[] digits) {
        
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++; return digits;
	        }
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    return newNumber;
	}
	
	
	
	
	
	
	
	
	public static int[] plusOne(int[] arr)
	{
		System.out.println("arr before:: "+Arrays.toString(arr));
		int n=arr.length,x=0;
		boolean extra=false;
		int[] extarr = new int[n+1];
		Arrays.fill(extarr, 0);
		
		if(arr[n-1]!=9)
			arr[n-1]++;
		
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]==9 && i!=0)
			{
				arr[i]=0;
				if(arr[i-1]!=9)
				arr[i-1]++;
			}
			if(i==0 && arr[i]==9)
			{
				System.out.println("inside     i :: "+i+"    arr[i] :: "+arr[i]);
				extra=true;
				extarr[0]=1;
			}
		}
		
		if(!extra)
		System.out.println("arr after:: "+Arrays.toString(arr));
		else
			System.out.println("arr after extra:: "+Arrays.toString(extarr));	
		
		if(!extra)
		    return arr;
		
		else
			return extarr;
	}

	
	
	
	
	
	
	
	
	
	
	
	
//	public static int[] plusOne(int[] arr)
//	{
//		
//
//		String dig="",dig2="";
//		int x=0;
//		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			dig=dig+Integer.toString(arr[i]);
//		}
//		
//		int d=Integer.parseInt(dig);
//		d++;
//		dig2 = Integer.toString(d);
//		
//		System.out.println("dig2 :: "+dig2);
//		
//		for(int i=0;i<dig2.length();i++)
//		{
//			list.add(Character.getNumericValue(dig2.charAt(i)));
//		}
//		
//		System.out.println(list);
//		
//		int[] res= new int[list.size()];
//		
//		for(int elem : list)
//			res[x++]=elem;
//		
//		System.out.println("res :: "+Arrays.toString(res));
//		
//		return res;
//	}
}
