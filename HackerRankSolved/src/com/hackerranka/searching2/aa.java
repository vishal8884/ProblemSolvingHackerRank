package com.hackerranka.searching2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class aa {

	public static void main(String[] args) {

//		int[] arr = {7,2,5,3,5,3};
//		int[] brr = {7,2,5,3,5,3,4,6};
		int[] arr = {11, 4, 11, 7, 13, 4, 12, 11, 10, 14};
		int[] brr = {11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};
		missingNumbers(arr,brr);
	}
	
	static int[] missingNumbers(int[] arr, int[] brr) {

		List<Integer> real = new ArrayList<Integer>();
        for(int i = 0; i < brr.length; i++){
            real.add(brr[i]);
        }
        for(int j = 0; j < arr.length; j++){
            for(int k = 0; k < arr.length; k++){
                if(arr[j] == real.get(k)){
                    real.remove(new Integer(arr[j]));
                    break;
                }
            }
        }
        System.out.println(real);
        List<Integer> finalreal = real.stream().distinct().collect(Collectors.toList()); //it removes dublicates from lsit

      int[] myArray = new int[finalreal.size()];
      for(int h = 0; h < finalreal.size(); h++){
          myArray[h] = finalreal.get(h);
      }
      Arrays.sort(myArray);
      return myArray;
    }
	
	static int[] icecreamParlor(int m, int[] arr) {

		int sum=0 , ni=0 , nj=0;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				if(sum == m)
				{
					ni=i;
					nj=j;
				}
			}
		}
		int[] res = {ni+1 ,nj+1};
		return res;
    }

}
