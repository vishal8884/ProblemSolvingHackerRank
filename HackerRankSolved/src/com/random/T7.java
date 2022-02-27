package com.random;

public class T7 {

	public static void main(String[] args)
	{

		String res = kangaroo(0,2,5,3);
		
		System.out.println(res);
	}
	
	public static String kangaroo(int x1, int v1, int x2, int v2) 
	{

		if(x1==x2)
			return "YES";
		int x1t=x1,x2t=x2;
		
		String faster = (v1>v2) ? "x1":"x2";
		
        String slower = (v1<v2) ? "x2":"x1";

		while(x1!=x2)        //base case
		{
		   x1t=x1t+v1;
		   x2t=x2t+v2;
		   
		   System.out.println("x1t :: "+x1t+"     x2t :: "+x2t+"    faster :: "+faster+"     slower :: "+slower);
		   if(x1t==x2t)
			   return "YES";
		   
		   if("x1".equals(faster) && (x1t>x2t))   //if x1 is faster and it moves forward then no
			   return "NO";
		   if("x2".equals(faster) && (x2t>x1t))   //if x2 is faster and it moves forward then no
			   return "NO";
		}
		return "";
	}

}
