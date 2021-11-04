package com.interview;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {

		char[][] arr =
		{{'5','3','.','.','7','.','.','.','.'}
		,{'6','.','.','1','9','5','.','.','.'}
		,{'.','9','8','.','.','.','.','6','.'}
		,{'8','.','.','.','6','.','.','.','3'}
		,{'4','.','.','8','.','3','.','.','1'}
		,{'7','.','.','.','2','.','.','.','6'}
		,{'.','6','.','.','.','.','2','8','.'}
		,{'.','.','.','4','1','9','.','.','5'}
		,{'.','.','.','.','8','.','.','7','9'}};
		
		boolean res = isValidSudoku4(arr);
		System.out.println("res :: "+res);
	}
	
	
	public static boolean isValidSudoku4(char[][] board) 
	{
        int N = 9;

        // Use hash set to record the status
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];
        
        //initialize the boxes
        
        for (int r = 0; r < N; r++)
        {
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                char val = board[r][c];

                
                
                // Check if the position is filled with number
                if (val == '.') {
                    continue;
                }

                // Check the row
                if (rows[r].contains(val)) {
                    return false;
                }
                rows[r].add(val);

                // Check the column
                if (cols[c].contains(val)) {
                    return false;
                }
                cols[c].add(val);

                // Check the box
                int idx = (r / 3) * 3 + c / 3;
                if (boxes[idx].contains(val)) {
                    return false;
                }
                boxes[idx].add(val);
                
                System.out.println("r :: "+r+"   c :: "+c+"     val :: "+val+"   rows[r] ::"+rows[r]+"    cols[c] ::"+cols[c]+"             boxes[idx] ::"+boxes[idx]+"           idx :: "+idx);
            }
        }
        return true;
    }
	
	
	//System.out.println("rows :: "+rows+"      cols :: "+cols+"    boxes :: "+boxes);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 public static boolean isValidSudokuGrid(char[][] arr)
	 {
		 
		 int n=arr.length,mid=0,c=0,prod3i=3,prod3j=3,prodistart=0,prodjstart=0,c2=0,jcount=0;
		 boolean jCountis2=false;
		 Set<Character> set = new HashSet<Character>();
		 
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 char elem = arr[i][j];
				 if(i>=prodistart && i<prod3i)
				 {
					 if(j>=prodjstart && j<prod3j)
					 {
		              
				      c++; c2++;
					  set.add(elem);
					  System.out.println("i :: "+i+"     j :: "+j+"    elem :: "+elem+"    set :: "+set+"    c :: "+c+"       c2 :: "+c2+"      jcount :: "+jcount);
					  if(jcount==2)
						  jcount++;
					 }
					 if(c==9 && (i!=8 && j!=8) && (jcount!=3))
					 {
						 prodjstart=prodjstart+3;
						 prod3j=prod3j+3;
						 c=0;
						 i=0;
						 j=0;
						 set = new HashSet<Character>();
						 jcount++;
						 System.out.println("////////////////////////////////////////////////////////////////////////////////////////");
					 }
					 if(jcount==3)
					 {
						 System.out.println("****************************************************************************************");
						 prodjstart=0;
						 prod3j=3;
						 prodistart=prodistart+3;
						 prod3i=prod3i+3;
						 c2=0;
						 i=0;
						 jcount=0;
				    	 set = new HashSet<Character>();
					 }
					
				 }
			 }
		 }
		 
		 return true;
	 }
	
	
	
	
	
	
	
	
	
	 public static boolean isValidSudoku(char[][] arr)
	 {
	     boolean isValidVer = isValidSudokuVertical(arr);
	     boolean isValidHor = isValidSudokuHorizontal(arr);
		 
	     boolean res = isValidVer && isValidHor;
	     
		 return res;
	 }
	
	 
	 
	 
    public static boolean isValidSudokuVertical(char[][] arr) 
    {
    	int n=arr.length,ver=0,c=0,verCount=0;
    	Set<Character> set = new HashSet<Character>();
    	
    	for(int i=0;i<n;i++)
   	    {
   		 for(int j=0;j<n;j++)
   		 {
   			 if(j==ver)
   			 {
   			   char elem=arr[i][j];
   		       c++;
   		       if(elem!='.')
   		       {
   		    	   verCount++;
   		    	   set.add(elem);
   		       }
   		       
   		      System.out.println("i :: "+i+"    j :: "+j+"   elem :: "+elem+"   c :: "+c+"   set :: "+set+"    verCount :: "+verCount);
   			 }
   			 if(c==n-1)
   			 {
   				 i=0;
   				 c=0;
   				 ver++;
   				 if(verCount!=set.size())
   					 return false;
   				 verCount=0;
   				 set = new HashSet<Character>();
   			 }
   		 }
   	    }
    	
    	return true;
 
    }
	
	
     public static boolean isValidSudokuHorizontal(char[][] arr) 
     {
         int n=arr.length,horizontal=0,verNo=0;
         Set<Character> set = new HashSet<Character>();
    	 for(int i=0;i<n;i++)
    	 {
    		 for(int j=0;j<n;j++)
    		 {
    			 char elem = arr[i][j];
    			 if(elem!='.')
    			 {
    				 horizontal++;
    				 set.add(elem);
    			 }

    			 System.out.println("i :: "+i+"   j :: "+j+"    elem :: "+elem+"      horizontal :: "+horizontal+"    set :: "+set+"    setsize :: "+set.size());
    			 if(j==n-1)
    			 {
    				 if(horizontal!=set.size())
    					 return false;
    				 set = new HashSet<Character>();
    			 }
    		 }
    		 horizontal=0;
    		 //verNo++; // this is used to count vertical line
    	 }
    	 return true;
     }

}
