package com.karthik.practice.DP.Q21_TargetSum;

import java.util.Arrays;

public class RecursionWithMemoization
{
	public static int findWaysUtil(int ind, int target, int[] arr, int[][] dp)
	{
		if (ind == 0)
		{
			if (target == 0 && arr[0] == 0)
				return 2;
			if (target == 0 || target == arr[0])
				return 1;
			return 0;
		}

		if (dp[ind][target] != -1)
			return dp[ind][target];

		int notTaken = findWaysUtil(ind - 1, target, arr, dp);
		int taken = 0;
		if (arr[ind] <= target)
			taken = findWaysUtil(ind - 1, target - arr[ind], arr, dp);

		return dp[ind][target] = (notTaken + taken);
	}

	public static int findWays(int n, int target, int[] arr)
	{
		int totSum = 0;

		for (int i = 0; i < arr.length; i++)
		{
			totSum += arr[i];
		}

		if (totSum - target < 0)
			return 0;
		if ((totSum - target) % 2 == 1)
			return 0;

		int s2 = (totSum - target) / 2;

		int dp[][] = new int[n][s2 + 1];

		for (int row[] : dp)
			Arrays.fill(row, -1);

		return findWaysUtil(n - 1, s2, arr, dp);
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 1 };
		int target = 3;

		int n = arr.length;

		System.out.println("The number of ways found is " + findWays(n, target, arr));
	}

}
