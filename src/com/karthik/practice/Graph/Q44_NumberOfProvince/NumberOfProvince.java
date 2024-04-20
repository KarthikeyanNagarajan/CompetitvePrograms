package com.karthik.practice.Graph.Q44_NumberOfProvince;

import java.util.ArrayList;

import com.karthik.practice.Graph.util.DisjointSet;

public class NumberOfProvince
{

	public int numberOfProvince(int V, ArrayList<ArrayList<Integer>> adj)
	{
		DisjointSet ds = new DisjointSet(V);
		for (int i = 0; i < V; i++)
		{
			for (int j = 0; j < V; j++)
			{
				if (adj.get(i).get(j) == 1)
					ds.unionBySize(i, j);
			}
		}

		int cnt = 0;
		for (int i = 0; i < V; i++)
		{
			if (ds.parent.get(i) == i)
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		int V = 3;
		int[][] arr = { { 1, 0, 1 }, { 0, 1, 0 }, { 1, 0, 1 } };
		for (int i = 0; i < V; i++)
		{
			adj.add(new ArrayList<Integer>());
		}

	}

}
