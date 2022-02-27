package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEMP888 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3);
		list.add(3,8);
		modify(list);
		
	}
	
	
	public static List<Integer> modify(List<Integer> list)
	{
		for(int i=0;i<list.size();i++)
		{
			list.set(i,4);
		}
		
		System.out.println(list);
		
		return list;
	}

}
