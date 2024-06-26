package com.karthik.practice.Graph.Q02_DFS;

import java.util.ArrayList;

public class DFS
{

	public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs)
	{
		vis[node] = true;
		dfs.add(node);
		
		for(int it : adj.get(node))
		{
			if(!vis[it])
				dfs(it, vis, adj, dfs);
		}
	}

	public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
	{
		boolean[] vis = new boolean[V+1];
		vis[0] = true;		
		ArrayList<Integer> dfs = new ArrayList<>();
		dfs(0, vis, adj, dfs);
		return dfs;
	}

	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < 5; i++)
		{
			adj.add(new ArrayList<>());
		}
		adj.get(0).add(2);
		adj.get(2).add(0);
		adj.get(0).add(1);
		adj.get(1).add(0);
		adj.get(0).add(3);
		adj.get(3).add(0);
		adj.get(2).add(4);
		adj.get(4).add(2);

		DFS sl = new DFS();
		ArrayList<Integer> ans = sl.dfsOfGraph(5, adj);
		int n = ans.size();
		for (int i = 0; i < n; i++)
		{
			System.out.print(ans.get(i) + " "); // 0 2 4 1 3
		}
	}

}
