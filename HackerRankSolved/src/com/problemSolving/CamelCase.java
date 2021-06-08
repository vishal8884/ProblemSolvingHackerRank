package com.problemSolving;

public class CamelCase {

	public static void main(String[] args) {

		
		camelcase("saveChangesInTheEditor");
	}

	public static int camelcase(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
		   boolean x=Character.isUpperCase(s.charAt(i));
		   
		   if(x==true)
		   {
			   c++;
		   }
		}
		
		System.out.println("c ::"+c);
		return c+1;
	}

}
