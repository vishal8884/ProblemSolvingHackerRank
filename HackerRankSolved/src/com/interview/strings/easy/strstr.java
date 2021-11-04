package com.interview.strings.easy;

public class strstr {

	public static void main(String[] args) {

		String haystack="mississippi";
		String needle = "issip";
		
		int res=strStr(haystack,needle);
		System.out.println("res :: "+res);
		
	}
	
	
	
    public static int strStr(String haystack, String needle) {
        
    	System.out.println("haystack :: "+haystack+"    needle :: "+needle);
    	
    	if(needle.length()==0)
    		return 0;
    	
    	int hlen = haystack.length();
    	int nlen = needle.length();
    	
    	
    	char nedchar = needle.charAt(0);
    	
    	if(!haystack.contains(needle))
    		return -1;
    	
    	for(int i=0;i<hlen;i++)
    	{
    		System.out.println("i :: "+i+"   haystack :: "+haystack.charAt(i));
    		if(haystack.charAt(i)==nedchar)
    		{
    			return i;
    		}
    	}
    	
    	
    	
    	return 0;
    }

}
