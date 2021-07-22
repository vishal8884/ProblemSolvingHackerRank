package com.interview;

import java.util.Arrays;

public class BestTimeToBuyAndSell {
	
	public static void main(String[] args) {
		
		int[] arr= {7,1,5,3,6,4};
		int res=maxProfit00(arr);
		
		System.out.println("The profit is of price :: "+res);
	}
	
	
	public static int maxProfit00(int[] arr) 
	{
		int profit=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[i-1])
			{
				profit=profit+arr[i]-arr[i-1];
				System.out.println("profit in loop :: "+profit);
			}
		}
		
		System.out.println(profit);
		return profit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int maxProfit3(int[] arr) {
		
		System.out.println("arr :: "+Arrays.toString(arr));
		
        int len=arr.length;
       
       if(arr.length<=1)
	  {
		  return 0;
	  }
     
     int buy=0,sell=0,profit=0,originalMax=Integer.MIN_VALUE,res=0,day=0;
     
     for(int i=0;i<len;i++)
     {
   	if(originalMax>arr[i])
   	{
   		originalMax=arr[i];
   	}
     	if(i==0 && arr[i]<=arr[i+1])                                  // condition for i=0 in min
     	{
     		buy=arr[i];
     	}
     	if(i!=0 && i!=len-1 && arr[i]<=arr[i+1] && arr[i]<=arr[i-1])   //normal condition for all elements except first and last in min
     	{
     		buy=arr[i];
     	}

     	//////////////////////////SELL//////////////////////////////////////
     	
     	
     	if(i!=0 && i!=len-1 && arr[i]>=arr[i+1] && arr[i]>=arr[i-1])   //normal condition for all elements except first and lsat in max
     	{
     		//System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"         max second");
     		sell=arr[i];
     	}
     	if(i==len-1 && arr[len-1]>arr[len-2] && arr[i]>originalMax)                        // condition for i=n-1 in min
     	{
     		
     		sell=arr[i];
     	}
     	profit=sell-buy;
     	if(sell!=0)
     	{
     		res=res+profit;
     	}
     	day=i+1;
     	System.out.println("day :: "+day+"    buy :: "+buy+"    sell :: "+sell+"    profit :: "+profit+"   res :: "+res);

     	sell=0; 
     }
 	
 	return res;
   }
	
	
	
	
  public static int maxProfit(int[] arr) 
  {
	  if(arr.length<=1)
	  {
		  return 0;
	  }
	  
      System.out.println("Array :: "+Arrays.toString(arr));
      int len=arr.length;
      
      int min=0,max=0,maxMinDiff=0,originalMax=Integer.MIN_VALUE,tempMin=0,res=0,day=0;
      
      for(int i=0;i<len;i++)
      {
    	if(originalMax>arr[i])
    	{
    		originalMax=arr[i];
    	}
      	if(i==0 && arr[i]<arr[i+1])                                  // condition for i=0 in min
      	{
      		//System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"         min first");
      		min=arr[i];
      	}
      	if(i!=0 && i!=len-1 && arr[i]<arr[i+1] && arr[i]<arr[i-1])   //normal condition for all elements except first and last in min
      	{
      		//System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"         min second");
      		min=arr[i];
      	}

      	if(i!=0 && i!=len-1 && arr[i]>arr[i+1] && arr[i]>arr[i-1])   //normal condition for all elements except first and lsat in max
      	{
      		//System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"         max second");
      		max=arr[i];
      	}
      	if(i==len-1 && arr[len-1]>arr[len-2] && arr[i]>originalMax)                        // condition for i=n-1 in min
      	{
      		//System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"         max second");
      		max=arr[i];
      	}
      	
      	maxMinDiff=max-min;
      	if(max!=0)
      	{
      		res=res+maxMinDiff;
      	}
      	day=i+1;
      	System.out.println("day :: "+day+"    buy :: "+min+"    sell :: "+max+"    profit :: "+maxMinDiff+"   res :: "+res);
      	
      	
      	max=0; 
      }
  	
  	return res;
  }
	
	
	
	
	
	
	
	
	
	
	 public static int maxProfit2(int[] arr) 
	    {
	        System.out.println("Array :: "+Arrays.toString(arr));
	        int len=arr.length;
	        int minTillNow=Integer.MAX_VALUE;
	        int maxTillNow=Integer.MIN_VALUE;
	        
	        for(int i=0;i<len;i++)
	        {
	        	if(minTillNow>arr[i])
	        	{
	        		minTillNow=arr[i];
	        	}
	        	System.out.println("i :: "+i+"     arr :: "+arr[i]+"   minTillNow :: "+minTillNow);
	        }
	    	
	    	return 0;
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
//    public static int maxProfit(int[] arr) 
//    {
//        System.out.println("Array :: "+Arrays.toString(arr));
//        int len=arr.length;
//        
//        for(int i=0;i<len;i++)
//        {
//        	if(i==0 && arr[i]<arr[i+1])                                  // condition for i=0 
//        	{
//        		System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"         first");
//        	}
//        	if(i!=0 && i!=len-1 && arr[i]<arr[i+1] && arr[i]<arr[i-1])   //normal condition for all elements except first and lsat
//        	{
//        		System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"         second");
//        	}
//        	if(i==len-1 && arr[len-1]<arr[len-2])                        // condition for i=n-1
//        	{
//        		System.out.println("i :: "+i+"   arr[i] :: "+arr[i]+"         third");
//        	}
//        	
//        }
//    	
//    	return 0;
//    }

}



//int[] arr2= {7,6,4,3,1};
//int[] arr3= {1,2,3,4,5};
//int[] arr4= {1};
//int[] arr5= {2,2,5};
//int[] arr6= {5,2,3,2,6,6,2,9,1,0,7,4,5,0};