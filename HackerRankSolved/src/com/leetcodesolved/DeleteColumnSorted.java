package com.leetcodesolved;

import java.util.Arrays;

public class DeleteColumnSorted {

	public static void main(String[] args) {
		
		String[] arr = {"cba","daf","ghi"};
		int op=minDeletionSize(arr);
		
		System.out.println("op :: "+op);

	}
	
	
	
 public static int minDeletionSize(String[] arr) {
	 
	 char prev=' ',current=' ';
	 
	 int c=0;
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=0;j<arr[i].length();j++)
		 {
			 if(j==0)
				 prev=' ';
			 if(j!=0)
				 prev=arr[i].charAt(j-1);
			 
			 
			 current = arr[i].charAt(j);
			 System.out.println("current :: "+current+"      previous :: "+prev);
			 
			 if(prev>current)
			 {
				 //System.out.println("                                  current :: "+current+"      previous :: "+prev);
				 c++;
			 }
		 }
		 
		 
		 
		 System.out.println("c ::"+c);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	return c;        
}

 
 
 
 
 
 
 
 
 
 
 
 
}











//public static int minDeletionSize(String[] arr) {
//	 
//	 char prev=' ';
//	 System.out.println(Arrays.toString(arr));
//	 
//	 for(int i=0;i<arr.length;i++)
//	 {
//		 for(int j=0;j<arr[i].length();j++)
//		 {
//			 if(j!=0)
//			 {
//				 prev=arr[i].charAt(j);
//			 }
//			 System.out.println("current :: "+arr[i].charAt(j)+"      previous :: "+prev);
//			 
//		 }
//		 
//		 System.out.println(" ");
//	 }
//	 
//	 
//	 
//	 
//	 
//	 
//	 
//	 
//	 
//	 
//	 
//	return 0;        
//}