package com.problemSolving;

import java.util.Arrays;

public class ApplesAndOranges {

	public static void main(String[] args) {


	      int[] arr = {2, 3, 1, 2, 3, 2, 3, 3};
	
	}
	
	
	
	
	
	 static int beautifulTriplets(int d, int[] arr) {

		 int c=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr.length;j++)
			 {
				
			 }
		 }

		return c; 
	  }
	
	
	
	static int hurdleRace(int k, int[] height) {

        int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<height.length;i++)
		{
			if(height[i]>max)
				max=height[i];
			if(height[i]<min)
				min=height[i];
		}
		
		if(max<=k)
		return 0;
		
		else
		return max-k;	
    }
	
	
	
	
	
	
	
	static int[] breakingRecords(int[] scores) {

		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,min_c=0,max_c=0;
		for(int i=0;i<scores.length;i++)
		{
			if(scores[i]<min)
			{
				min=scores[i];
				min_c++;
			}
			if(scores[i]>max)
			{
				max=scores[i];
				max_c++;
			}
		}
		
		int[] op = {max_c-1,min_c-1};
		System.out.println(Arrays.toString(op));

		return op;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 static String kangaroo(int x1, int v1, int x2, int v2) {

         int c=0;
		 boolean a= false;
		 while(x1!=x2)
		 {
			 x1=x1+v1;
			 x2=x2+v2;
			 System.out.println("x1 ::"+x1+"   x2 ::"+x2);
			 if(x1==x2)
			 {
				 a=true;
				 break;
			 }
			 c++;
			 if(c>10000)
				 break;
		 }
		 
		 
		 if(a)
		 return "YES";
		 
		 return "NO";
	 }
	
	
	 
	 
	 
	 
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {


		int applesCount=0;
		int orangesCount=0;
		
		for(int i=0;i<apples.length;i++)
		{
			apples[i]=apples[i]+a;
			if(apples[i]>=s && apples[i]<=t)
				applesCount++;
		}
		for(int i=0;i<oranges.length;i++)
		{
			oranges[i]=oranges[i]+b;
			if(oranges[i]>=s && oranges[i]<=t)
				orangesCount++;
		}
		
		System.out.println(applesCount);
		System.out.println(orangesCount);
		
		

    }

}
