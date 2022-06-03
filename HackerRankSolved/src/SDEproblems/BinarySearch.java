package SDEproblems;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = {1 ,2, 3, 4, 5};
		binarysearch(arr, arr.length, 5);
	}
	
	public static int binarysearch(int arr[], int n, int k) {
		
		for(int i=0;i<n;i++) {
			if(arr[i]==k)
				return i;
		}
		
		return -1;
    }

}
