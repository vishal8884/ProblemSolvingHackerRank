package com.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {

	public static void main(String[] args) {

		List<Integer> s = new ArrayList<Integer>(Arrays.asList(1,1,2,2,4,4,5,5,5));
		pickingNumbers(s);
	}
	
	
	public static int pickingNumbers(List<Integer> a) {
		
		int c=0,c2=0,prevj=0;
		List<Integer> l1 = new ArrayList<Integer>();

		for(int i=0;i<a.size()-1;i++)
		{
			int j=i+1;
			if(Math.abs(a.get(i)-a.get(j))<=1)
			{
				//System.out.println("i ::"+i+"   j :: "+j+"  prevj :: "+prevj);
				l1.add(j);
			}

		}
		System.out.println(l1);
		for(int i=0;i<l1.size()-1;i++)
		{
			int j=i+1;
			System.out.println("i :: "+l1.get(i)+"  j :: "+l1.get(j));
			if(l1.get(i)==l1.get(j)-1)
			{
				c++;
				System.out.println("c :: "+c);
			}
			else
				c=0;
		}
		
	  return c+2;	
	}

}
//System.out.println("a[i] :: "+a.get(i)+"    a[j] :: "+a.get(j));