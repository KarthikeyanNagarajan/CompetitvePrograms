package com.karthik.practice.Graph.Q58_MColoringProblem;

public class MColoringProblem
{
	public static boolean isSafe(int ind, int V, int graph[][], int color[], int c)
	{
		for (int i = 0; i < V; i++)
			if (graph[ind][i] == 1 && c == color[i])
				return false;
		return true;
	}

	public static boolean graphColoringUtil(int ind, int V, int graph[][], int noOfColor, int color[])
	{
		if (ind == V)
			return true;

		for (int c = 1; c <= noOfColor; c++)
		{
			if (isSafe(ind, V, graph, color, c))
			{
				color[ind] = c;
				if (graphColoringUtil(ind + 1, V, graph, noOfColor, color))
					return true;
				color[ind] = 0;
			}
		}
		return false;
	}

	public static boolean graphColoring(int V, int[][] graph, int noOfColor)
	{
		int[] color = new int[V];

		if (!graphColoringUtil(0, V, graph, noOfColor, color))
		{
			System.out.println("Solution does not exist");
			return false;
		}

		printSolution(V, color);
		return true;
	}

	public static void printSolution(int V, int color[])
	{
		for (int i = 0; i < V; i++)
			System.out.print(color[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		// (3)-(2)
		// | / |
		// | / |
		// | / |
		// (0)-(1)

		int V = 4;
		int noOfColor = 3;
		int graph[][] = { { 0, 1, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 0, 1 }, { 1, 0, 1, 0 }, };

		graphColoring(V, graph, noOfColor);
	}
}
