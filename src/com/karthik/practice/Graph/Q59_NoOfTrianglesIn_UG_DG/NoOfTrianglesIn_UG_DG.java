package com.karthik.practice.Graph.Q59_NoOfTrianglesIn_UG_DG;

public class NoOfTrianglesIn_UG_DG
{
	public static int countTriangle(int V, int graph[][], boolean isDirected)
	{
		int cnt = 0;

		for (int i = 0; i < V; i++)
		{
			for (int j = 0; j < V; j++)
			{
				for (int k = 0; k < V; k++)
				{
					if (graph[i][j] == 1 && graph[j][k] == 1 && graph[k][i] == 1)
						cnt++;
				}
			}
		}
		
		if(isDirected)
			cnt /= 3;
		else
			cnt /= 6;
		return cnt;
	}

	public static void main(String args[])
	{
		int V = 4;

		int ug[][] = { { 0, 1, 1, 0 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 }, { 0, 1, 1, 0 } };

		int dg[][] = { { 0, 0, 1, 0 }, { 1, 0, 0, 1 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };

		System.out.println("The Number of triangles in undirected graph : " + countTriangle(V, ug, false));

		System.out.println("\n\nThe Number of triangles in directed graph : " + countTriangle(V, dg, true));

	}
}
