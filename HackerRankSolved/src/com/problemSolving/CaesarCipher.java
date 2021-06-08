package com.problemSolving;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {

	public static void main(String[] args) {

		String s = "www.abc.xy";
		String o=caesarCipher(s,87);
		
		System.out.println("o :: "+o);
	}
	
	
	public static String caesarCipher(String s, int k)
	{
		
		char[] arr = s.toCharArray();

        k = k%26;
        
        System.out.println("k :: "+k);

        for(int i=0;i<arr.length;i++)
        {
            int num =0;
            int ch = (int)arr[i];
            
            if( ch >= 65 && ch <= 90 )
            {
                num = (int)arr[i] + k;
                if(num>90) 
                	num =num- 26;
                arr[i] = (char)num;
                
                System.out.println("num :: "+num+"    arr[i] :: "+arr[i]);
            }
            else if( ch >= 97 && ch <= 122 )
            {
                num = (int)arr[i] + k;
                if(num>122) num -= 26;
                arr[i] = (char)num;
            }
            
            
        }

        return String.valueOf(arr);
		
		
	}
	
	
	
	
//	public static String caesarCipher(String s1, int k)
//	{	
//		System.out.println("s1 before :: "+s1);
//		
//		String op ="";
//		
//		char c2=' ';
//		Character c1=' ';
//		
//		for(int i=0;i<s1.length();i++)
//		{
//			c1=s1.charAt(i);
//			
//			if(c1>=122-k+1 && c1<=122)
//			{
//				int aVal=97,guess=0;
//				for(char x=(char) (122-k+1);x<=122;x++)
//				{
//					int xi=x;
//					int xir=x-21;
//					char xr=(char) xir;
//					System.out.println("char :: "+x+"    integer :: "+xi+"    replace char :: "+xr+"     replace integer ::"+xir);
//					c2=xr;
//				}
//			}
//			
//			
//			
//			else if((c1>=97 && c1<=122-k) ||  (c1>=65 && c1<=90-k))
//			{
//			    c2=(char) (s1.charAt(i)+k);
//			}
//			else
//			{
//				c2=c1;
//			}
//			
//			int c1i=c1;
//			int c2i=c2;
//			System.out.println("s1 :: "+s1.charAt(i)+"     c2 :: "+c2+"    c1 :: "+c1+"     c2i  :: "+c2i+"    c1i :: "+c1i);
//			
//			op=op+c2;
//		}
//		
//		System.out.println("final op :: "+op);
//		
//		return op;
//	}
	
	
	
	
	
	
//	public static String caesarCipher(String s1, int k)
//	{	
//		String op = "";
//		
//		char t=' ',t1=' ';
//		int tillWhere = 25-k,t1int=0;
//		for(int i=0;i<s1.length();i++)
//		{
//			t1=s1.charAt(i);
//			t1int = t1;
//			if((t1int>=90-k+1 && t1int<=90))
//			{
//				t=66;
//			}
//			if((t1int>=122-k+1 && t1int<=122))
//			{
//				t=1;
//			}
//			else if((t1int>=65 && t1int<=90-k) || (t1int>=97 && t1int<=122-k) )
//			    t= (char) (t1+k);
//			else 
//				t=t1;
//				
//			op=op+t;
//			int ascii=t;
//			int a1ascii=s1.charAt(i);
//			System.out.println("i ::"+i+"   s1 :: "+s1.charAt(i) +"    asciiBefore ::"+a1ascii+"      sChanged-t :: "+t+"    ascii :: "+ascii+"    op :: "+op);
//			
//		}
//		System.out.println(op);
//		return op;
//	}
	
	

//	public static String caesarCipher(String s1, int k)
//	{
//		String s = "abcdefghijklmnopqrstuvwxyz";
//		String ns = " ";
//		int increment=0;
//		Map<Character, Character> map = new HashMap<>();
//		
//		int x=s.length()-k,c=0;
//		for(int i=k;i<s.length();i++)
//		{
//		  	ns=ns+s.charAt(i);
//			map.put(s.charAt(increment), s.charAt(i));
//			increment++;
//		}
//		for(int i=0;i<k-1;i++)
//		{
//			ns=ns+s.charAt(i);
//		}
//		System.out.println("s ::   "+s +"    len ::"+s.length());
//		System.out.println("ns :: "+ns +"    len :: "+ns.length());
//		
//		
//		System.out.println("s1 :: "+s1);
//		System.out.println(map);
//		
//		
//		for(int i=0;i<s1.length();i++)
//		{
//			char t= (char) (s1.charAt(i)+2);
//			System.out.println("i ::"+i+"   s1 :: "+s1.charAt(i) +"      sChanged :: "+t);
//		}
//		
//		return "";
//	}

}
