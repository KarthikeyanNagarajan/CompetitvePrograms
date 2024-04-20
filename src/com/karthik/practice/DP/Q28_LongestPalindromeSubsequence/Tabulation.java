package com.karthik.practice.DP.Q28_LongestPalindromeSubsequence;

import java.util.Arrays;

public class Tabulation
{
	private static int lcsByShiftingIndex(String s1, String s2, int n, int m)
	{
		int[][] dp = new int[n + 1][m + 1];
		for (int row[] : dp)
			Arrays.fill(row, -1);

		for (int i = 0; i <= n; i++)
			dp[i][0] = 0;

		for (int j = 0; j <= m; j++)
			dp[0][j] = 0;

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= m; j++)
			{
				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = 0 + Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[n][m];
	}

	public static void main(String[] args)
	{
		String s1 = "bbabcbcab";
		String s2 = new StringBuilder(s1).reverse().toString();
		int n = s1.length();
		int m = s2.length();

		System.out.println("The Length of Longest Common Subsequence is " + lcsByShiftingIndex(s1, s2, n, m));
	}

}
