package com.hackerearth;

import java.util.Scanner;

public class SevenSegmentDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String ip = sc.nextLine();
			getMax(ip);
			System.out.println();
		}
		
	}
	
	public static void getMax(String ip) {
		int[] sticks = {6,2,5,5,4,5,6,3,7,6};
		int ipSticks = 0;

			for(int i=ip.length()-1;i>=0;i--) {
				char currChar = ip.charAt(i);
				int currVal = Character.getNumericValue(currChar);
				int st = sticks[currVal];
				ipSticks = ipSticks +st;
			}
		
		while(ipSticks>0) {
			
		    if(ipSticks%2!=0) {
			    System.out.print("7");
			    ipSticks=ipSticks-3;
		    }
		    else {
			    System.out.print("1");
			    ipSticks=ipSticks-2;
		    }
		}
	}

}
