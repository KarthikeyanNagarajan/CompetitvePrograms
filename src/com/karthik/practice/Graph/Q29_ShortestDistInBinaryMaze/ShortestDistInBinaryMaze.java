package com.karthik.practice.Graph.Q29_ShortestDistInBinaryMaze;

import java.util.LinkedList;
import java.util.Queue;

class Tuple
{
	int dist;
	int first;
	int second;

	public Tuple(int dist, int first, int second)
	{
		this.dist = dist;
		this.first = first;
		this.second = second;
	}
}

public class ShortestDistInBinaryMaze
{

	public int shortestPath(int[][] grid, int[] source, int[] destination)
	{
		if (source[0] == destination[0] && source[1] == destination[1])
			return 0;

		int n = grid.length;
		int m = grid[0].length;

		int[][] dist = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				dist[i][j] = (int) 1e9;

		dist[source[0]][source[1]] = 0;

		Queue<Tuple> q = new LinkedList<>();
		q.add(new Tuple(0, source[0], source[1]));

		int[] dr = { -1, 0, 1, 0 };
		int[] dc = { 0, 1, 0, -1 };

		while (!q.isEmpty())
		{
			int dis = q.peek().dist;
			int row = q.peek().first;
			int col = q.peek().second;
			q.poll();

			for (int i = 0; i < 4; i++)
			{
				int newr = row + dr[i];
				int newc = col + dc[i];
				
				if(newr >= 0 && newr < n && newc >= 0 && newc <m && grid[newr][newc] == 1)
				{
					if(dis +1 < dist[newr][newc])
					{
						dist[newr][newc] = dis +1;
						if(newr == destination[0] && newc == destination[1])
							return dis + 1;
						q.add(new Tuple(dis + 1, newr, newc));
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{

		int[] source = { 0, 1 };
		int[] destination = { 2, 2 };

		int[][] grid = { { 1, 1, 1, 1 }, { 1, 1, 0, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 }, { 1, 0, 0, 1 } };

		ShortestDistInBinaryMaze obj = new ShortestDistInBinaryMaze();
		int res = obj.shortestPath(grid, source, destination);

		System.out.print(res);
		System.out.println();
	}
}
