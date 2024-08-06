package com.karthik.practice.DP.Q24_RodCuttingProblem;

import java.util.Arrays;

public class RecursionWithMemoization
{
	public static int findWaysUtil(int ind, int[] val, int rodLength, int[][] dp)
	{
		if (ind == 0)
		{
			return rodLength * val[0];
		}

		if (dp[ind][rodLength] != -1)
			return dp[ind][rodLength];

		int notTake = 0 + findWaysUtil(ind - 1, val, rodLength, dp);
		int take = Integer.MIN_VALUE;
		int len = ind + 1;
		if (len <= rodLength)
			take = val[ind] + findWaysUtil(ind, val, rodLength - len, dp);

		return dp[ind][rodLength] = Math.max(notTake, take);
	}

	public static int findWays(int[] val, int rodLength)
	{
		int n = val.length;

		int[][] dp = new int[n][rodLength + 1];

		for (int row[] : dp)
			Arrays.fill(row, -1);

		int ans = findWaysUtil(n - 1, val, rodLength, dp);
		return ans;
	}

	public static void main(String[] args)
	{
		int val[] = { 2, 5, 7, 8, 10 };
		int rodLength = 5;

		System.out.println("The Maximum price by cutting rod is " + findWays(val, rodLength));
	}

}
