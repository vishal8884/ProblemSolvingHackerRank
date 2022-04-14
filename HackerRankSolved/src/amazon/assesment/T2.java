package amazon.assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T2 {

	public static void main(String[] args) {

		
		List<List<Integer>> all = new ArrayList<List<Integer>>();
		
//		List<Integer> l1 = Arrays.asList(1,2);
//		List<Integer> l2 = Arrays.asList(3,4);
//		List<Integer> l3 = Arrays.asList(1,-1);
		
		List<Integer> l1 = Arrays.asList(-3,2);
		List<Integer> l2 = Arrays.asList(1,2);
		List<Integer> l3 = Arrays.asList(3,2);
		List<Integer> l4 = Arrays.asList(4,2);
		List<Integer> l5 = Arrays.asList(5,4);
		
		all.add(l1);
		all.add(l2);
		all.add(l3);
		all.add(l4);
		all.add(l5);
		
		List<List<Integer>> deliveryPlan = deliveryPlanUsingRecursion(all,3);
		
		System.out.println("res :: "+deliveryPlan);
	}
	
	public static List<List<Integer>> deliveryPlanUsingRecursion(List<List<Integer>> allLocations, int numDeliveries) 
	{
        if(numDeliveries==0)
        {
        	return allLocations;
        }
		System.out.println("allLocations :: "+allLocations+"    num :: "+numDeliveries);
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int x=0,y=0,temp=0;
		double sqrt=0;
		
		Map<Double,List<Integer>> map = new HashMap<Double,List<Integer>>();
		
		for(List<Integer> location : allLocations)
		{
			for(int i=0;i<location.size();i++)
			{
				x=location.get(0);
				y=location.get(1);
				temp = x*x + y*y;
				if(i==1)
				{
				   sqrt = Math.sqrt(temp);
				   map.put(sqrt,location);
				}
				System.out.println("x :: "+x+"    y :: "+y+"    temp :: "+temp+"    sqrt :: "+sqrt);
				
				sqrt=0;
			}
			System.out.println();
		}

		List<Double> sqrtList = new ArrayList<>(map.keySet());
		Collections.sort(sqrtList);
		
		System.out.println("map :: "+map+"     sqrtList :: "+sqrtList);
		
		if(sqrtList.size()>=numDeliveries)
		{
			    res.add(map.get(sqrtList.get(0)));
		}

		return deliveryPlanUsingRecursion(res,numDeliveries-1);
	}

	public static List<List<Integer>> deliveryPlan(List<List<Integer>> allLocations, int numDeliveries) 
	{
		System.out.println("allLocations :: "+allLocations);
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int x=0,y=0,temp=0;
		double sqrt=0;
		
		Map<Double,List<Integer>> map = new HashMap<Double,List<Integer>>();
		
		for(List<Integer> location : allLocations)
		{
			for(int i=0;i<location.size();i++)
			{
				x=location.get(0);
				y=location.get(1);
				temp = x*x + y*y;
				if(i==1)
				{
				   sqrt = Math.sqrt(temp);
				   map.put(sqrt,location);
				}
				System.out.println("x :: "+x+"    y :: "+y+"    temp :: "+temp+"    sqrt :: "+sqrt);
				
				sqrt=0;
			}
			System.out.println();
		}

		List<Double> sqrtList = new ArrayList<>(map.keySet());
		Collections.sort(sqrtList);
		
		System.out.println("map :: "+map+"     sqrtList :: "+sqrtList);
		
		if(sqrtList.size()>=numDeliveries)
		{
		    for(int i=0;i<numDeliveries;i++)
		    {
			    res.add(map.get(sqrtList.get(i)));
		    }
		}

		return res;
	}

}
