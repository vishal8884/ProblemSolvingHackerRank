package com.test;

public class ReplaceString {

	public static void main(String[] args) {

		String s="[[\"5\",\"3\",\".\",\".\",\"7\",\".\",\".\",\".\",\".\"]\r\n"
				+ ",[\"6\",\".\",\".\",\"1\",\"9\",\"5\",\".\",\".\",\".\"]\r\n"
				+ ",[\".\",\"9\",\"8\",\".\",\".\",\".\",\".\",\"6\",\".\"]\r\n"
				+ ",[\"8\",\".\",\".\",\".\",\"6\",\".\",\".\",\".\",\"3\"]\r\n"
				+ ",[\"4\",\".\",\".\",\"8\",\".\",\"3\",\".\",\".\",\"1\"]\r\n"
				+ ",[\"7\",\".\",\".\",\".\",\"2\",\".\",\".\",\".\",\"6\"]\r\n"
				+ ",[\".\",\"6\",\".\",\".\",\".\",\".\",\"2\",\"8\",\".\"]\r\n"
				+ ",[\".\",\".\",\".\",\"4\",\"1\",\"9\",\".\",\".\",\"5\"]\r\n"
				+ ",[\".\",\".\",\".\",\".\",\"8\",\".\",\".\",\"7\",\"9\"]]";
		
		replace(s);
	}
	
	
	public static void replace(String s)
	{
		char c=39;
		String rep=s.replace('[','{');
		String rep2=rep.replace(']','}');
		String rep3=rep2.replace('"',c);
		System.out.println(rep3);
	}

}
