package com.hackerearth;
import java.util.*;
public class Product {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextLong();
        }	
        
        getProduct(arr, n);
	}
	
	public static void getProduct(long[] arr,int n) {
		long prod=1;
		for(int i=0;i<n;i++) {
			prod=(long) ((prod*arr[i])%(Math.pow(10,9)+7));
		}
		System.out.println(prod);
	}

}
