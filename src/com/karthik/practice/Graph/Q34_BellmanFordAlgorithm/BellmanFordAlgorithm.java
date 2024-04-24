package com.karthik.practice.Graph.Q34_BellmanFordAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFordAlgorithm
{
	public static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S)
	{
		int[] dist = new int[V];
		for (int i = 0; i < V; i++)
			dist[i] = (int) 1e9;
		dist[S] = 0;

		for (int i = 0; i < V - 1; i++)
		{
			for (ArrayList<Integer> it : edges)
			{
				int u = it.get(0);
				int v = it.get(1);
				int wt = it.get(2);
				if (dist[u] != (int) 1e9 && dist[u] + wt < dist[v])
					dist[v] = dist[u] + wt;
			}
		}

		for (ArrayList<Integer> it : edges)
		{
			int u = it.get(0);
			int v = it.get(1);
			int wt = it.get(2);
			if (dist[u] != (int) 1e9 && dist[u] + wt < dist[v])
			{
				int[] temp = { -1 };
				return temp;
			}
		}
		return dist;
	}

	public static void main(String[] args)
	{
		int V = 6;
		int S = 0;
		ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>()
		{
			{
				add(new ArrayList<Integer>(Arrays.asList(3, 2, 6)));
				add(new ArrayList<Integer>(Arrays.asList(5, 3, 1)));
				add(new ArrayList<Integer>(Arrays.asList(0, 1, 5)));
				add(new ArrayList<Integer>(Arrays.asList(1, 5, -3)));
				add(new ArrayList<Integer>(Arrays.asList(1, 2, -2)));
				add(new ArrayList<Integer>(Arrays.asList(3, 4, -2)));
				add(new ArrayList<Integer>(Arrays.asList(2, 4, 3)));
			}
		};

		int[] dist = BellmanFordAlgorithm.bellman_ford(V, edges, S);
		for (int i = 0; i < V; i++)
		{
			System.out.print(dist[i] + " ");
		}
		System.out.println("");
	}
}
