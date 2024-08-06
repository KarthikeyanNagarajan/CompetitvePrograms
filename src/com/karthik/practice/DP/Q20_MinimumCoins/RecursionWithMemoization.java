package com.karthik.practice.DP.Q20_MinimumCoins;

import java.util.Arrays;

public class RecursionWithMemoization
{
	public static int findWaysUtil(int[] arr, int ind, int target, int[][] dp)
	{
		if (ind == 0)
		{
			if (target % arr[0] == 0)
				return target / arr[0];
			else
				return (int) Math.pow(10, 9);
		}

		if (dp[ind][target] != -1)
			return dp[ind][target];

		int notTaken = 0 + findWaysUtil(arr, ind - 1, target, dp);
		int taken = (int) Math.pow(10, 9);
		if (arr[ind] <= target)
			taken = 1 + findWaysUtil(arr, ind, target - arr[ind], dp);

		return dp[ind][target] = Math.min(notTaken, taken);
	}

	public static int findWays(int[] arr, int target)
	{
		int n = arr.length;

		int[][] dp = new int[n][target + 1];

		for (int row[] : dp)
			Arrays.fill(row, -1);

		int ans = findWaysUtil(arr, n - 1, target, dp);

		if (ans >= (int) Math.pow(10, 9))
			return -1;
		return ans;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3 };
		int target = 7;

		System.out.println("The minimum number of coins required to form the target sum is " + findWays(arr, target));
	}

}
