package com.karthik.practice.Graph.Q09_DistanceOfNearestCellHaving1;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
	int first;
	int second;
	int third;

	Node(int _first, int _second, int _third)
	{
		this.first = _first;
		this.second = _second;
		this.third = _third;
	}
}

public class DistanceOfNearestCellHaving1
{

	public int[][] nearest(int[][] grid)
	{
		int n = grid.length;
		int m = grid[0].length;

		int vis[][] = new int[n][m];
		int dist[][] = new int[n][m];

		Queue<Node> q = new LinkedList<Node>();

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if (grid[i][j] == 1)
				{
					q.add(new Node(i, j, 0));
					vis[i][j] = 1;
				}
				else
				{
					vis[i][j] = 0;
				}
			}
		}

		int delrow[] = { -1, 0, +1, 0 };
		int delcol[] = { 0, +1, 0, -1 };

		while (!q.isEmpty())
		{
			int row = q.peek().first;
			int col = q.peek().second;
			int steps = q.peek().third;
			q.remove();
			dist[row][col] = steps;

			for (int i = 0; i < 4; i++)
			{
				int nrow = row + delrow[i];
				int ncol = col + delcol[i];

				if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0)
				{
					vis[nrow][ncol] = 1;
					q.add(new Node(nrow, ncol, steps + 1));
				}
			}
		}
		return dist;
	}

	public static void main(String[] args)
	{
		int[][] grid = { { 0, 1, 1, 0 }, { 1, 1, 0, 0 }, { 0, 0, 1, 1 } };

		DistanceOfNearestCellHaving1 obj = new DistanceOfNearestCellHaving1();
		int[][] ans = obj.nearest(grid);
		for (int i = 0; i < ans.length; i++)
		{
			for (int j = 0; j < ans[i].length; j++)
			{
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
