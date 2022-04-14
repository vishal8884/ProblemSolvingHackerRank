//package amazon.assesment;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class T3 {
//
//	public static void main(String[] args) {
//
//		List<List<Integer>> lot = new ArrayList<List<Integer>>();
//		
//		List<Integer> l1 = Arrays.asList(1,1,1,1);
//		List<Integer> l2 = Arrays.asList(0,1,1,1);
//		List<Integer> l3 = Arrays.asList(0,1,0,1);
//		List<Integer> l4 = Arrays.asList(1,1,9,1);
//		List<Integer> l5 = Arrays.asList(0,0,1,1);
//
//		lot.add(l1);
//		lot.add(l2);
//		lot.add(l3);
//		lot.add(l4);
//		lot.add(l5);
//		
//		int res=distanceTraversed(lot);
//		
//		System.out.println("res :: "+res);
//	}
//	
//	public static int distanceTraversed2(List<List<Integer>> lot) {
//
//		
//	}
//	
//	
//	
//
//	public static int distanceTraversed(List<List<Integer>> lot) {
//
//		boolean[][] visited = new boolean[lot.size()][lot.get(0).size()];
//		int currentLot=0,count=0,c=0;
//		
//		for(int i=0;i<lot.size();i++)
//		{
//			for(int j=0;j<lot.get(i).size();j++)
//			{
//				c++;
//				currentLot = lot.get(i).get(j);
//
//					if(!visited[i][j] && currentLot!=0)
//					{
//						visited[i][j]=true;
//					}
//
//				
//				System.out.println("i :: "+i+"    j :: "+j+"   lot.get(i).get(j) :: "+currentLot+"    count :: "+count+"    c :: "+c);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("visited :: "+Arrays.deepToString(visited));
//		
//		return -1;
//	}
//	
//	
//	public int bfsFindShortestDistance(int source,int destination)
//	{
//		boolean visited[] = new boolean[adj.length];
//		int[] parent = new int[adj.length];
//		Queue<Integer> q = new LinkedList<>();
//		
//		visited[source] = true;
//		parent[source] = -1;
//		q.add(source);
//		
//		while(!q.isEmpty())
//		{
//			int curr = q.poll();
//			if(curr == destination)
//				break;
//			
//			for(int neighbour : adj[curr])
//			{
//				if(!visited[neighbour])
//				{
//					visited[neighbour] = true;
//					parent[neighbour] = curr;
//					q.add(neighbour);
//				}
//			}
//		}
//		
//		int curr2=destination;
//		int distance =0;
//		
//		while(parent[curr2]!=-1)
//		{
//			System.out.print(curr2+" <-");
//			curr2 = parent[curr2];
//		}
//		System.out.println(curr2);
//		return distance;
//	}
//	
//	
//
//}
