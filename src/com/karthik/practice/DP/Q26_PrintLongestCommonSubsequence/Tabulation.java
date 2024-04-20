package com.karthik.practice.DP.Q26_PrintLongestCommonSubsequence;

import java.util.Arrays;

public class Tabulation
{
	private static void lcsByShiftingIndex(String s1, String s2, int n, int m)
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

		int len = dp[n][m];
		int i = n;
		int j = m;
		int index = len - 1;

		String str = "";
		for (int k = 1; k <= len; k++)
		{
			str += "$";
		}

		StringBuilder ans = new StringBuilder(str);

		while (i > 0 && j > 0)
		{
			if (s1.charAt(i - 1) == s2.charAt(j - 1))
			{
				ans.setCharAt(index, s1.charAt(i - 1));
				index--;
				i--;
				j--;
			}
			else if (s1.charAt(i - 1) > s2.charAt(j - 1))
				i--;
			else
				j--;
		}
		System.out.println(ans);
	}

	public static void main(String[] args)
	{
		String s1 = "abcde";
		String s2 = "bdgek";
		int n = s1.length();
		int m = s2.length();

		lcsByShiftingIndex(s1, s2, n, m);
	}

}
