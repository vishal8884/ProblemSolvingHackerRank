package com.problemSolving;

public class Chocklete {

	public static void main(String[] args) {

		chocolateFeast(10,2,5);
	}

	public static int chocolateFeast(int n, int c, int m) {

		
		int choco=n/c,eat=0,wp=0;
		
		System.out.println("choco :: "+choco);
		
	    while(choco!=0)  //add until chocolate=0
	    {     
	        eat+=choco;
	        wp+=choco;   //counting no. of chocolates as wrappers
	        choco=wp/m;  //No. of wrappers turned
	        wp=wp%m;     //left wrappers
	        
	        System.out.println("eat :: "+eat+"  wp :: "+wp+"    choco :: "+choco);
	    }
	    
	    return eat;
		
	}

}
