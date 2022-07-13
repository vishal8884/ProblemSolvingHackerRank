package com.hackerearth;

import java.util.Scanner;

public class ProfilePicture {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int width = sc.nextInt();
			int height = sc.nextInt();
			
			validate(width,height,l);
		}
	}
	
	public static void validate(int width,int height,int l) {
		if(width<l || height <l) {
			System.out.println("UPLOAD ANOTHER");
		}
		else {
			if(width == height) {
				System.out.println("ACCEPTED");
			}
			else {
				System.out.println("CROP IT");
			}
		}
	}

}
