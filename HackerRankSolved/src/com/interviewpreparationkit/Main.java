package com.interviewpreparationkit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		//int[] q = {2, 1, 5, 3, 4};
		//int[] q = {2, 5, 1, 3, 4};
		int[] q = {1, 2, 5, 3 ,7, 8 ,6, 4};
		minimumBribes(q);
	}
	
	static void minimumBribes(int[] arr) {

	    List<Integer> list = new ArrayList<Integer>();
		int temp=0,c=0;
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(Arrays.toString(arr));
			for(int j=i+1;j<arr.length;j++)
			{
			
				if(arr[i]>arr[j])
				{
					System.out.println("i :: "+i+"    j::"+j);
					list.add(i);
					list.add(j);
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					c++;
				}
			}
		}
		
		int[] arr2 = new int[list.size()];
		int x=0;
		for(int i : list)
		{
			arr2[x++]=i;
		}
		
		
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		int maxcount=maxRepeatingElementUsingMap(arr2);
		
		System.out.println("max count :: "+maxcount);
		System.out.println("c :: "+c);
		
		if(maxcount>2)
			System.out.println("Too chaotic");
		else
			System.out.println(maxcount);

    }
	
	
	
	
	
	
	public static int maxRepeatingElementUsingMap(int [] arrA){
        //Will store each character and it's count
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <arrA.length; i++) {
            if(map.containsKey(arrA[i])){
                map.put(arrA[i],map.get(arrA[i])+1);
            }else{
                map.put(arrA[i], 1);
            }
        }

        //traverse the map and track the element which has max count
        Iterator entries = map.entrySet().iterator();
        int maxCount = 0;
        int element =arrA[0];
        while(entries.hasNext()){
            Map.Entry entry = (Map.Entry) entries.next();
            int count = (Integer)entry.getValue();
            if(maxCount<count){
                maxCount = count;
                element = (Integer)entry.getKey();
            }
        }
        return maxCount;
    }
	
	
	


}



//System.out.println("c :: "+c+"   q[i] ::"+q[i]+"    q[j] :: "+q[j]);
//System.out.println("i :: "+i+"    j::"+j);