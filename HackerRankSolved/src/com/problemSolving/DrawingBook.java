package com.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DrawingBook {
	static List<Integer> list = new ArrayList<Integer>();
	static int count=0;

	public static void main(String[] args) {

		int[] arr2 = {1,2,3};
		int[] arr = {5, 4, 4, 2, 2, 8};
		int[] arr3= {1, 2 ,3 ,4, 3 ,3, 2 ,1};
		System.out.println(Arrays.toString(cutTheSticks(arr3)));

	}
	
	
	static int[] cutTheSticks(int[] arr) {

		int min = Integer.MAX_VALUE,mini=0;
		
		if(count==0)
			list.add(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min =arr[i];
				mini=i;
			}
		}
		for(int i=0;i<arr.length;i++)
			arr[i]=arr[i]-min;
		
		int[] res=removeElemFromArray(arr,mini);

		if(!ifzeroisthere(res))
		{
			list.add(res.length);
		}
		System.out.println("after :: "+Arrays.toString(res)+"    min value is :: "+min+"    list :: "+list+"   count :: "+count);
		if(res.length>1)
		{
        count++;
		cutTheSticks(res);
		}
		int[] narr = new int[list.size()];
		int g=0;
		for(int m : list)
		{
			narr[g++]=m;
		}
		return narr;
    }
	
	public static boolean ifzeroisthere(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				return true;
			}
		}
		return false;
	}
	
     public static int[] removeElemFromArray(int[] arr,int index)
     {
    	 int x=0,c=0,y=0;
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 if(i!=index)
    		 {
    			 arr[x++]=arr[i];
    			 c++;
    		 }
    	 }
    	 int[] res = new int[c];
    	 for(int i=0;i<c;i++)
    	 {
    		 res[y++]=arr[i];
    	 }
    	 return res;
     }
	
	static int pageCount(int n, int p) {
	
		int countFront=0;
        int countBack=0;
        for(int i=1;i<=n;i++){
            if(i%2==0 && i<=p){
                countFront++;
            }else if(i%2==0 && i>p){
                countBack++;
            }
        }
        if(countFront<countBack){
            System.out.println(countFront);
        }else{
            
            System.out.println(countBack);
        }
        
        return 0;
		
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//static int pageCount(int n, int p) {
//		
//		int c=0,x=1;
//        
//		List<List<Integer>> list = new ArrayList<List<Integer>>();
//		
//		List<Integer> pages= new ArrayList<Integer>();
//		List<Integer> tempPages= new ArrayList<Integer>();
//		List<Integer> firstPage = new ArrayList<Integer>();
//		firstPage.add(0);
//		firstPage.add(1);
//		
//		list.add(firstPage);
//		
//		for(int i=2;i<13;i++)
//		{
//			
//			pages.add(i);
//			c++;
//			
//			if(c%2==0) 
//			{
//				tempPages=pages;
//				System.out.println(tempPages);
//				list.add(tempPages);
//				System.out.println(list+" :: inside");
//				pages.clear();
//			}
//		}
//		System.out.println(pages+"  :: final pages");
//		System.out.println(list+"  :: final list");
//        return 0;
//    }

}
