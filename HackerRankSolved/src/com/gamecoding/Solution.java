package com.gamecoding;

import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        
    	int[] arr= {42,-5, 12, 21, 5, 24};
    	getTemp(arr);
    } 
    
    public static void getTemp(int[] arr)
    {
    	
    	int max=-1,min=Integer.MAX_VALUE,res=0;
    	int minabs=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]<max && max<0)
    			max=arr[i];
    		if(arr[i]<min && min>0)
    			min=arr[i];
    		System.out.println("max :: "+max+"   min :: "+min+"    arr[i] :: "+arr[i]+"   i :: "+i);
    	}
    	
    	
    	minabs = Math.abs(min);
    	System.out.println("max :: "+max+"   min :: "+minabs);
    	
    	if(minabs>max)
    		res=max;
    	else
    		res=min;
    	
    	System.out.println(res);
    }
}