package com.karthik.practice.DP.Q09_GridUniquePaths2;

import java.util.Arrays;

public class Tabulation
{

	public static void main(String[] args)
	{
		int[][] maze = { { 0, 0, 0 }, { 0, -1, 0 }, { 0, 0, 0 } };

		int n = maze.length;
		int m = maze[0].length;

		int dp[][] = new int[n][m];
		for (int row[] : dp)
			Arrays.fill(row, -1);

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if (i > 0 && j > 0 && maze[i][j] == -1)
				{
					dp[i][j] = 0;
					continue;
				}
				if (i == 0 && j == 0)
				{
					dp[i][j] = 1;
					continue;
				}

				int up = 0;
				int left = 0;

				if (i > 0)
					up = dp[i - 1][j];

				if (j > 0)
					left = dp[i][j - 1];

				dp[i][j] = up + left;
			}
		}

		System.out.println(dp[n - 1][m - 1]);
	}

}
