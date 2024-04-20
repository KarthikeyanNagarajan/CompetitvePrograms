package com.karthik.practice.DP.Q03_FrogJump;

import java.util.Arrays;

public class Tabulation
{

	public static void main(String[] args)
	{
		int height[] = { 30, 10, 60, 10, 60, 50 };
		int n = height.length;
		int dp[] = new int[n];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		for (int i = 1; i < n; i++)
		{
			int left = dp[i - 1] + Math.abs(height[i] - height[i - 1]);
			int right = Integer.MAX_VALUE;
			if (i > 1)
				right = dp[i - 2] + Math.abs(height[i] - height[i - 2]);
			dp[i] = Math.min(left, right);
		}
		System.out.println(dp[n - 1]);
	}

}
