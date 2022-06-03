package SDEproblems;

import java.util.Arrays;
import java.util.Comparator;

class LargestNumberFormedFromArray {
	

	public static void main(String[] args) {

		String arr[] = { "3", "30", "34", "5", "9" };
		printLargest(arr);
		
	}

	public static String printLargest(String[] arr) {
	
		Comparator<String> customComparator = new Comparator<String>() {
			
			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				String ab = a+b;
				String ba = b+a;
				return ba.compareTo(ab);
			}
		};
		
		
		Arrays.sort(arr,customComparator);
		String res= "";
		for(String s : arr) {
			res = res+ s;
		}
		
		return res;
    }
	
	

}

//public static String printLargest(String[] arr) {
//	// code here
//	for(int i=0;i<arr.length;i++) {
//		
//		String temp="";
//		long li = Long.parseLong(arr[i]);
//		for(int j=i+1;j<arr.length;j++) {
//			
//			long lj = Long.parseLong(arr[j]);
//			if(li>lj) {
//				
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//			System.out.println("i :: "+i+"    li :: "+li+"     lj :: "+lj);
//		}
//		
//		
//	}
//	
//	System.out.println("Arr final :: "+Arrays.toString(arr));
//	
//	return "";
//}

//public static String printLargest(String[] arr) {
//	// code here
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length();j++) {
//			System.out.println("i :: "+i+"    j :: "+j+"    arr[i] :: "+arr[i]+"     arr[i].getj :: "+arr[i].charAt(j));
//		}
//		System.out.println();
//		
//	}
//	
//	System.out.println("Arr final :: "+Arrays.toString(arr));
//	
//	return "";
//}