package com.problemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FairRations {

	public static void main(String[] args) {

//		List<Integer> list = new ArrayList<Integer>();
////		list.add(4);  
////		list.add(5);
////		list.add(6);
////		list.add(7);
//		
//		list.add(1);
//		list.add(2);
		
		int[] arr= {4,5,6,7};
		
	}
	
	static String fairRations(List<Integer> B) {
        int count = 0;
        for (int i = 0; i < B.size()-1; i++) {
            if (B.get(i)%2!=0){
            	B.remove(i);
            	B.add(i,B.get(i)+1);
            	B.remove(i+1);
            	B.add(i+1,B.get(i+1)+1);
                count++;
            }
            System.out.println("i ::"+i+"     B :: "+B.get(i));
        }
        if (B.get(B.size()-1)%2!=0) return "NO";
        return String.valueOf(count*2);
    }
	
	public static String fairRations2(List<Integer> a) {
		
		System.out.println("list before :: "+a);
		
		if(a.size()<=2)
			return "NO";
		
		int temp=0,temp2=0,temp3=0,c=0;
		
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i)%2!=0)
				{
					temp=a.get(i);
					
				  	if(i+1<a.size())
					  temp2=a.get(i+1);    //for right
				  	if(i-1>=0)
				  	  temp3=a.get(i-1);	
				  	
					a.remove(i);
					a.add(i, temp+1);
					
					//if left side is odd
					if(i-1>=0 && temp3%2!=0)
					{
						a.remove(i-1);
						a.add(i-1,temp3+1);
					}
					
					//if right side is odd
					else {
					if(i+1<a.size())
					{
					  a.remove(i+1);
					  a.add(i+1,temp2+1);
					}
					}
					System.out.println("i :: "+i+"     temp1 :: "+temp+"      temp2 :: "+temp2+"      a :: "+a);
					c++;
				}
			}
		
			
		System.out.println("list after :: "+a);
		int res=c*2;
		System.out.println("res :: "+res);
		String ress=Integer.toString(res);
		if(res!=0)
		return ress;
		else
		return "0";	
	}

}
