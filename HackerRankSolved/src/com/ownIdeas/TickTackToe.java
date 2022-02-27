package com.ownIdeas;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TickTackToe {

	public static void main(String[] args) {
		try {
			PrintWriter p = new PrintWriter("v.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
