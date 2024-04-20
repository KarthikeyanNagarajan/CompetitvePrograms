package com.karthik.practice.DP.Q03_FrogJump;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static int recur(int n, int[] height, int[] dp)
	{
		if (n == 0)
			return 0;
		if (dp[n] != -1)
			return dp[n];
		int left = recur(n - 1, height, dp) + Math.abs(height[n] - height[n - 1]);
		int right = Integer.MAX_VALUE;
		if (n > 1)
			right = recur(n - 2, height, dp) + Math.abs(height[n] - height[n - 2]);
		return dp[n] = Math.min(left, right);
	}

	public static void main(String[] args)
	{
		int[] height = { 30, 10, 60, 10, 60, 50 };
		int n = height.length;
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		System.out.println(recur(n - 1, height, dp));
	}

}
