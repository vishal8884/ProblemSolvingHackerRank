package SDEproblems;

import java.util.Arrays;

public class SwappingPairToMakeSumEqual {

	public static void main(String[] args) {

		long A[] = {4, 1, 2, 1, 1, 2 };
		long B[] = {1,1, 3, 3};

		 long res = findSwapValues(A, A.length, B, B.length);
		 System.out.println("res :: "+res);
	}

	
	public static long findSwapValues(long A[], int n, long B[], int m)
	{
		long sum1=0, sum2=0;
	       for(int i=0;i<n;i++)
	       {
	           sum1=sum1+A[i];
	       }
	       for(int j=0;j<m;j++)
	       {
	           sum2=sum2+B[j];
	       }
	       
	       Arrays.sort(A);
	       Arrays.sort(B);
	       
	       System.out.println("A sorted :: "+Arrays.toString(A)+"     sum1 ::  "+sum1);
	       System.out.println("B sorted :: "+Arrays.toString(B)+"     sum2 ::  "+sum2);
	       
	       int i=0;
	       int j=0;
	       while(i<n && j<m){
	           if(sum1 - A[i]+B[j] == sum2 +A[i] -B[j]){
	        	   System.out.println("sum 1 :: "+sum1+"     A[i] :: "+A[i]+"    B[j] :: "+B[j]+"     sum2 ::"+ sum2);
	               return 1;
	           }else if(sum1 - A[i]+B[j] > sum2 +A[i] -B[j]){
	               i++;
	           }else{
	               j++;
	           }
	       }
	       
	       return -1;
	}
	
	public static long findSwapValues3(long A[], int n, long B[], int m) {
		
		long sumA=0,sumB=0;
		
		for(int i=0;i<n;i++) {
			sumA = sumA +A[i];
		}
		for(int i=0;i<m;i++) {
			sumB = sumB +B[i];
		}
		
		long max_sum = Math.max(sumA, sumB);
		long min_sum = Math.min(sumA, sumB);
		
		long req = max_sum-min_sum;
		if(req==0)
			return 1;
		
		System.out.println("max_sum :: "+max_sum+"    min_sum :: "+min_sum+"     req :: "+req);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.println("A[i] :: "+A[i]+"   B[j] :: "+B[j]+"     req :: "+req);
				if(A[i]+B[i]==req)
					return 1;
			}
			System.out.println();
		}
		
		return -1;
	}

	public static long findSwapValues2(long A[], int n, long B[], int m) {

		long sumMax = 0, sumMin = 0;
		int lenMax = 0;
		boolean aGreater = false, bGreater = false;

		if (n > m) {
			lenMax = n;
			aGreater = true;
			rev(B);
		} else {
			lenMax = m;
			bGreater = true;
			rev(A);
		}

		for (int i = 0; i < lenMax; i++) {
			if (aGreater) {
				sumMax = sumMax + A[i];
				System.out.println("i :: " + i + "    A[i] :: " + A[i] + "   sumMax :: " + sumMax);
			}
		}

		return -1;
	}

	public static void rev(long[] arr) {

		// 4, 1, 2, 1, 1, 2
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			long temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

		System.out.println("reversed arr :: " + Arrays.toString(arr));
	}

}


