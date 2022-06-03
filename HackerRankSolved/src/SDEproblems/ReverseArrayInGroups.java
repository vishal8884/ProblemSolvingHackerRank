package SDEproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayInGroups {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		reverseInGroups(arr,5,77);
		
	}

	
		static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
			
			int k_actual=0,iterating_length=0,remaining_elem_to_iterate=0,lastElem=0;
			
			k_actual = k>=n ? k%n :k;
			iterating_length = n/k_actual;
			remaining_elem_to_iterate = n%k_actual;
			
			System.out.println("k_actual :: "+k_actual+"    n :: "+n+"    iterating lenfth :: "+iterating_length+"    remaining elem :: "+remaining_elem_to_iterate);
			System.out.println("actual arr :: "+arr);
			
			
			for(int i=0,j=0;i<iterating_length;i++,j=j+k_actual){
				
				System.out.println("i :: "+i+"    j :: "+j);
				rev(arr,j,j+k_actual-1);
				lastElem=j+k_actual-1;
			}
			
			rev(arr,lastElem+1,n-1);

	    }
		
		public static void rev(ArrayList<Integer> arr,int low_ip,int high_ip) {
			int high = high_ip;
			int low = low_ip;
			
			while(low<high) {
				int temp=arr.get(low);
				arr.set(low,arr.get(high));
				arr.set(high, temp);
				high--;
				low++;
			}
			
			System.out.println("revered arr :: "+arr+"    low :: "+low+"     high :: "+high);
		}
}


//for(int i=0,j=0;i<iterating_length;i++,j=j+k)
//{
//	System.out.println("i :: "+i+"    j :: "+j);
//	rev(arr,j,j+k-1);
//}

//rev(arr,0,2);  //0,k-1
//rev(arr,3,5);  //k,k+2
//rev(arr,6,8);  //k+3,k+5



//iterating_length = n%2!=0 ? n/k_actual+1 : n/k_actual;