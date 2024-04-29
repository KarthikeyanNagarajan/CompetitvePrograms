package com.karthik.practice.Graph.Q52_FindWhetherPathExist;

import java.util.LinkedList;
import java.util.Queue;

class Pair
{
	int row;
	int col;

	Pair(int row, int col)
	{
		this.row = row;
		this.col = col;
	}
}

public class FindWhetherPathExist
{
	public static boolean is_Possible(int[][] grid)
	{
		int n = grid.length;
		int m = grid[0].length;
		int srcr = 0, srcc = 0;

		Queue<Pair> q = new LinkedList<>();
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if (grid[i][j] == 1)
				{
					srcr = i;
					srcc = j;
					q.add(new Pair(i, j));
					break;
				}
			}
		}

		int[][] vis = new int[n][m];
		int[] dr = { -1, 0, 1, 0 };
		int[] dc = { 0, 1, 0, -1 };

		vis[srcr][srcc] = 1;

		while (!q.isEmpty())
		{
			int row = q.peek().row;
			int col = q.peek().col;
			q.remove();

			if (grid[row][col] == 2)
				return true;

			for (int i = 0; i < 4; i++)
			{
				int newr = row + dr[i];
				int newc = col + dc[i];

				if (newr >= 0 && newr < n && newc >= 0 && newc < m && vis[newr][newc] == 0
						&& (grid[newr][newc] == 2 || grid[newr][newc] == 3))
				{
					vis[newr][newc] = 1;
					q.add(new Pair(newr, newc));
				}
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		// A value of cell 1 means Source.
		// A value of cell 2 means Destination.
		// A value of cell 3 means Blank cell.
		// A value of cell 0 means Wall.

		int[][] grid = { { 3, 0, 3, 0, 0 }, { 3, 0, 0, 0, 3 }, { 3, 3, 3, 3, 3 }, { 0, 2, 3, 0, 0 },
				{ 3, 0, 0, 1, 3 } };

		// int[][] grid = { { 1, 3 }, { 3, 2 } };
		System.out.println(is_Possible(grid));
	}
}
