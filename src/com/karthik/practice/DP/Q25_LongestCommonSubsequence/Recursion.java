package com.karthik.practice.DP.Q25_LongestCommonSubsequence;

public class Recursion
{
	private static int lcs(String s1, String s2, int n, int m)
	{
		if (n < 0 || m < 0)
			return 0;

		if (s1.charAt(n) == s2.charAt(m))
			return 1 + lcs(s1, s2, n - 1, m - 1);
		else
			return 0 + Math.max(lcs(s1, s2, n - 1, m), lcs(s1, s2, n, m - 1));
	}

	private static int lcsByShiftingIndex(String s1, String s2, int n, int m)
	{
		if (n == 0 || m == 0)
			return 0;

		if (s1.charAt(n - 1) == s2.charAt(m - 1))
			return 1 + lcsByShiftingIndex(s1, s2, n - 1, m - 1);
		else
			return 0 + Math.max(lcsByShiftingIndex(s1, s2, n - 1, m), lcsByShiftingIndex(s1, s2, n, m - 1));
	}

	public static void main(String[] args)
	{
		String s1 = "acd";
		String s2 = "ced";
		int n = s1.length();
		int m = s2.length();

		System.out.println("The Length of Longest Common Subsequence is " + lcs(s1, s2, n - 1, m - 1));
		System.out.println("The Length of LCS By Shifting Index is " + lcsByShiftingIndex(s1, s2, n, m));
	}
}
