package com.basicsOfDataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

	public static void main(String[] args) {

		int[] arr = {5,6,7,8,9,3,10,1,2,3};
		findArr(arr,3);
		
	}
	
	public static void findArr(int[] arr,int p)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==p)
			{
				list.add(i);
			}
		}
		
		if(list.size()>0)
		System.out.println("found at indexes :: "+list);
		else
			System.out.println("none found");
		
		
	}
	
	
	public static void rotate2(int[] arr,int d)
	{
		int n=arr.length,x=0,y=0;
		int[] a = new int[d];
		int[] b = new int[n-d];
		
		for(int i=0;i<d;i++)
		{
			a[x]=arr[i];
			x++;
		}
		for(int i=d;i<n;i++)
		{
			b[y]=arr[i];
			y++;
		}
		
		
		System.out.println("a :: "+Arrays.toString(a));
		System.out.println("b :: "+Arrays.toString(b));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void leftRotate3(int[] arr,int d)
	{
		int n=arr.length;
		int gcd=gcd(n,d);
        System.out.println("gcd :: "+gcd);
        
        int j,x;
        
        for(int i=0;i<gcd;i++)
        {
        	j=i;
        	while(true)
        	{
        		x=j+d;
        		if(x>=n)
        		{
        			x=x-n;
        		}
        		if(x == i)
                     break;
                 arr[j] = arr[x];
                 j = x;
        	}
        }
        
        System.out.println("res :: "+Arrays.toString(arr));
	}
	
	
	
	public static int gcd(int a,int b)
	{
		if (b == 0)
            return a;
        else
            return gcd(b, a % b);
	}
	
	
	
	
	
	
	
	
	
	public static void leftRotate(int[] arr,int d)
	{
		for(int i=0;i<d;i++)
		{
			leftRotateByOne(arr);
		}
		
		System.out.println("final res1 :: " +Arrays.toString(arr));
	}
	
	public static void leftRotateByOne(int[] arr)
	{
		int temp=arr[0];
		int n = arr.length;
		
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		arr[n-1]=temp;
		
	}
	
	
	public static void rotate(int[] arr,int d)
	{
		int x=0;
		int y=arr.length-1;
		int[] narr= new int[arr.length];
		
		
		for(int i=d;i<arr.length;i++)
		{
		   narr[x]=arr[i];
		   x++;
		   System.out.println("arr :: "+Arrays.toString(narr)+"  x :: "+x);
		}
		
        for(int i=0;i<d;i++)
        {
        	narr[x]=arr[i];
        	x++;
        	System.out.println("arr :: "+Arrays.toString(narr)+"  x :: "+x);
        }
        
        
        System.out.println("final res2 :: "+Arrays.toString(narr));
	}

}
