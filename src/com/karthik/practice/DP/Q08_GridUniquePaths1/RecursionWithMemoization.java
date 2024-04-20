package com.karthik.practice.DP.Q08_GridUniquePaths1;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static int recur(int i, int j, int[][] dp)
	{
		if (i == 0 && j == 0)
			return 1;
		if (i < 0 || j < 0)
			return 0;

		if (dp[i][j] != -1)
			return dp[i][j];

		int up = recur(i - 1, j, dp);
		int left = recur(i, j - 1, dp);
		return dp[i][j] = up + left;
	}

	public static void main(String[] args)
	{
		int m = 3;
		int n = 2;
		int[][] dp = new int[m][n];
		for (int[] row : dp)
			Arrays.fill(row, -1);
		System.out.println(recur(m - 1, n - 1, dp));
	}

}
