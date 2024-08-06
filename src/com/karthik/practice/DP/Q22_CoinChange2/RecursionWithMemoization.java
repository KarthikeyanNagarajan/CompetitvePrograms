package com.karthik.practice.DP.Q22_CoinChange2;

import java.util.Arrays;

public class RecursionWithMemoization
{
	public static int findWaysUtil(int[] arr, int ind, int target, int[][] dp)
	{
		if (ind == 0)
		{
			if (target % arr[0] == 0)
				return 1;
			else
				return 0;
		}

		if (dp[ind][target] != -1)
			return dp[ind][target];

		int notTaken = findWaysUtil(arr, ind - 1, target, dp);
		int taken = 0;
		if (arr[ind] <= target)
			taken = findWaysUtil(arr, ind, target - arr[ind], dp);

		return dp[ind][target] = notTaken + taken;
	}

	public static int findWays(int[] arr, int target)
	{
		int n = arr.length;

		int[][] dp = new int[n][target + 1];

		for (int row[] : dp)
			Arrays.fill(row, -1);

		int ans = findWaysUtil(arr, n - 1, target, dp);
		return ans;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3 };
		int target = 4;

		System.out.println("The minimum number of coins required to form the target sum is " + findWays(arr, target));
	}

}
