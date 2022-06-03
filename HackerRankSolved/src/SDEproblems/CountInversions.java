package SDEproblems;

public class CountInversions {

	public static void main(String[] args) {

		long[] arr = { 2,3,4,5,6};
		
		long res = inversionCount(arr, arr.length);
		
		System.out.println("res :: "+res);
	}

	public static long inversionCount(long arr[], long N) {
		long c=0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				
				if(arr[i]>arr[j]) {
					c++;
				}
				System.out.println("i :: "+i+"     j :: "+j);
				
			}
			System.out.println();
		}
		return c;
	}

}
