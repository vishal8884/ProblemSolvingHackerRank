package com.problemSolving;

import java.util.LinkedList;
import java.util.Queue;

public class Qtest {

	public static void main(String[] args) throws IllegalStateException {

		// create object of Queue
		Queue<Integer> Q = new LinkedList<Integer>();

		// Add numbers to end of Queue
		Q.add(78);
//		Q.add(35658786);
//		Q.add(5278367);
//		Q.add(74381793);

		// print queue
		System.out.println("Queue: " + Q);

		// print head and deletes the head
		//Q.poll();
		int poll = Q.poll();
		System.out.println("Queue's head: " + poll);
		
		
		System.out.println("Queue after: " + Q);
		
		LinkedList<Integer>[] arr = new LinkedList[4]; 
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = new LinkedList<Integer>();
			arr[i].add(1+i);
			arr[i].add(2+i);
			arr[i].add(3+i);
			arr[i].add(4+i);
			
			System.out.println("i :: "+i+"     arr :: "+arr[i]);
		}
		
		
//		for(int temp : arr[null])
//		{
//			
//		}
		

	}

}
