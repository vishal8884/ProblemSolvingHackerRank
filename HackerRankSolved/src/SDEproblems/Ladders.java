package SDEproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ladders {

	public static void main(String[] args) {

		//int[] arr = {31 ,40, 93, 40, 98};
		int[] arr = {16,17,4,3,5,2};
		ArrayList<Integer> leaders = leaders(arr, arr.length);
		System.out.println(leaders);
	}
	
	
	public static ArrayList<Integer> leaders(int arr[], int n){   //find the greatest from last

		ArrayList<Integer> list=new ArrayList<Integer>();
		
		int curr = arr[n-1];
		list.add(curr);
		
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>curr)
			{
				curr = arr[i];
				list.add(curr);
			}
		}
		Collections.reverse(list);
	    return list;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static ArrayList<Integer> leadersNonOptimized(int arr[], int n){

		ArrayList<Integer> res = new ArrayList<Integer>();
        int c=0;

		for(int i=0;i<n;i++)
		{
			c=0;
			for(int j=i+1;j<n;j++)
			{
				System.out.println("i :: "+i+"    j :: "+j+"      arr[i] :: "+arr[i]+"     arr[j] :: "+arr[j]);
				if(arr[i]<arr[j])
				{
					break;
				}
				if(j==n-1)
				res.add(arr[i]);
			}
		}
		res.add(arr[n-1]);
		return res;
    }

}
