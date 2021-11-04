package com.interview.strings.easy;

import java.util.HashMap;

public class firstUnique {

	public static void main(String[] args) {

		String s= "leetcode";
		int res=firstUniqChar2(s);
		System.out.println("res :: "+res);
	}
	
	public static int firstUniqChar(String s) {
		
		int len=s.length(),c=0;
		
		for(int i=0;i<s.length();i++)
		{
			c=0;
			for(int j=0;j<s.length();j++)
			{
				c++;
				if(i!=j && (s.charAt(i)==s.charAt(j)))
				{
					System.out.println("i :: "+i+"   j :: "+j+"   c :: "+c);	
				    break;
				}
				
				if(c==len)
					return i;
			}
		}
		
		return -1;
	}
	
	
	public static int firstUniqChar2(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
            System.out.println("i :: "+i+"    count :: "+count);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }

}
