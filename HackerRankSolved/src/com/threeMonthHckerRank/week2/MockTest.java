package com.threeMonthHckerRank.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MockTest {

	public static int max=Integer.MIN_VALUE;
	
	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> l1 = Arrays.asList(12,42,83,300);
		List<Integer> l2 = Arrays.asList(56,125,56,49);
		List<Integer> l3 = Arrays.asList(15,78,101,43);
		List<Integer> l4 = Arrays.asList(119,93,114,62);
		
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		
		flippingMatrix(list);
	}

	public static int flippingMatrix(List<List<Integer>> matrix) {
		int sum = 0;
		int n=matrix.size();
		for(int i = 0; i < n; i++)
        {
          for(int j = 0; j < n; j++)
          {
              int num1 = matrix.get(i).get((2*n) - j - 1);
              int num2 = matrix.get(i).get(j);
              int num3 = matrix.get((2*n) - i - 1).get(j);
              int num4 = matrix.get((2*n) - i - 1).get((2*n) - j - 1);
              //System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
              sum += Math.max(num1, Math.max(num2, Math.max(num3, num4)));
          }
        }
        System.out.println(sum);
    
        return sum;
	}
	
	
  public static List<List<Integer>> reverseColumn(List<List<Integer>> list,int col) {
		
		int x = list.size()-1;
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.get(i).size();j++) {
				if(j==col && i<list.size()/2) {
					int temp = list.get(i).get(j);
					list.get(i).set(j, list.get(x).get(j));
					list.get(x).set(j, temp);
					x--;
				}
			}
		}
		
		return list;
	}
	
	public static int flippingMatrix2(List<List<Integer>> matrix) {

		int size = matrix.size(),Leftquadrant =size/2;
		int sum=0;
		int x =size-1,y=0;
		
		for(int i=0;i<size;i++) {
			x=size-1;
			y=0;
			for(int j=0;j<matrix.get(i).size();j++) {
				int elem = matrix.get(i).get(j);
				if(i<Leftquadrant && j<Leftquadrant) {
					int q14 = matrix.get(i).get(x);
					int q41 = matrix.get(x).get(y);
					int q44 = matrix.get(x).get(x);
					int max11 = Math.max(Math.max(q14, q41),q44);
					int temp = matrix.get(i).get(j);
					int temp2=0;
					if(max11 == q14) {
						temp2 = matrix.get(i).get(x);
					}
					else if(max11 == q41) {
						temp2 = matrix.get(x).get(y);
					}
					else {
						temp2 = matrix.get(x).get(x);
					}
					matrix.get(i).set(j,max11);
					System.out.println("elem :: "+elem+"        q14 :: "+q14+"     q41 :: "+q41+"     q44 :: "+q44+"      max11 ::"+max11+"     temp2 :: "+temp2);
					x--;
					y++;
				}
				
			}
			System.out.println();
		}
		
		System.out.println(matrix);
		
		return sum;
	}

	public static int flippingMatrix3lastest(List<List<Integer>> matrix) {

		int size = matrix.size(),Leftquadrant =size/2;;
		int x=size-1;
		for(int i=0;i<size;i++) {
			for(int j=0;j<matrix.get(i).size();j++) {
				int elem = matrix.get(i).get(j);
				max=0;
				if(i<Leftquadrant && j<Leftquadrant) {
					int q14 = matrix.get(i).get(x);
					int q41 = matrix.get(x).get(0);
					int q44 = matrix.get(x).get(x);
					
					if(q14>elem && q14>q41 && q14> q44) {
						Collections.reverse(matrix.get(i));
						break;
					}
					else if(q41>elem && q41>q14 && q41> q44) {
						reverseColumn(matrix, 0);
						break;
					}
					else if(q44>elem && q44>q14 && q44> q41) {
						Collections.reverse(matrix.get(3));
						reverseColumn(matrix, 0);
						break;
					}
					System.out.println("i ::"+i+"       elem :: "+elem+"      q14 :: "+q14+"      q41 :: "+q41+"       q44 :: "+q44+"      max :: "+max+"       x :: "+x);
					x--;
				}
			}
				
			System.out.println();
		}
		
		
		System.out.println("matrix :: "+matrix);
		
		return -1;
	}
}



//public static int flippingMatrix(List<List<Integer>> matrix) {
//
//	int size = matrix.size();
//	int max = 0,sum=0,max2=-10;
//	
//	for(int i=0;i<size;i++) {
//		for(int j=0;j<matrix.get(i).size();j++) {
//			
//			if(i<size/2 && j<size/2) {
//				int elem = matrix.get(i).get(j);
//				sum=sum+elem;
//				max=sum;
//			    System.out.println("i :: "+i +"     j :: "+j+"        elem :: "+elem+"     sum :: "+sum);
//			    while(max>max2) {
//			    	Collections.reverse(matrix.get(i));
//			    	
//			    }
//			}
//		}
//		System.out.println();
//	}
//	
//	
//	return -1;
//}