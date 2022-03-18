package com.learnGraphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphImplementation {
	
	private LinkedList<Integer> adj[];
	
	public GraphImplementation(int v)
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
	
	
	public int bfs(int source,int destination){
		
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<Integer>();
		
		vis[source]=true;
		parent[source]=-1;
		q.add(source);
		
		while(!q.isEmpty())
		{
			int curr = q.poll();
			
			if(destination == curr)
				break;
			
			for(int neighbour : adj[curr])
			{
				if(!vis[neighbour])
				{
					vis[neighbour]=true;
					parent[neighbour] = curr;
					q.add(neighbour);
				}
			}
		}
		
		int curr = destination;
	    int distance = 0;
		while(parent[curr] != -1)
		{
			System.out.print(curr+" <-");
			curr = parent[curr];
			distance++;
		}
		System.out.println(curr);
		return distance;
			
	}
		  
	public boolean dfsUtil(int source,int destination,boolean[] vis)
	{
		if(source==destination)
			return true;
		
		for(int neighbour : adj[source])
		{
			boolean isConnected = dfsUtil(source, destination, vis);
			if(isConnected)
				return true;
		}
		return false;
	}
	
	
	public boolean dfs(int source,int destination)
	{
		boolean[] vis = new boolean[adj.length];
		vis[source]=true;
		
		return dfsUtil(source, destination, vis);
	}
	
	public static void main(String[] args) {
		//System.out.println("enter the value of v and e");
		
		int v= 5;
		int e= 6;
		GraphImplementation graphImplementation = new GraphImplementation(v);
		
		int[] sourcesArr = {0,0,4,1,2,1};
		int[] destinationArr = {3,4,3,4,3,2};
		
		for(int i=0;i<e;i++)
		{
			graphImplementation.addEdges(sourcesArr[i], destinationArr[i]);
		}
		
		// checking 
		
		int distanceObtained=graphImplementation.bfs(0,2);
		
		System.out.println("distance obtained :: "+distanceObtained);
	}
	
}
