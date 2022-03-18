package com.learnGraphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph2 {
	
	private LinkedList<Integer>[] adj;
	
	public Graph2(int v)
	{
		adj = new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdges(int source,int destination)
	{
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public int bfsFindShortestDistance(int source,int destination)
	{
		boolean visited[] = new boolean[adj.length];
		int[] parent = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();
		
		visited[source] = true;
		parent[source] = -1;
		q.add(source);
		
		while(!q.isEmpty())
		{
			int curr = q.poll();
			if(curr == destination)
				break;
			
			for(int neighbour : adj[curr])
			{
				if(!visited[neighbour])
				{
					visited[neighbour] = true;
					parent[neighbour] = curr;
					q.add(neighbour);
				}
			}
		}
		
		int curr2=destination;
		int distance =0;
		
		while(parent[curr2]!=-1)
		{
			System.out.print(curr2+" <-");
			curr2 = parent[curr2];
		}
		System.out.println(curr2);
		return distance;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		int v=5;
		int e=6;
		
		int[] source = {0,0,4,1,2,1};
		int[] destination = {3,4,3,4,3,2};
		
		Graph2 graph = new Graph2(v);
		
		for(int i=0;i<e;i++)
		{
			graph.addEdges(source[i],destination[i]);
		}
		
		graph.bfsFindShortestDistance(0,2);
	}

}
