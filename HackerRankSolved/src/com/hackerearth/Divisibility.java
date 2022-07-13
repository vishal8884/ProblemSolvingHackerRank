package com.hackerearth;

import java.util.Scanner;

public class Divisibility {

		public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			long[] arr = new long[n];
			
			for(int i=0;i<arr.length;i++) {
				long elem = sc.nextLong();
				arr[i]=elem;
			}
			//int[] arr = {85,25,65,21,84};
			validateDisibility(arr);
		}
		
		public static void validateDisibility(long[] arr) {
			
			long f=0;
			
			for(int i=0;i<arr.length;i++) {
				long lastDigit = arr[i]%10;
				f=f*10+lastDigit;
			}
			
			String res = (f%10==0)?"Yes":"No";
			
			System.out.println(res);
		}

}
