package com.problemSolving;

public class HackerRankString {

	public static void main(String[] args) {

		String s="vhiaschkaelrvriasnhk";
		//     s="hackerrank";4   
		String op=hackerrankInString(s);
		
		System.out.println("op :: "+op);
	}
	
	
	public static String hackerrankInString(String s)
	{

		String str = "hackerrank";
        if (s.length() < str.length())
        {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) 
        {
        	
            if (j < str.length() && s.charAt(i) == str.charAt(j))
            {
                    j++;
            }
            
            System.out.println("s.chatAt(i) :: "+s.charAt(i) +"      j :: "+j);
            
        }
        
        return (j == str.length() ? "YES" : "NO");
		
	}

}
