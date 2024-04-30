package com.karthik.practice.Graph.Q60_MinEdgesToReverseToMakePathFromSrcToDest;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair
{
	int node;
	int dist;

	public Pair(int node, int dist)
	{
		this.node = node;
		this.dist = dist;
	}
}

public class MinEdgesToReverseToMakePathFromSrcToDest
{
	public static int getMinEdgeReversal(int V, int[][] edges, int src, int dest)
	{
		ArrayList<ArrayList<Pair>> adj = new ArrayList<ArrayList<Pair>>();
		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<>());

		for (int i = 0; i < edges.length; i++)
		{
			int u = edges[i][0];
			int v = edges[i][1];
			adj.get(u).add(new Pair(v, 0));
			adj.get(v).add(new Pair(u, 1));
		}

		PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.dist - y.dist);
		pq.add(new Pair(src, 0));

		int[] dis = new int[V];
		for (int i = 0; i < V; i++)
			dis[i] = Integer.MAX_VALUE;

		dis[src] = 0;

		while (!pq.isEmpty())
		{
			int node = pq.peek().node;
			int dist = pq.peek().dist;
			pq.remove();

			for (Pair it : adj.get(node))
			{
				int edjnode = it.node;
				int edjwt = it.dist;

				if (dist + edjwt < dis[edjnode])
				{
					dis[edjnode] = dist + edjwt;
					pq.add(new Pair(edjnode, dist + edjwt));
				}
			}
		}

		return dis[dest] == Integer.MAX_VALUE ? -1 : dis[dest];
	}

	public static void main(String[] args)
	{
		int V = 7;
		int[][] edges = { { 0, 1 }, { 2, 1 }, { 2, 3 }, { 5, 1 }, { 4, 5 }, { 6, 4 }, { 6, 3 } };

		int minEdgeToReverse = getMinEdgeReversal(V, edges, 0, 6);

		if (minEdgeToReverse != -1)
			System.out.println(minEdgeToReverse);
		else
			System.out.println("Not possible");
	}
}
