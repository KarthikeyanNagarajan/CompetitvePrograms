package com.karthik.practice.DP.Q02_ClimbingStairs;

import java.util.Arrays;

public class Tabulation
{
	private static int fibo(int n, int[] dp)
	{
		for (int i = 2; i <= n; i++)
		{
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	public static void main(String[] args)
	{
		int n = 3;
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 1;
		dp[1] = 1;
		System.out.println(fibo(n, dp));
	}

}
