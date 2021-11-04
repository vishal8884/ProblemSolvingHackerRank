package com.interview.strings.easy;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {

		char[] arr = {'h','e','l','l','o'};
		reverseString(arr);
	}
	
	 public static void reverseString2(char[] arr)
	 {
		    char[] temp = new char[arr.length];
		    int x=0,y=0;
	        for(int i=arr.length-1;i>=0;i--)
	        {
	        	System.out.println(arr[i]);
	        	temp[x++]=arr[i];
	        }
	        
	        for(char i : temp)
	        {
	        	arr[y++]=i;
	        }
	 }
	
    public static void reverseString(char[] arr)
    {
        int start=0;
        int end=arr.length-1;
        
        while(start<end)
        {
        	char temp = arr[start];
        	arr[start]=arr[end];
        	arr[end]=temp;
        	start++;
        	end--;
        }

        System.out.println(Arrays.toString(arr));
    }

}
