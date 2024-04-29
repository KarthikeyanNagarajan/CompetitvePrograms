package com.karthik.practice.Graph.Q55_MinHeightTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinHeightTrees
{
	public static List<Integer> findMinHeightTrees(int n, int[][] edges)
	{
		List<Integer> ans = new ArrayList<>();
		if (n <= 0)
			return ans;
		if (n == 1)
		{
			ans.add(0);
			return ans;
		}

		int[] deg = new int[n];

		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++)
			adj.add(new ArrayList<>());

		for (int i = 0; i < edges.length; i++)
		{
			int u = edges[i][0];
			int v = edges[i][1];
			deg[u]++;
			deg[v]++;
			adj.get(u).add(v);
			adj.get(v).add(u);
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < n; i++)
			if (deg[i] == 1)
				q.add(i);

		while (n > 2)
		{
			int sz = q.size();
			n -= sz;

			while (sz > 0)
			{
				int node = q.peek();
				q.remove();

				for (int it : adj.get(node))
				{
					deg[it]--;
					if (deg[it] == 1)
						q.add(it);
				}
				sz--;
			}
		}

		while (!q.isEmpty())
		{
			int el = q.peek();
			q.remove();
			ans.add(el);
		}

		return ans;
	}

	public static void main(String[] args)
	{
//		int n = 4;
//		int[][] edges = { { 1, 0 }, { 1, 2 }, { 1, 3 } };

		int n = 6;
		int[][] edges = { { 3, 0 }, { 3, 1 }, { 3, 2 }, { 3, 4 }, { 5, 4 } };
		System.out.println(findMinHeightTrees(n, edges));
	}
}
