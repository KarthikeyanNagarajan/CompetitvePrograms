package com.karthik.practice.DP.Q02_ClimbingStairs;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static int recur(int n, int[] dp)
	{
		if (n <= 1)
			return 1;
		if (dp[n] != -1)
			return dp[n];
		return dp[n] = recur(n - 1, dp) + recur(n - 2, dp);
	}

	public static void main(String[] args)
	{
		int n = 3;
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		System.out.println(recur(n, dp));
	}

}
