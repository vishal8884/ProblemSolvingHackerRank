package com.interview;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {

		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		rotate(matrix);
	}

    public static void rotate(int[][] matrix)
    {
        System.out.println("matrix :: "+Arrays.deepToString(matrix));
        int n = matrix.length,nsub1=n-1,nstart=0;
        int[][] temp = new int[n][n];
        
        for(int i=0;i<n;i++)
        {
        	nsub1=n-1;
        	for(int j=0;j<n;j++)
        	{
        		temp[i][j]=matrix[nsub1][nstart];
        		System.out.println("i :: "+i+"    j :: "+j+ "    temp :: "+temp[i][j]+"    nsub1 :: "+nsub1+"    nstart :: "+nstart);
        		nsub1--;
        	}
        	nstart++;
        	System.out.println();
        }
        
        
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		matrix[i][j]=temp[i][j];
        	}
        }
        
        System.out.println("matrix result :: "+Arrays.deepToString(matrix));
    }

}



//if(i==coli && j==colj)
//{
//	System.out.println("i :: "+i+"    j :: "+j+ "    matrix :: "+matrix[i][j]);
//	coli++;
//}