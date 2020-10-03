package manju;

import java.util.*;

public class c {
	static final int v = 9;
	public static int getMin(int[] dist,Boolean[] set) {
		int min = Integer.MAX_VALUE,min_index = -1;
		for(int i = 0; i < dist.length; i++) {
			if(set[i] == false && dist[i] <= min) {
				min = dist[i];
				min_index = i;
			}
		}
		return min_index;
	}
	 public static void printSolution(int dist[]) 
	    { 
	        System.out.println("Vertex \t\t Distance from Source"); 
	        for (int i = 0; i < v; i++) 
	            System.out.println(i + " \t\t " + dist[i]); 
	    } 
	public void dijistra(int[][] graph,int src) {
		int[] dist = new int[v];
		Boolean[] set = new Boolean[v];
		for(int i = 0; i < v; i++) {
			dist[i] = Integer.MAX_VALUE;
			set[i] = false;
		}
		dist[src] = 0;
		for(int i = 0; i < v - 1; i++) {
			int u = getMin(dist,set);
			set[u] = true;
			for(int j = 0; j < v; j++) {
				if(set[j]  == false && graph[u][j] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][j] < dist[j]) {
					dist[j] = dist[u] + graph[u][j];
				}
			}
		}
		printSolution(dist);
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
            { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
            { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
            { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
            { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
            { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
            { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
            { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
            c t = new c();
            t.dijistra(graph, 2);
            
        
    }
}
