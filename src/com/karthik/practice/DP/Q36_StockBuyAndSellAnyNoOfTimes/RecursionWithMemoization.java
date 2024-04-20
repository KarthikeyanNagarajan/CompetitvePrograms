package com.karthik.practice.DP.Q36_StockBuyAndSellAnyNoOfTimes;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static long func(int ind, int buy, long[] prices, int n, long[][] dp)
	{
		if (ind == n)
			return 0;

		if (dp[ind][buy] != -1)
			return dp[ind][buy];

		long profit = 0;

		if (buy == 1)
		{
			profit = Math.max(-prices[ind] + func(ind + 1, 0, prices, n, dp), 0 + func(ind + 1, 1, prices, n, dp));
		}
		else
		{
			profit = Math.max(prices[ind] + func(ind + 1, 1, prices, n, dp), 0 + func(ind + 1, 0, prices, n, dp));
		}
		return dp[ind][buy] = profit;
	}

	public static void main(String[] args)
	{
		long[] prices = { 7, 1, 5, 3, 6, 4 };
		int n = prices.length;

		long[][] dp = new long[n][n];
		for (long row[] : dp)
			Arrays.fill(row, -1);

		System.out.println("The maximum profit that can be generated is " + func(0, 1, prices, n, dp));
	}

}
