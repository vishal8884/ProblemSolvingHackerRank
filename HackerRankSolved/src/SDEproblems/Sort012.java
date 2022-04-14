package SDEproblems;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {

		int[] a = {0, 2, 1, 2, 0};
		sort012(a, a.length);
	}

	public static void sort012(int a[], int n) {

		int zeroCount=0;
		int oneCount = 0;
		int twoCount = 0;
		int c=0;
		
		for (int i =0; i <n; i++) {
			if(a[i] == 0) 
				zeroCount++;
			if(a[i]==1)
				oneCount++;
			if(a[i]==2)
				twoCount++;
		}
		
		for(int i=0;i<zeroCount;i++)
			a[c++] = 0;
		for(int i=0;i<oneCount;i++)
			a[c++] = 1;
		for(int i=0;i<twoCount;i++)
			a[c++] = 2;
		
		System.out.println("res :: "+Arrays.toString(a));

	}
	
	
	// this is using bubble sort
	public static void sort012_temp(int a[], int n) {

		for (int i = 0; i < n; i++) {
			int temp = 0;
			
			for (int j = i + 1; j < n; j++) {
				
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("res :: "+Arrays.toString(a));

	}

}
