package com.karthik.practice.DP.Q37_StockBuyAndSellOnly2Times;

import java.util.Arrays;

public class RecursionWithMemoization
{
	private static long func(int ind, int buy, int cap, long[] prices, int n, long[][][] dp)
	{
		if (ind == n)
			return 0;

		if (dp[ind][buy][cap] != -1)
			return dp[ind][buy][cap];

		long profit = 0;

		if (buy == 1)
		{
			profit = Math.max(-prices[ind] + func(ind + 1, 0, cap, prices, n, dp),
					0 + func(ind + 1, 1, cap, prices, n, dp));
		}
		else
		{
			profit = Math.max(prices[ind] + func(ind + 1, 1, cap, prices, n, dp),
					0 + func(ind + 1, 0, cap, prices, n, dp));
		}
		return dp[ind][buy][cap] = profit;
	}

	public static void main(String[] args)
	{
		long[] prices = { 7, 1, 5, 3, 6, 4 };
		int n = prices.length;

		long[][][] dp = new long[n][2][3];
		for (long[][] rows : dp)
			for (long[] row : rows)
				Arrays.fill(row, -1);

		System.out.println("The maximum profit that can be generated is " + func(0, 1, 2, prices, n, dp));
	}

}
