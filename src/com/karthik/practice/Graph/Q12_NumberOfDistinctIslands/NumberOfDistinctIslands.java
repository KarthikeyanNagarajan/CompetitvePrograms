package com.karthik.practice.Graph.Q12_NumberOfDistinctIslands;

import java.util.ArrayList;
import java.util.HashSet;

public class NumberOfDistinctIslands
{

	private String toString(int row, int col)
	{
		return Integer.toString(row) + " " + Integer.toString(col);
	}

	private void dfs(int row, int col, int[][] vis, int[][] grid, ArrayList<String> vec, int row0, int col0)
	{
		vis[row][col] = 1;
		vec.add(toString(row - row0, col - col0));
		int n = grid.length;
		int m = grid[0].length;

		int delrow[] = { -1, 0, +1, 0 };
		int delcol[] = { 0, +1, +0, -1 };
		for (int i = 0; i < 4; i++)
		{
			int nrow = row + delrow[i];
			int ncol = col + delcol[i];
			if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1)
			{
				dfs(nrow, ncol, vis, grid, vec, row0, col0);
			}
		}
	}

	public int countDistinctIslands(int[][] grid)
	{
		int n = grid.length;
		int m = grid[0].length;
		int[][] vis = new int[n][m];
		HashSet<ArrayList<String>> st = new HashSet<>();

		for (int row = 0; row < n; row++)
		{
			for (int col = 0; col < m; col++)
			{
				if (vis[row][col] == 0 && grid[row][col] == 1)
				{
					ArrayList<String> vec = new ArrayList<>();
					dfs(row, col, vis, grid, vec, row, col);
					st.add(vec);
				}
			}
		}
		return st.size();
	}

	public static void main(String[] args)
	{
		int[][] grid = { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 1, 1 } };

		NumberOfDistinctIslands obj = new NumberOfDistinctIslands();
		System.out.println(obj.countDistinctIslands(grid));
	}

}
