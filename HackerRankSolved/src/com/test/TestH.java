package com.test;

public class TestH {

	
	
	public static void main(String[] args) {

		//print(3);
		
		String s= "execution methods. This class implements the submit,\r\n"
				+ "invokeAny and invokeAll methods using a RunnableFuture,\r\n"
				+ "returned by newTaskFor which defaults to the FutureTask,\r\n"
				+ "class provided in this package,\r\n"
				+ "Provides default implementations of ExecutorService,";
		
		int count=0;
		int wordCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				wordCount++;
			}
			if(s.charAt(i)==',')
			{
				count++;
				wordCount++;
				System.out.println("line no :: "+count+"    number of words :: "+wordCount);
				wordCount=0;
			}
			
			
		}
		
		System.out.println(count);
	}
	
	//  *
	// * *
	//* * *
	public static void print(int n)
	{
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<i+1)
				System.out.println("i :: "+i+"    j :: "+j);
				//System.out.print("*");
			}
			System.out.println();
		}
	}

}
