package com.test;

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	
    	int totalNumber = sc.nextInt();
    	int[] arr = new int[totalNumber];
    	int min =Integer.MAX_VALUE;
    	
    	for(int i=0;i<totalNumber;i++)
    	{
    		arr[i]= sc.nextInt();
    		if(arr[i]<min)
    			min=arr[i];
    	}
    	
        System.out.println(min);
    }
}