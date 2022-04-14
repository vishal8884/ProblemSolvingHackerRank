package SDEproblems;

import java.util.Arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {

		long[] arr = { 1, 3, 5, 2, 2 };
		
		
		int equilibriumPoint = equilibriumPoint(arr,arr.length);
		System.out.println("equilibriumPoint :: "+equilibriumPoint);
	}

	
	public static int equilibriumPoint(long arr[], int n) {

		long sumBefore=0,sumBeforeValidate=0;
		long sumAfter=0;
		
		for(int i=0;i<n;i++)
		{
			//System.out.println("arr[i] :: "+arr[i]+"     sumBefore :: "+sumBefore);
			sumBeforeValidate = sumBefore;
			sumBefore=sumBefore+arr[i];
			sumAfter=0;
			for(int j=i+1;j<n;j++)
			{
				sumAfter = sumAfter + arr[j];
				//System.out.println("i :: "+i+"    j :: "+j+"    arr[i] :: "+arr[i]+"     arr[j] :: "+arr[j]);
			}
			System.out.println("sumBefore :: "+sumBefore+"      arr[i] :: "+arr[i]+"      sum before Validate:: "+sumBeforeValidate+"    sumAfter :: "+sumAfter);
			if(sumBeforeValidate==sumAfter)
				return i+1;
		}
		
		return -1;
	}
	
	
	// not working but useful logic here
	public static int equilibriumPoint2(long arr[], int n) {

		if(arr.length==1) {
			return 1;
		}
		
		long forward_sum=0;
		long backward_sum=0;
		
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--) {
			
			forward_sum = forward_sum + arr[i];
			backward_sum = backward_sum + arr[j];
			
//			if(forward_sum == backward_sum) {
//				return j;
//			}
			System.out.println("i :: "+i+"    j :: "+j+"   forward_sum :: "+forward_sum+"    backward_sum :: "+backward_sum);
		}
		
		return -1;
	}

}
