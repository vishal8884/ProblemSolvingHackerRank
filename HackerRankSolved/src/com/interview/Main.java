package com.interview;
/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */
/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
    public static Map<Integer,String> processData(ArrayList<String> array) {
        /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return a Map containing
         * the appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
    	String cids="";
    	int cid=0;
    	String votesc="",votesc2="";
    	int votes=0;
    	
    	String constituency="";
    	Map<Integer,String> retVal = new HashMap<Integer,String>();
    	Map<Integer, String> temp = new HashMap<Integer, String>();
    	Map<Integer,Integer> votemap = new HashMap<Integer, Integer>();
    	
    	for(int i=0;i<array.size();i++)
    	{

    		String[] arr = array.get(i).split(",");
    		
    		cids=arr[0];
    		cid=Integer.parseInt(cids);
    		constituency=arr[2];
    		votesc=arr[3];
    		votesc2=votesc.replaceAll(" ", "");
    	    votes=Integer.parseInt(votesc2);
    		
    		temp.put(cid, constituency);
    		votemap.put(cid,votes);
    		
    		//System.out.println("array ::" +array.get(i)+"         arr ::"+Arrays.toString(arr) +"      cid :: "+cid+"      constutancy ::"+constituency+"    votes :: "+votesc);
    	}
    	
    	//System.out.println(temp);
    	HashMap<Integer, String> sorted = sortHashMapByValues(temp);
    	//System.out.println("sorted :: "+sorted);
    	
    	int maxkey=0,key=0,c=0;
		String value="",tempval="",temp2="";
    	boolean inside=false;
		
    	for (Map.Entry<Integer,String> entry : sorted.entrySet())
    	{
    		c++;
    		temp2=tempval;
    		key=entry.getKey();
    		value =entry.getValue();
    		tempval=value;
    		
    		if(temp2=="" || value.equals(temp2))
    		{
    			inside=true;
    			if(key>maxkey)
    			{
    				maxkey=key;
    			}
    		}
    		else
    		{
    			retVal.put(maxkey,temp2);
    			maxkey=0;
    			inside=false;
    		}
    		if(c==sorted.size())
    		{
    			retVal.put(maxkey, value);
    		}
            //System.out.println("Key = " + key +", Value = " + value+"   temp2 :: "+temp2+"    inside :: "+inside+"    maxkey ::"+maxkey+"     c :: "+c+"    length of map :: "+sorted.size()+"     retVal :: "+retVal);
            
    	}
    	
    	HashMap<Integer, String> res = sortHashMapByValues(retVal);
    	
    	HashMap<Integer, String> fina = new HashMap<Integer, String>();
    	
    	
    	
        
        
        
       int key2=0;
       String value2="";
        
        
        for (Map.Entry<Integer,String> entry : res.entrySet())
        {
        	key2=entry.getKey();
    		value2 =entry.getValue();
    		int vote=votemap.get(key2);
    		
    		fina.put(vote, value2);
    		
    		//System.out.println("key :: "+key2+"   val :: "+value2+"   vote :: "+vote);
        }
        
        HashMap<Integer, String> finares = sortHashMapByValues(fina);
        
        
        
       return finares;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<Integer,String> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<Integer,String> e: retVal.entrySet())
            {
            	String val=e.getValue();
            	String val2=val.replaceAll(" ", "");
            	String res=val2 + ": " + e.getKey();
            	output.println(res);
            }
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
    
    
    
    public static LinkedHashMap<Integer, String> sortHashMapByValues(Map<Integer, String> temp)
    {
        List<Integer> mapKeys = new ArrayList<>(temp.keySet());
        List<String> mapValues = new ArrayList<>(temp.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);

        LinkedHashMap<Integer, String> sortedMap =
            new LinkedHashMap<>();

        Iterator<String> valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            String val = valueIt.next();
            Iterator<Integer> keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) {
                Integer key = keyIt.next();
                String comp1 = temp.get(key);
                String comp2 = val;

                if (comp1.equals(comp2)) {
                    keyIt.remove();
                    sortedMap.put(key, val);
                    break;
                }
            }
        }
        return sortedMap;
    }
    
    
}









//public static Map<String,Integer> processData(ArrayList<String> array) {
//        /* 
//         * Modify this method to process `array` as indicated
//         * in the question. At the end, return a Map containing
//         * the appropriate values
//         *
//         * Please create appropriate classes, and use appropriate
//         * data structures as necessary.
//         *
//         * Do not print anything in this method.
//         *
//         * Submit this entire program (not just this method)
//         * as your answer
//         */
//    	String cids="";
//    	int cid=0;
//    	
//    	String constituency="";
//    	Map<String,Integer> retVal = new HashMap<String,Integer>();
//    	Map<Integer, String> temp = new HashMap<Integer, String>();
//    	
//    	for(int i=0;i<array.size();i++)
//    	{
//
//    		String[] arr = array.get(i).split(",");
//    		
//    		cids=arr[0];
//    		cid=Integer.parseInt(cids);
//    		constituency=arr[2];
//    		
//    		temp.put(cid, constituency);
//    		
//    		//System.out.println("array ::" +array.get(i)+"         arr ::"+Arrays.toString(arr) +"      cid :: "+cid+"      constutancy ::"+constituency);
//    	}
//    	
//    	System.out.println(temp);
//    	Map<Integer, String> sorted = sortHashMapByValues(temp);
//    	System.out.println("sorted :: "+sorted);
//    	
//    	int maxkey=0,key=0,c=0;
//		String value="",tempval="",temp2="";
//    	boolean inside=false;
//		
//    	for (Map.Entry<Integer,String> entry : sorted.entrySet())
//    	{
//    		c++;
//    		temp2=tempval;
//    		key=entry.getKey();
//    		value =entry.getValue();
//    		tempval=value;
//    		
//    		if(temp2=="" || value.equals(temp2))
//    		{
//    			inside=true;
//    			if(key>maxkey)
//    			{
//    				maxkey=key;
//    			}
//    		}
//    		else
//    		{
//    			retVal.put(temp2, maxkey);
//    			maxkey=0;
//    			inside=false;
//    		}
//    		if(c==sorted.size())
//    		{
//    			retVal.put(value, maxkey);
//    		}
//            System.out.println("Key = " + key +", Value = " + value+"   temp2 :: "+temp2+"    inside :: "+inside+"    maxkey ::"+maxkey+"     c :: "+c+"    length of map :: "+sorted.size());
//            
//    	}
//    	
//        System.out.println("res :: "+retVal);
//       return retVal;
//    }
    
    
