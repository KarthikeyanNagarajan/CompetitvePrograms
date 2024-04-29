package com.karthik.practice.Graph.Q54_JourneyToMoon;

import java.util.ArrayList;
import java.util.List;

public class JourneyToMoon
{
	static int num;

	static void dfs(int node, List<List<Integer>> adj, int[] visited)
	{
		visited[node] = 1;
		num++;

		for (int it : adj.get(node))
		{
			if (visited[it] == 0)
			{
				dfs(it, adj, visited);
			}
		}
	}

	// find the number of ways to choose two astronauts from the different countries
	static void numberOfPairs(int N, int[][] arr)
	{
		List<List<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < N; i++)
			adj.add(new ArrayList<>());

		// choose two astronauts
		for (int i = 0; i < 2; i++)
		{
			adj.get(arr[i][0]).add(arr[i][1]);
			adj.get(arr[i][1]).add(arr[i][0]);
		}

		int[] visited = new int[N];

		// Stores the size of every connected components
		List<Integer> size = new ArrayList<>();

		num = 0;
		for (int i = 0; i < N; i++)
		{
			if (visited[i] == 0)
			{
				dfs(i, adj, visited);
				size.add(num);
				num = 0;
			}
		}

		// total number of ways to count the pairs
		int ans = N * (N - 1) / 2 + 1;

		for (int i = 0; i < size.size(); i++)
			ans -= (size.get(i) * (size.get(i) - 1) / 2) + 1;

		System.out.print(ans);
	}

	public static void main(String[] args)
	{
		int N = 6;
		int[][] arr = { { 0, 1 }, { 0, 2 }, { 2, 5 } };
		numberOfPairs(N, arr);
	}
}
