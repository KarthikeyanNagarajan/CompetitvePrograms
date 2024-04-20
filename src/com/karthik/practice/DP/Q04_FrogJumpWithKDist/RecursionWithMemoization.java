package com.karthik.practice.DP.Q04_FrogJumpWithKDist;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static int recur(int n, int[] height, int[] dp, int k)
	{
		if (n == 0)
			return 0;
		if (dp[n] != -1)
			return dp[n];

		int mmSteps = Integer.MAX_VALUE;

		for (int j = 1; j <= k; j++)
		{
			if (n - j >= 0)
			{
				int jump = recur(n - j, height, dp, k) + Math.abs(height[n] - height[n - j]);
				mmSteps = Math.min(jump, mmSteps);
			}
		}
		return dp[n] = mmSteps;
	}

	public static void main(String[] args)
	{
		int height[] = { 30, 10, 60, 10, 60, 50 };
		int n = height.length;
		int k = 2;
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		System.out.println(recur(n - 1, height, dp, k));
	}

}
