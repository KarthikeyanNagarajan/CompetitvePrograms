package com.karthik.practice.Graph.Q07_DetectCycleBFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
	int first;
	int second;

	public Node(int first, int second)
	{
		this.first = first;
		this.second = second;
	}
}

public class DetectCycleBFS
{

	static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean vis[], int parent[])
	{
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(s, -1));
		vis[s] = true;

		while (!q.isEmpty())
		{
			int node = q.peek().first;
			int parentVal = q.peek().second;
			q.remove();

			for (Integer it : adj.get(node))
			{
				if (!vis[it])
				{
					q.add(new Node(it, node));
					vis[it] = true;
				}
				else if (parentVal != it) // if adjacent node is visited and is not its own parent node
					return true;
			}
		}
		return false;
	}

	public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
	{
		boolean[] vis = new boolean[V];
		Arrays.fill(vis, false);

		int[] parent = new int[V];
		Arrays.fill(parent, -1);

		for (int i = 0; i < V; i++)
			if (!vis[i])
				if (checkForCycle(adj, i, vis, parent))
					return true;

		return false;
	}

	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < 4; i++)
		{
			adj.add(new ArrayList<>());
		}
		adj.get(1).add(2);
		adj.get(2).add(1);
		adj.get(2).add(3);
		adj.get(3).add(2);

		DetectCycleBFS obj = new DetectCycleBFS();
		boolean ans = obj.isCycle(4, adj); // 0
		if (ans)
			System.out.println("1");
		else
			System.out.println("0");
	}

}
