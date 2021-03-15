package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Enter n m and e");
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		int e=sc.nextInt();
		
		int[] uvde = new int[4];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter arr");
			for(int j=0;j<4;j++)
			{
				uvde[j]=sc.nextInt();
				
			}
			list.add(uvde[3]);
            
		}
		System.out.println(list);
		int sum=0;
		for(int i=0 ;i<list.size();i++)
		{
			for(int j=0;j<list.size();j++)
			{
				if(i!=j)
				{
					if(list.get(i)+list.get(j)<=e)
					{
						System.out.println(list.get(i)+"  "+list.get(j));
					}
				}
			}
		
		}
		System.out.println(sum);
	}
	
	

}
