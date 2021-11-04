package com.interview.strings.easy;

import java.util.Arrays;


public class validatePalindrome {

	public static void main(String[] args) {

		boolean res=isPalindrome("0P");
		//boolean res=isPalindrome("A man, a plan, a canal: Panama");
		System.out.println("res :: "+res);
		
	}
	
	public static boolean isPalindrome(String s) {

		String s1 =s.toLowerCase();
		String rev="";
		
        String trimmed = "";
		
		for(int i=0;i<s1.length();i++)
		{
			if((s1.charAt(i)>='a' && s1.charAt(i)<='z') || (s1.charAt(i)>='0' && s1.charAt(i)<='9'))
			{
				trimmed = trimmed + s1.charAt(i);
			}
		}
		
		char[] s1arr = trimmed.toCharArray();
		int n=trimmed.length();
		
		int start=0;
		int end=n-1;
		
		while(start<end)
		{
			char temp=s1arr[start];
			s1arr[start]=s1arr[end];
			s1arr[end]=temp;
			start++;
			end--;
		}
		
		for(char c : s1arr)
			rev=rev+c;
		
		System.out.println("rev :: "+rev+"    trimmed :: "+trimmed); 
		return rev.equals(trimmed);
	}
	
	

	public static boolean isPalindrome2(String s) {

		String s1 = s.toLowerCase();
		String trimmed = "";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				trimmed = trimmed + s1.charAt(i);
			}
		}
		
		int n = trimmed.length();
		int n2 = trimmed.length()-1;
		int c=0;
		
		System.out.println("trimmed :: "+trimmed);
		
		//use reverse string technique
		
		return true;
	}

}
