package com.karthik.practice.Graph.Q04_NumberOfIslands;

import java.util.LinkedList;
import java.util.Queue;

class Pair
{
	int first;
	int second;

	public Pair(int first, int second)
	{
		this.first = first;
		this.second = second;
	}
}

public class NumberOfIslands
{
	private void bfs(int u, int v, int[][] vis, char[][] grid)
	{
		vis[u][v] = 1;
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(u, v));
		int n = grid.length;
		int m = grid[0].length;
		while (!q.isEmpty())
		{
			int row = q.peek().first;
			int col = q.peek().second;
			q.remove();

			int[] dr = { -1, 0, 1, 0 };
			int[] dc = { 0, 1, 0, -1 };

			for (int i = 0; i < 4; i++)
			{
				int nrow = row + dr[i];
				int ncol = col + dc[i];
				if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0)
				{
					vis[nrow][ncol] = 1;
					q.add(new Pair(nrow, ncol));
				}
			}
		}
	}

	public int numIslands(char[][] grid)
	{
		int n = grid.length;
		int m = grid[0].length;
		int[][] vis = new int[n][m];
		int cnt = 0;
		for (int row = 0; row < n; row++)
		{
			for (int col = 0; col < m; col++)
			{
				if (vis[row][col] == 0 && grid[row][col] == '1')
				{
					cnt++;
					bfs(row, col, vis, grid);
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args)
	{
		char[][] grid = { { '0', '1', '1', '1', '0', '0', '0' }, { '0', '0', '1', '1', '0', '1', '0' } };

		NumberOfIslands obj = new NumberOfIslands();
		System.out.println(obj.numIslands(grid));
	}

}
