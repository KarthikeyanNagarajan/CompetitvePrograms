package com.karthik.practice.Graph.Q19_DetectCycleDirectedGraphBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleDirectedGraphBFS
{
	private static boolean topoSort(int V, ArrayList<ArrayList<Integer>> adj)
	{
		int indegree[] = new int[V];
		for (int i = 0; i < V; i++)
			for (int it : adj.get(i))
				indegree[it]++;

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < V; i++)
			if (indegree[i] == 0)
				q.add(i);

		int cnt = 0;
		while (!q.isEmpty())
		{
			int node = q.poll();
			cnt++;

			// node is in topo sort so remove it from the indegree
			for (int it : adj.get(node))
			{
				indegree[it]--;
				if (indegree[it] == 0)
					q.add(it);
			}
		}

		if (cnt == V)
			return false;

		return true;
	}

	public static void main(String[] args)
	{
		int V = 6;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < V; i++)
		{
			adj.add(new ArrayList<>());
		}
		adj.get(2).add(3);
		adj.get(3).add(1);
		adj.get(4).add(0);
		adj.get(4).add(1);
		adj.get(5).add(0);
		adj.get(5).add(2);

		System.out.println(DetectCycleDirectedGraphBFS.topoSort(V, adj));
	}
}
