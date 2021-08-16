package com.leetcodesolved;

public class SumOfOddLengthSubArrays {

	public static void main(String[] args) {

		int[] arr= {1,4,2,5,3};
		getSumOfOddLen(arr);
		
	}
	
	
	
	public static void getSumOfOddLen(int[] arr)
	{
		int n=arr.length,sum=0,x=0,sumt=0,res=0;
		for(int i=0;i<n;i++)
		{
			sumt=sumt+arr[i];
			for(int j=0;j<n;j++)
			{
				x=0;
				if(((i+j)%2==0) && (j>i))
				{
				  x=i;
				  while(x<=j)
				  {
					  sum=sum+arr[x];
					  x++;
				  }
					System.out.println("i :: "+i+"    j :: "+j+"   sum :: "+sum+"    x :: "+x);
				}
			}
		}
		res=sum+sumt;
		System.out.println("res :: "+res);
	}
	
	
	
	
	
//	public static void getSumOfOddLen(int[] arr)
//	{
//		int sum=0,n=arr.length,c=0,cnote=0;
//		
////		int[] arr= {1,4,2,5,3};
////		for(int i=0;i<n;i++)
////			sum=sum+arr[i];
////		
////		if(n%2!=0)
////			sum=sum*2;
//		
//		int i=0;
//		while(i<n)
//		{
//			sum=sum+arr[i];
//			c++;
//			
//			System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"   sum :: "+sum+"    c :: "+c);
//			cnote=c;
//			
//			i++;
//		}
//		
//		System.out.println("sum :: "+sum);
//	}

}
