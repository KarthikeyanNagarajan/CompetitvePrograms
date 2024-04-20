package com.karthik.practice.DP.Q30_MinInsertionAndDeletionToConvertString;

public class TabulationWithSpaceOptimization
{
	private static int lcsByShiftingIndex(String s1, String s2, int n, int m)
	{
		int[] prev = new int[m + 1];
		int[] curr = new int[m + 1];

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= m; j++)
			{
				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					curr[j] = 1 + prev[j - 1];
				else
					curr[j] = 0 + Math.max(prev[j], curr[j - 1]);
			}
			prev = curr.clone();
		}
		return prev[m];
	}

	public static void main(String[] args)
	{
		String s1 = "abcd";
		String s2 = "anc";
		int n = s1.length();
		int m = s2.length();

		int lcs = lcsByShiftingIndex(s1, s2, n, m);
		int ans = (n - lcs) + (m - lcs);

		System.out.println("The Length of Longest Common Subsequence is " + ans);
	}
}
