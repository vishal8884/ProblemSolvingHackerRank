package com.interview.strings.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {

		String s = "anagram";
	    String t = "nagaram";
	    
	    boolean res=isAnagram(s,t);
	    System.out.println("res :: "+res);
		
	}
	
	public static boolean isAnagram(String s, String t) {
		
		int slen=s.length(),tlen=t.length(),c=0;

		if(slen!=tlen)
			return false;
		
		char[] sarr=s.toCharArray();
		char[] tarr =t.toCharArray();
		
		Arrays.sort(tarr);
		Arrays.sort(sarr);
		
		for(int i=0;i<slen;i++)
		{
			if(tarr[i]!=sarr[i])
				return false;
		}
		
		return true;
	}
	
	
	public static boolean isAnagram2(String s, String t) {
	
		int slen=s.length(),tlen=t.length(),c=0;
		List<Integer> list = new ArrayList<Integer>();

		if(slen!=tlen)
			return false;
		
		for(int i=0;i<slen;i++)
		{
			for(int j=0;j<slen;j++)
			{
				char sc=s.charAt(i);
				char tc=t.charAt(j);
				if((sc==tc) && !(list.contains(j)))
				{
					list.add(j);
					c++;
					System.out.println("i :: "+i+"   j :: "+j+"   c :: "+c);
					break;
				}
			}
		}
		
		return c==slen;
	}

}
