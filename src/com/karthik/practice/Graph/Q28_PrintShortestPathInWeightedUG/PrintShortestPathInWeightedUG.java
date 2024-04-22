package com.karthik.practice.Graph.Q28_PrintShortestPathInWeightedUG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Pair
{
	int node;
	int distance;

	public Pair(int distance, int node)
	{
		this.distance = distance;
		this.node = node;
	}
}

public class PrintShortestPathInWeightedUG
{
	public static List<Integer> shortestPath(int n, int m, int[][] edges)
	{
		ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++)
			adj.add(new ArrayList<>());

		for (int i = 0; i < m; i++)
		{
			adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
			adj.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
		}

		PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);
		// 1 based Array
		int[] dist = new int[n + 1];
		int[] parent = new int[n + 1];
		for (int i = 0; i < n; i++)
		{
			dist[i] = (int) 1e9;
			parent[i] = i;
		}

		dist[1] = 0;
		pq.add(new Pair(0, 1));
		while (!pq.isEmpty())
		{
			int dis = pq.peek().distance;
			int node = pq.peek().node;
			pq.poll();

			for (Pair it : adj.get(node))
			{
				int edgeWeight = it.distance;
				int adjNode = it.node;
				if (edgeWeight + dis < dist[adjNode])
				{
					dist[adjNode] = edgeWeight + dis;
					pq.add(new Pair(edgeWeight + dis, adjNode));
					parent[adjNode] = node;
				}
			}
		}

		List<Integer> path = new ArrayList<>();
		if (dist[n] == 1e9)
		{
			path.add(-1);
			return path;
		}

		int node = n;
		while (parent[node] != node)
		{
			path.add(node);
			node = parent[node];
		}
		path.add(1);
		Collections.reverse(path);
		return path;

	}

	public static void main(String[] args)
	{
		int n = 5, m = 6;
		int[][] edges = { { 1, 2, 2 }, { 2, 5, 5 }, { 2, 3, 4 }, { 1, 4, 1 }, { 4, 3, 3 }, { 3, 5, 1 } };
		List<Integer> shortestPath = shortestPath(n, m, edges);
		System.out.println(shortestPath);
	}
}
