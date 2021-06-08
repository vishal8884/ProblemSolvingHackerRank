package com.problemSolving;

public class MarsSos {

	public static void main(String[] args) {
		
		
		String s="SOSSPSSQSSOR";
		
		marsExploration(s);

	}
	
	
	
	public static int marsExploration(String s) 
	{
		
		int sLen=s.length(),c=0;
		
		int sLen2=sLen/3;
		
		String actualSOS = "";
		
		
		for(int i=0;i<sLen2;i++)
		{
			actualSOS=actualSOS+"SOS";
		}

		for(int i=0;i<sLen;i++)
		{
			if(s.charAt(i)!=actualSOS.charAt(i))
			{
				c++;
			}
		}
	 
		System.out.println("str :: "+s+"   sLen :: "+sLen+"     actualSOS :: "+actualSOS+"   c :: "+c);

		
	   return c;
	}

}
