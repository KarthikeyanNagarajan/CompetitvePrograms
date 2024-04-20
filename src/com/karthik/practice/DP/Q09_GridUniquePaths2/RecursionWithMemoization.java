package com.karthik.practice.DP.Q09_GridUniquePaths2;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static int recur(int n, int[] arr, int[] dp)
	{
		if (n == 0)
			return arr[n];
		if (n < 0)
			return 0;
		if (dp[n] != -1)
			return dp[n];

		int pick = arr[n] + recur(n - 2, arr, dp);
		int notpick = 0 + recur(n - 1, arr, dp);
		return dp[n] = Math.max(pick, notpick);
	}

	public static void main(String[] args)
	{
		int arr[] = { 2, 1, 4, 9 };
		int n = arr.length;
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		System.out.println(recur(n - 1, arr, dp));
	}

}
