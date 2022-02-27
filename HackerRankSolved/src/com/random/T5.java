package com.random;

public class T5 {

	public static void main(String[] args) {

		String s="12:05:45AM";
		String convertedTime=timeConversion(s);
		
		System.out.println("res :: "+convertedTime);
	}

	public static String timeConversion(String s) {

		String AM_PM=s.substring(8);
		String hour=s.substring(0,2);
		String minute=s.substring(3,5);
		String second=s.substring(6,8);
		
		System.out.println("am or pm :: "+AM_PM);
		System.out.println("hour :: "+hour);
		System.out.println("minute :: "+minute);
		System.out.println("second :: "+second);
		
		
		if("AM".equals(AM_PM) && !(hour.equals("12")))
		{
			return s.substring(0,8);
		}
		
		if("AM".equals(AM_PM) && (hour.equals("12")))
		{
			return "00:"+minute+":"+second;
		}
		
		if("PM".equals(AM_PM) && !(hour.equals("12")))
		{
			int hourInInt= Integer.parseInt(hour);
			hourInInt=hourInInt+12;
			return String.valueOf(hourInInt)+":"+minute+":"+second;
		}
		
		if("PM".equals(AM_PM) && (hour.equals("12")))
		{
			return s.substring(0,8);
		}
		
		return "";
	}

}
