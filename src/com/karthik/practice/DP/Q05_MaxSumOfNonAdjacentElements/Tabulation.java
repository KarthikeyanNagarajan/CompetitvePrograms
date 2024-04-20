package com.karthik.practice.DP.Q05_MaxSumOfNonAdjacentElements;

import java.util.Arrays;

public class Tabulation
{

	public static void main(String[] args)
	{
		int arr[] = { 2, 1, 4, 9 };
		int n = arr.length;
		int dp[] = new int[n];
		Arrays.fill(dp, -1);
		dp[0] = arr[0];
		for (int i = 1; i < n; i++)
		{
			int pick = arr[i];
			if (i > 1)
				pick += dp[i - 2];
			int notpick = 0 + dp[i - 1];
			dp[i] = Math.max(pick, notpick);
		}
		System.out.println(dp[n - 1]);
	}

}
