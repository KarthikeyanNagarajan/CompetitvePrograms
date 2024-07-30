package com.karthik.practice.DP.Q09_GridUniquePaths2;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static int recur(int i, int j, int[][] maze, int[][] dp)
	{
		if (i >= 0 && j >= 0 && maze[i][j] == -1)
			return 0;

		if (i == 0 && j == 0)
			return 1;

		if (i < 0 || j < 0)
			return 0;

		if (dp[i][j] != -1)
			return dp[i][j];

		int up = recur(i - 1, j, maze, dp);
		int left = recur(i, j - 1, maze, dp);

		return dp[i][j] = up + left;
	}

	public static void main(String[] args)
	{
		int[][] maze = { { 0, 0, 0 }, { 0, -1, 0 }, { 0, 0, 0 } };

		int n = maze.length;
		int m = maze[0].length;

		int dp[][] = new int[n][m];
		for (int row[] : dp)
			Arrays.fill(row, -1);

		System.out.println(recur(n - 1, m - 1, maze, dp));
	}

}
