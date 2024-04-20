package com.karthik.practice.Graph.Q06_RottenOrange;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange
{

	public static int orangesRotting(int[][] grid)
	{
		if (grid == null || grid.length == 0)
			return 0;
		int row = grid.length;
		int col = grid[0].length;

		Queue<int[]> queue = new LinkedList<>();
		int cnt_fresh = 0;

		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				if (grid[i][j] == 2)
					queue.offer(new int[] { i, j });
				if (grid[i][j] != 0)
					cnt_fresh++;
			}
		}

		if (cnt_fresh == 0)
			return 0;

		int min = 0, cnt = 0;
		int[] dx = { 0, 0, 1, -1 };
		int[] dy = { 1, -1, 0, 0 };

		while (!queue.isEmpty())
		{
			int size = queue.size();
			cnt += size;

			for (int i = 0; i < size; i++)
			{
				int[] point = queue.poll();
				for (int j = 0; j < 4; j++)
				{
					int x = point[0] + dx[j];
					int y = point[1] + dy[j];

					if (x >= row || x < 0 || y >= col || y < 0 || grid[x][y] == 0 || grid[x][y] == 2)
						continue;
					grid[x][y] = 2;
					queue.offer(new int[] { x, y });
				}
			}

			if (queue.size() != 0)
				min++;
		}
		return cnt_fresh == cnt ? min : -1;
	}

	public static void main(String[] args)
	{
		int arr[][] = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		int rotting = orangesRotting(arr);
		System.out.println("Minimum Number of Minutes Required " + rotting); // 4
	}

}
