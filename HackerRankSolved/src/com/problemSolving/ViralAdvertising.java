package com.problemSolving;

public class ViralAdvertising {

	public static void main(String[] args) {

		//viralAdvertising(3);
		viralAdvertising(3);
	}
	
	static int viralAdvertising(int n) {

		int shared=n,liked=0,cumulative=0,t=0;;
		
		
		for(int i=1;i<=n;i++)
		{
			liked= shared/2;
			t=liked*3;
			cumulative = cumulative + liked;
			System.out.println("day :: "+i+  "   liked :: "+liked+"    shared :: "+shared+ "   t :: "+t+"  clative ::"+cumulative);
			shared=t;
			
			
		}
		
          return cumulative;
    }

}
