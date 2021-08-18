package com.readAndWriteTextFiles;

import java.io.*;

public class ReadAndWriteText {

	public static void main(String[] args){

		write("my name is vishal and adding this");
		try {
			read("input.txt");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	
	public static void read(String filePath) throws IOException
	{
		 FileReader fr=new FileReader(filePath);    
         int i;    
         while((i=fr.read())!=-1)    
         System.out.print((char)i);    
         fr.close();    
	}
	
	public static void write(String s)
	{
		try{    
	           FileWriter fw=new FileWriter("testWrite.txt");    
	           fw.write(s);    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    
	}
