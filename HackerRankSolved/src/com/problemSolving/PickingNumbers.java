package com.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {

	public static void main(String[] args) {

		//List<Integer> s = new ArrayList<Integer>(Arrays.asList(1,1,2,2,4,4,5,5,5));
		List<Integer> s = new ArrayList<Integer>(Arrays.asList(1,2,2,3,1,2));
		pickingNumbers(s);
	}
	
	
	
	public static int pickingNumbers(List<Integer> a)
	{
		int frequency[] = new int[101];
		int result = Integer.MIN_VALUE;

		for (int i = 0; i < a.size(); i++)
		{
			int index=a.get(i);
			frequency[index]++; //frequency[index]=frequency[index]+1
		}

		System.out.println("frequency :: "+Arrays.toString(frequency));
		
		for (int i = 1; i <= 100; i++)
		{
			result = Math.max(result, frequency[i] + frequency[i - 1]);
		}
		
		System.out.println("result :: "+result);
		return result;

	}
	
	 public static int pickingNumbers2(List<Integer> a)
	 {
		    
		 int diff=0;
		 int max=0;
		 
		 List<Integer> list = new ArrayList<Integer>();
		    
		 for(int i=0;i<a.size();i++)
		 {
			 
			for(int j=i+1;j<a.size();j++)
			{
				
				int t=Math.abs(a.get(i)-a.get(j));
				if(Math.abs(a.get(i)-a.get(j))<=1)
				{
					list.add(a.get(j));
				}
				System.out.println("i :: "+i+"   j :: "+j+"     Condition Check :: "+t+"    List :: "+list);
			}
			System.out.println("i :: "+i+"   Length of list :: "+list.size());
			if(list.size()>max)
			{
				max=list.size();
				System.out.println("max :: "+max);
			}
			list.clear();
		 }
		 
		     System.out.println("final max :: "+max);
		     return max;
	  }

}
//System.out.println("a[i] :: "+a.get(i)+"    a[j] :: "+a.get(j));