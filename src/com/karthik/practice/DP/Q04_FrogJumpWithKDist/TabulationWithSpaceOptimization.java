package com.karthik.practice.DP.Q04_FrogJumpWithKDist;

import java.util.Arrays;

public class TabulationWithSpaceOptimization
{

	static int solve(int n, int[] height, int[] dp, int k)
	{
		dp[0] = 0;
		for (int i = 1; i < n; i++)
		{
			int mmSteps = Integer.MAX_VALUE;
			for (int j = 1; j <= k; j++)
			{
				if (i - j >= 0)
				{
					int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
					mmSteps = Math.min(jump, mmSteps);
				}
			}
			dp[i] = mmSteps;
		}
		return dp[n - 1];
	}

	public static void main(String[] args)
	{
		int height[] = { 30, 10, 60, 10, 60, 50 };
		int n = height.length;
		int k = 2;
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		System.out.println(solve(n, height, dp, k));
	}

}
