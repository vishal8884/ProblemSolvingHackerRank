package com.gs.codingTest;

public class Gs {

	public static void main(String[] args) {

		int res = noOfWaysToDrawTheGame(20);
		System.out.println("res :: "+res);
	}
	
	
	static int noOfWaysToDrawTheGame(int totalScore) {

		 int[] pos = {2,4,6};
	        int[] negetiveScores = {0,8};
	        int c=0;

	        for(int i=0;i<3;i++) {
	            if((pos[i] == totalScore) ||  (totalScore %pos[i]==0)) {
	                System.out.println("pos[i] :: "+pos[i]+"    totalScore :: "+totalScore);
	                c++;
	            }
	            for(int j=0;j<3;j++)
	            {
	                int temp2 = pos[i]+pos[j];
	                if((pos[i]!=pos[j])) {
	                   if((pos[i]+pos[j] == totalScore) || (totalScore % temp2 ==0)) {
	                       System.out.println("pos[i] :: "+pos[i]+"    pos[j] :: "+pos[j] +"    totalScore :: "+totalScore);
	                       c++;
	                }
	                }
	                for(int k=0;k<3;k++)
	                {
	                     int temp3=pos[i]+pos[j]+pos[k];
	                     if((pos[j]!=pos[i]) && (pos[k]!=pos[i])) {
	                       if((pos[i]+pos[j]+pos[k] == totalScore) || (totalScore %temp3==0)) {
	                           System.out.println("pos[i] :: "+pos[i]+"    pos[j] :: "+pos[j]+"    pos[k] :: "+pos[k] +"    totalScore :: "+totalScore);
	                           c=c+5;
	                     }
	                     }
	                }
	            }
	            System.out.println();
	          
	        }
	        
	        return c;
    }
	
	
	
	
	
	//if((pos[i]+pos[j]+pos[k] == totalScore) || (pos[i]+pos[j] ==totalScore) || (pos[j]+pos[k] ==totalScore) || (pos[i]+pos[k] ==totalScore) || (pos[i] == totalScore) || (pos[j] == totalScore) || (pos[k] == totalScore)) 
	
	
	
	
	

	public static void fizzBuzz(int n) {

		
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0 && i%5 != 0) {
				System.out.println("Fizz");
			}
			else if(i%3==0 && i%5 != 0) {
				System.out.println("Buzz");
			}
			else if(i%3!=0 && i%5 != 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
		
		
	}

}
