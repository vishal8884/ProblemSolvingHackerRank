package com.hackerearth;

import java.io.BufferedReader;
import java.util.Scanner;

public class Ali {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		String ip = sc.next();
		//                    11B242-73

		String res = isvalid2("13X357-22");
		System.out.println(res);
	}

	public static String isvalid(String ip) {

		boolean a = true;
		boolean b = true;
		int c=0;
		int prevIndex=-1;
		int prev=-1;

		for (int i = 0; i < ip.length(); i++) {
			if (ip.charAt(i) != 'A' || ip.charAt(i) != 'E' || ip.charAt(i) != 'I' || ip.charAt(i) != 'O'
					|| ip.charAt(i) != 'U' || ip.charAt(i) != 'Y') {
				a = false;
			}
			if (ip.charAt(i) >= '0' && ip.charAt(i) <= '9') {
				int curr = Character.getNumericValue(ip.charAt(i));
				int sum=0;
				if(prevIndex !=-1)
				     prev= Character.getNumericValue(ip.charAt(prevIndex));
				if(prev!=-1) {
					 sum=curr+prev;
					 if(sum%2!=0)
						 b=false;
				}
				System.out.println("curr :: "+curr+"    i :: "+i+"    previndex :: "+prevIndex+"    prev :: "+prev+"    sum :: "+sum);
				prevIndex=i;
			}
		}

		if (!a && !b) {
			return "invalid";
		}

		return "valid";
	}

	public static String isvalid2(String ip) {

		boolean a=true;
		boolean b=true;
		
		for(int i=0;i<ip.length();i++) {
			if(ip.charAt(i)!='A' || ip.charAt(i)!='E' || ip.charAt(i)!='I' || ip.charAt(i)!='O' || ip.charAt(i)!='U' || ip.charAt(i)!='Y') {
				a=false;
			}
			if(i!=ip.length()-1) {
			    if(ip.charAt(i)>='0' && ip.charAt(i)<='9' && ip.charAt(i+1)>='0' && ip.charAt(i+1)<='9') {
                    int curr = Character.getNumericValue(ip.charAt(i));
                    int next = Character.getNumericValue(ip.charAt(i+1));
                    int sum = curr+next;
                    if(sum%2!=0) {
                    	b=false;
                    }
                    //System.out.println("curr :: "+curr+"      next :: "+next+"     sum :: "+sum);
			    }
			}
		}
		
		if(!a && !b) {
			return "invalid";
		}
		
		return "valid";
	}
}
