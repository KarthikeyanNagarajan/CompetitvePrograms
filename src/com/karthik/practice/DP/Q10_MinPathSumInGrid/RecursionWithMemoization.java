package com.karthik.practice.DP.Q10_MinPathSumInGrid;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static int recur(int i, int j, int[][] matrix, int[][] dp)
	{
		if (i == 0 && j == 0)
			return matrix[0][0];
		if (i < 0 || j < 0)
			return (int) 1e9;

		if (dp[i][j] != -1)
			return dp[i][j];

		int up = matrix[i][j] + recur(i - 1, j, matrix, dp);
		int left = matrix[i][j] + recur(i, j - 1, matrix, dp);
		return dp[i][j] = Math.min(up, left);
	}

	public static void main(String[] args)
	{
		int matrix[][] = { { 5, 9, 6 }, { 11, 5, 2 } };

		int n = matrix.length;
		int m = matrix[0].length;

		int dp[][] = new int[n][m];
		for (int row[] : dp)
			Arrays.fill(row, -1);

		System.out.println(recur(n - 1, m - 1, matrix, dp));
	}

}
