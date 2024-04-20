package com.karthik.practice.DP.Q11_MinPathSumInTriangleGrid;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static int recur(int i, int j, int[][] triangle, int n, int[][] dp)
	{
		if (dp[i][j] != -1)
			return dp[i][j];

		if (i == n - 1)
			return triangle[i][j];

		int down = triangle[i][j] + recur(i + 1, j, triangle, n, dp);
		int diagonal = triangle[i][j] + recur(i + 1, j + 1, triangle, n, dp);
		return dp[i][j] = Math.min(down, diagonal);
	}

	public static void main(String[] args)
	{
		int triangle[][] = { { 1 }, { 2, 3 }, { 3, 6, 7 }, { 8, 9, 6, 10 } };
		int n = triangle.length;
		int dp[][] = new int[n][n];
		for (int row[] : dp)
			Arrays.fill(row, -1);
		System.out.println(recur(0, 0, triangle, n, dp));
	}

}
