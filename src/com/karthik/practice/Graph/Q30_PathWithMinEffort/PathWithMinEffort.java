package com.karthik.practice.Graph.Q30_PathWithMinEffort;

import java.util.PriorityQueue;

class Tuple
{
	int distance;
	int row;
	int col;

	public Tuple(int distance, int row, int col)
	{
		this.row = row;
		this.distance = distance;
		this.col = col;
	}
}

public class PathWithMinEffort
{
	public int MinimumEffort(int heights[][])
	{
		PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>((x, y) -> x.distance - y.distance);

		int n = heights.length;
		int m = heights[0].length;

		int[][] dist = new int[n][m];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				dist[i][j] = (int) (1e9);
			}
		}

		dist[0][0] = 0;
		pq.add(new Tuple(0, 0, 0));

		int dr[] = { -1, 0, 1, 0 };
		int dc[] = { 0, 1, 0, -1 };

		while (pq.size() != 0)
		{
			int diff = pq.peek().distance;
			int row = pq.peek().row;
			int col = pq.peek().col;
			pq.poll();

			if (row == n - 1 && col == m - 1)
				return diff;

			for (int i = 0; i < 4; i++)
			{
				int newr = row + dr[i];
				int newc = col + dc[i];

				if (newr >= 0 && newr < n && newc >= 0 && newc < n)
				{
					int maxEffort = Math.max(Math.abs(heights[row][col] - heights[newr][newc]), diff);
					if (maxEffort < dist[newr][newc])
					{
						dist[newr][newc] = maxEffort;
						pq.add(new Tuple(maxEffort, newr, newc));
					}
				}
			}
		}
		return 0;
	}

	public static void main(String[] args)
	{

		int[][] heights = { { 1, 2, 2 }, { 3, 8, 2 }, { 5, 3, 5 } };

		PathWithMinEffort obj = new PathWithMinEffort();
		int ans = obj.MinimumEffort(heights);

		System.out.print(ans);
		System.out.println();
	}
}