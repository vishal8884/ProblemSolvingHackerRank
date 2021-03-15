package com.hackerRank.sorting;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

        int[] arr = {1, 4, 3, 5, 6, 2};
		insertionSort2(arr.length,arr);
	}
	
	static void insertionSort2(int n, int[] arr) {


		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	
	
	
	
	
	
	
	
	static void insertionSort1(int n, int[] arr) {
        int x = arr[n-1];
       for(int i=n-2;i>=0;i--)
       {
           if(x<arr[i])
           {
               arr[i+1]=arr[i];
               printarr(arr);
               System.out.println();
           }
           else
           {
               arr[i+1]=x;
               printarr(arr);
               System.out.println();
               break;
           }
       }
       if(x<arr[0])
       {
           arr[0]=x;
           printarr(arr);
       }
 }

	public static void printarr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static int introTutorial(int V, int[] arr) {
		int note = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == V)
				note = i;
		}
		return note;
	}
	
	
	static int findDigits(int num) {
        
  	  int c=0;
  	  int numi = num;
  	  while(num != 0) 
  	  {
            int digit = num % 10;
            System.out.println(digit);
            if(digit!=0 && numi%digit==0)
            {
          	  c++;
            }
            num =num/ 10;
        }
       
  	  System.out.println(c+" :: c");
  	  
      return c;


  }

}
