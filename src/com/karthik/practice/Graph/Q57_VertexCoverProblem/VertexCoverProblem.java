package com.karthik.practice.Graph.Q57_VertexCoverProblem;

import java.util.ArrayList;

public class VertexCoverProblem
{
	public static boolean[] printVertexCover(int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis)
	{
		for (int i = 0; i < V; i++)
		{
			if (!vis[i])
			{
				for (int it : adj.get(i))
				{
					if (!vis[it])
					{
						vis[it] = true;
						vis[i] = true;
						break;
					}
				}
			}
		}
		return vis;
	}

	public static void main(String args[])
	{
		int V = 7;
		int[][] edges = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 } };

		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < V; i++)
		{
			adj.add(new ArrayList<>());
		}

		for (int i = 0; i < edges.length; i++)
		{
			adj.get(edges[i][0]).add(edges[i][1]);
			adj.get(edges[i][1]).add(edges[i][0]);
		}

		boolean[] vis = new boolean[V];
		vis = printVertexCover(V, adj, vis);

		for (int j = 0; j < V; j++)
			if (vis[j])
				System.out.print(j + " ");
	}
}
