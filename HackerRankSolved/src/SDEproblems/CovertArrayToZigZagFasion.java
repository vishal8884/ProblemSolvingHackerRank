package SDEproblems;

import java.util.Arrays;

public class CovertArrayToZigZagFasion {

	public static void main(String[] args) {

		int[] arr = {4, 3, 7, 8, 6, 2, 1};
		zigZag(arr,arr.length);
	}
	
	
	public static void zigZag(int arr[], int n) {
		System.out.println("arr :: "+Arrays.toString(arr));
		
		for(int i=0;i<n;i++) {
			
			if(i==0 || i%2==0) {                       //i even case
				if((i!=n-1) && (arr[i]>arr[i+1])) {    // not satisfing a<b case
					int temp=arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				
			}
			else if(i%2!=0) {                          //i odd case
				if((i!=n-1) && (arr[i]<arr[i+1])) {    // not satisfing a>b case
					int temp=arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		System.out.println("res :: "+Arrays.toString(arr));
    }

}
