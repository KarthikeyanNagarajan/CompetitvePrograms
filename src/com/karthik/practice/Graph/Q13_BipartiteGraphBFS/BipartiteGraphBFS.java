package com.karthik.practice.Graph.Q13_BipartiteGraphBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraphBFS
{
	private boolean bfs(int start, int V, int color[], ArrayList<ArrayList<Integer>> adj)
	{
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		color[start] = 0;

		while (!q.isEmpty())
		{
			int node = q.poll();
			for (int it : adj.get(node))
			{
				if (color[it] == -1)
				{
					color[it] = 1 - color[node];
					q.add(it);
				}
				// if previously coloured and have the same colour
				else if (color[it] == color[node])
				{
					return false;
				}
			}
		}
		return true;
	}

	public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj)
	{
		int color[] = new int[V];
		for (int i = 0; i < V; i++)
			color[i] = -1;

		// for connected components
		for (int i = 0; i < V; i++)
		{
			if (color[i] == -1)
			{
				if (!bfs(i, V, color, adj))
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		// V = 4, E = 4
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < 4; i++)
		{
			adj.add(new ArrayList<>());
		}
		adj.get(0).add(2);
		adj.get(2).add(0);
		adj.get(0).add(3);
		adj.get(3).add(0);
		adj.get(1).add(3);
		adj.get(3).add(1);
		adj.get(2).add(3);
		adj.get(3).add(2);

		BipartiteGraphBFS obj = new BipartiteGraphBFS();
		boolean ans = obj.isBipartite(4, adj);
		if (ans)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
