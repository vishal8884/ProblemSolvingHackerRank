package com.hackerRankCoreJava;

import java.util.Scanner;

public class javaloops2 {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a=0,b=0,n=0;
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
		    ll(a,b,n);  
        }
        in.close();
        
        
    }
	
	public static void ll(int a,int b,int n)
	{
		int c=a;
		for(int i=0;i<n;i++)
		{
			c += Math.pow(2, i)*b;
			//System.out.println("c :: "+c+"  pow :: "+Math.pow(2, i)+"  b :: "+b);
            System.out.print(c+" ");
		}
	}

}
