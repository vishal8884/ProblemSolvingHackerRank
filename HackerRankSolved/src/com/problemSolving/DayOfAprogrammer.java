package com.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayOfAprogrammer {

	public static void main(String[] args) {

	}
	
	
	
	static int pageCount(int n, int p) {
		
		
		return 0;

    }
	
	
	
	
	
	
	
	
	
	
	
	
	static String dayOfProgrammer(int year) {

		
		
		int[] months_days = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear(year)||(isLeapYearinJulianCalander(year) && year<1918))
			months_days[1]=29;
		
		int sum=0,mm=0,dd=0;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<months_days.length;i++)
		{
			sum=sum+months_days[i];
			System.out.println("sum :: "+sum);
			list.add(sum);
			mm++;
			if(sum>256)
				break;
		}
		dd= 256-list.get(list.size()-2);
		
		System.out.println(list.get(list.size()-2)+" :: list.size()-2");
		
		String dds = String.valueOf(dd);
		String mms = String.valueOf(mm);
		String yys = String.valueOf(year);
		
		System.out.println(dds+".0"+mms+"."+yys);
		
		System.out.println(Arrays.toString(months_days));
		return dds+".0"+mms+"."+yys;
    }
	
	
	public static boolean isLeapYear(int year)
	{
		if(year%400==0 || (year%4==0 && !(year%100==0)))
			return true;
		return false;
	}
	public static boolean isLeapYearinJulianCalander(int year)
	{
		if(year%4==0)
			return true;
		return false;
	}

}
