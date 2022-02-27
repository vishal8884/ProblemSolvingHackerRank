package com.interviewbit.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickFromBothSides {

	public static void main(String[] args)
	{
		int[] arr = {0,1,2,3,4,5,6,7,8};
		int[] arr2 = {1,2};
		int[] arr3 = {5, -2, 3 , 1, 2};
		int[] arr4= { -533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35, -810, 842, -712, -894, 40, -58, 264, -352, 446, 805, 890, -271, -630, 350, 6, 101, -607, 548, 629, -377, -916, 954, -244, 840, -34, 376, 931, -692, -56, -561, -374, 323, 537, 538, -882, -918, -71, -459, -167, 115, -361, 658, -296, 930, 977, -694, 673, -614, 21, -255, -76, 72, -730, 829, -223, 573, 97, -488, 986, 290, 161, -364, -645, -233, 655, 574, -969, -948, 350, 150, -59, 724, 966, 430, 107, -809, -993, 337, 457, -713};
		int[] arr5= { -533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
		
		int res=solve4(arr5, 48);
		
		System.out.println("res :: "+res);
	}
	
	
	
	
	public static int solve4(int[] arr, int b) 
	{
		//declearations
		int len=arr.length,sum1=0,sum2=0,elem=1,c1=0;
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("arr size :: "+arr.length);
		
        for(int i=0;i<b;i++)
        {
        	sum1=sum1+arr[i];
        	list.add(sum1);
        	System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"    sum1 :: "+sum1+"    list :: "+list);
        }
        
        Collections.reverse(list);
        list.add(0);
        System.out.println("reversed list :: "+list);
        System.out.println();
        
        for(int i=len-1;i>=b-1;i--)
        {
        	sum2=sum2+arr[i];
        	int get=list.get(elem);
        	
        	//leave first ie 10
        	list.set(elem,sum2+get);
        	elem++;
//        
        	System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"    sum2 :: "+sum2+"    get :: "+get+"    list :: "+list+"   c1 :: "+c1);
         	c1++;
         	if(c1==b)
         		break;
        }
		
        
        Collections.sort(list);
        
		return list.get(list.size()-1);
	}
	
	
	
	
	
	
	
	
	
	
	
	public static int solve(int[] A, int B) 
	{
        int sum1 = 0, sum2 = 0, min1;
        for(int i = 0; i<A.length;i++)
        {
        	sum1 += A[i];
        	System.out.println("i :: "+i+"    A[i] :: "+A[i]+"     sum1 :: "+sum1);
        }
        
        System.out.println();
        
        int i = 0, j = A.length - B - 1;

        for(int k=i;k<=j;k++)
        {
            sum2 += A[k];
            System.out.println("k :: "+k+"    A[K] :: "+A[k]+"    sum2 :: "+sum2);
        }
        min1 = sum2; 
        i++; 
        j++;
        
        System.out.println();
        System.out.println("min1 :: "+min1+"     i :: "+i+"       j :: "+j);
        System.out.println();
        
        while(j<A.length)
        {
            sum2 += (A[j]-A[i-1]);
            
            System.out.println("j :: "+j+"   A[j] :: "+A[j]+"    sum2 :: "+sum2);
            if(sum2<min1)
            {
            	min1=sum2;
            }
            i++;
            j++;
        }
        return sum1-min1;
    }
	
	
	
	
	
	
	    private static int add_last(int[] A, int B, int N)
	    {
	        int sum=0;
	        for (int i = N-B; i<N; i++)
	        {
	            sum += A[i];
	        }
	        return sum;
	    }

	public static int solve3(int[] arr, int b) 
	{
		System.out.println("arr :: "+Arrays.toString(arr));
		
		//declearions
		int len=arr.length,sum1=0,sum2=0,c1=0,c2=0,b1=b,elem=1;
		
		List<Integer> sums= new ArrayList<Integer>();
		
		
		for(int i=0;i<len;i++)
		{
			if(c1<=b1)
			{
				sum1=sum1+arr[i];
				c1++;
				System.out.println("i :: "+i+"    arr[i] :: "+arr[i]+"   sum1 :: "+sum1+"    c1 :: "+c1+"    b1 :: "+b1);
				if(c1==b1)
				{
					sums.add(sum1);
					System.out.println("added in list :: "+sums);
					i=-1;
					c1=0;
					b1--;
					sum1=0;
				}
			}
		}
		sums.add(0);
		System.out.println();
		
		for(int i=len-1;i>=b-1;i--)
		{
			c2++;
			sum2=sum2+arr[i];
			
			System.out.println(); System.out.println("sum2 :: "+sum2); 
			int forwardSum= sums.get(elem);
			
			if(c2<b)
			{
				sums.set(elem,forwardSum+sum2);
				elem++;
				int setelem=elem-1;
				System.out.println("i :: "+i+"     arr[i] :: "+arr[i]+"    sum2 :: "+sum2+"    forward Sum :: "+forwardSum+"     c2 :: "+c2+"    elem :: "+setelem);
			}
			

			
		}
		sums.set(sums.size()-1,sum2);
		System.out.println("sums :: "+sums+"   sum2 :: "+sum2);
		
		Collections.sort(sums);
		
		System.out.println("sorted sums :: "+sums);
		
		return sums.get(sums.size()-1);
	}
	
	
	
	
	
	
	
	
	public static int solve2(int[] arr, int b) 
	{
		System.out.println("arr :: "+Arrays.toString(arr));
		int sum1=0,sum2=0,sum3=0,c1=0,c2=0,len=arr.length,res=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0 && c1<b)
			{
				sum1=sum1+arr[i];
				c1++;
				System.out.println("i :: "+i+"    arr[i] :: "+arr[i]+"    sum 1 :: "+sum1+"     c1 :: "+c1);
			}
			else
				break;
		}
		
		
		sum3=sum1;
		System.out.println();
		System.out.println();
		
		for(int i=len-1;i>=0;i--)
		{
			if(arr[i]>0 && c2<b)
			{
				sum2=sum2+arr[i];
				if(c2<b-1)             //becuase it had sum1 already 
				  sum3=sum3+arr[i];
				c2++;
				System.out.println("i :: "+i+"    arr[i] :: "+arr[i]+"    sum2 :: "+sum2+"     c2 :: "+c2+"    sum3 :: "+sum3);
			}
		}
		
		
		return res;
	}

}
