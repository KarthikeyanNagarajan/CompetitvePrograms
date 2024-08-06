package com.karthik.practice.DP.Q23_UnboundedKnapsack;

import java.util.Arrays;

public class RecursionWithMemoization
{
	public static int findWaysUtil(int ind, int[] val, int[] wt, int w, int[][] dp)
	{
		if (ind == 0)
		{
			return ((int) (w / wt[0])) * val[0];
		}

		if (dp[ind][w] != -1)
			return dp[ind][w];

		int notTake = 0 + findWaysUtil(ind - 1, val, wt, w, dp);
		int take = Integer.MIN_VALUE;
		if (wt[ind] <= w)
			take = val[ind] + findWaysUtil(ind, val, wt, w - wt[ind], dp);

		return dp[ind][w] = Math.max(notTake, take);
	}

	public static int findWays(int[] val, int[] wt, int w)
	{
		int n = wt.length;

		int[][] dp = new int[n][w + 1];

		for (int row[] : dp)
			Arrays.fill(row, -1);

		int ans = findWaysUtil(n - 1, val, wt, w, dp);
		return ans;
	}

	public static void main(String[] args)
	{
		int val[] = { 5, 11, 13 };
		int wt[] = { 2, 4, 6 };
		int w = 10;

		System.out.println("The Maximum value of items, the thief can steal is " + findWays(val, wt, w));
	}

}
