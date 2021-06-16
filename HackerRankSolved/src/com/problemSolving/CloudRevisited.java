package com.problemSolving;

public class CloudRevisited {

	public static void main(String[] args) {

		
		int[] arr = {1 ,1 ,1 ,0 ,1 ,1 ,0 ,0 ,0 ,0};
		jumpingOnClouds(arr,3);
	}
	
	static int jumpingOnClouds(int[] arr, int k) {

		int e=100;
        int i=0;
        
        while(e==100 || i!=0)
        {
        	if(arr[i]==0)
        		e=e-1;
        	else
        		e=e-3;
        	
        	System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"   e :: "+e);
        	
        	
        	if(i+k>=arr.length)
                i=i+k-arr.length;  // 9+3=12  12-10=0
            else
                i=i+k;
        }

		
		
		return e;
    }

}




















//
//
//
//static int jumpingOnClouds(int[] arr, int k) {
//
//	int e=100,c=-1;
//
//	for(int i=0;i<arr.length;i=i+k)
//	{
//		c++;
//		if(i==0)
//			e=100;
//		else if(arr[i]==0)
//			e=e-1;
//		else if(arr[i]==1)
//			e=e-3;
//		
//		
//		System.out.println("i :: "+i+"    arr[i] ::"+arr[i]+"    e :: "+e+"    count :: "+c);
//		
//		if(c==3 && i+k!=arr.length)
//		{
//			i=0;
//		}
//		
//		
//	}
//	
//	
//	System.out.println("e final :: "+e);
//	return e;
//}