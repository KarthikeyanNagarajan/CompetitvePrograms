package com.karthik.practice.DP.Q25_LongestCommonSubsequence;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static int lcs(String s1, String s2, int n, int m, int[][] dp)
	{
		if (n < 0 || m < 0)
			return 0;

		if (dp[n][m] != -1)
			return dp[n][m];

		if (s1.charAt(n) == s2.charAt(m))
			return dp[n][m] = 1 + lcs(s1, s2, n - 1, m - 1, dp);
		else
			return dp[n][m] = 0 + Math.max(lcs(s1, s2, n - 1, m, dp), lcs(s1, s2, n, m - 1, dp));
	}

	private static int lcsByShiftingIndex(String s1, String s2, int n, int m, int[][] dp)
	{
		if (n == 0 || m == 0)
			return 0;

		if (dp[n][m] != -1)
			return dp[n][m];

		if (s1.charAt(n - 1) == s2.charAt(m - 1))
			return dp[n][m] = 1 + lcsByShiftingIndex(s1, s2, n - 1, m - 1, dp);
		else
			return dp[n][m] = 0
					+ Math.max(lcsByShiftingIndex(s1, s2, n - 1, m, dp), lcsByShiftingIndex(s1, s2, n, m - 1, dp));
	}

	public static void main(String[] args)
	{
		String s1 = "acd";
		String s2 = "ced";
		int n = s1.length();
		int m = s2.length();

		int[][] dp = new int[n][m];
		for (int row[] : dp)
			Arrays.fill(row, -1);

		int[][] dp1 = new int[n + 1][m + 1];
		for (int row[] : dp1)
			Arrays.fill(row, -1);

		System.out.println("The Length of Longest Common Subsequence is " + lcs(s1, s2, n - 1, m - 1, dp));
		System.out.println("The Length of LCS By Shifting Index is " + lcsByShiftingIndex(s1, s2, n, m, dp1));
	}
}
