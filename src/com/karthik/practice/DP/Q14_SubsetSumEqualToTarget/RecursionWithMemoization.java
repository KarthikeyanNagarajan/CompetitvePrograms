package com.karthik.practice.DP.Q14_SubsetSumEqualToTarget;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static boolean subsetSumUtil(int ind, int target, int[] arr, int[][] dp)
	{
		if (target == 0)
			return true;

		if (ind == 0)
			return arr[0] == target;

		if (dp[ind][target] != -1)
			return dp[ind][target] == 0 ? false : true;

		boolean notTaken = subsetSumUtil(ind - 1, target, arr, dp);

		boolean taken = false;
		if (arr[ind] <= target)
			taken = subsetSumUtil(ind - 1, target - arr[ind], arr, dp);

		dp[ind][target] = notTaken || taken ? 1 : 0;
		return notTaken || taken;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4 };
		int k = 4;
		int n = arr.length;

		int dp[][] = new int[n][k + 1];

		for (int row[] : dp)
			Arrays.fill(row, -1);

		if (subsetSumUtil(n - 1, k, arr, dp))
			System.out.println("Subset with the given target found");
		else
			System.out.println("Subset with the given target not found");
	}

}
