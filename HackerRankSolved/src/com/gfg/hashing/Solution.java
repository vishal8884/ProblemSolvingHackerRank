package com.gfg.hashing;

import java.util.ArrayList;
import java.util.List;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}


class Solution {
	
	public static void main(String[] args) {
		long[] A = {1, 2, 4, 5, 7};
		long[] B = {5,6,3,4,8};
		
		pair[] allPairs = allPairs(A, B, A.length, B.length, 9);
		
		
	}
	
    public static pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here
    	List<pair> pairList = new ArrayList<>(); 
    	int c=0;
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<M;j++) {
    			if(A[i]+B[j] == X) {
    				pair p = new pair(A[i],B[j]);
    				pairList.add(p);
    				System.out.println("A[i] :: "+A[i]+"   B[j] :: "+B[j]);
    			}
    		}
    	}
    	
    	pair[] pairArr = new pair[pairList.size()];
    	
    	for(pair p : pairList) {
    		pairArr[c]= p;
    		c++;
    	}
    	
    	return pairArr;
    }
}