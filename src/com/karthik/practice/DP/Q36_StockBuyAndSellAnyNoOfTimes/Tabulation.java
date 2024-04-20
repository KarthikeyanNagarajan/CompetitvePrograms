package com.karthik.practice.DP.Q36_StockBuyAndSellAnyNoOfTimes;

import java.util.Arrays;

public class Tabulation
{
	private static long func(long[] prices, int n, long[][] dp)
	{
		dp[n][0] = dp[n][1] = 0;

		for (int ind = n - 1; ind >= 0; ind--)
		{
			for (int buy = 0; buy <= 1; buy++)
			{
				long profit = 0;
				if (buy == 1)
				{
					profit = Math.max(-prices[ind] + dp[ind + 1][0], 0 + dp[ind + 1][1]);
				}
				else
				{
					profit = Math.max(prices[ind] + dp[ind + 1][1], 0 + dp[ind + 1][0]);
				}
				dp[ind][buy] = profit;
			}
		}
		return dp[0][1];
	}

	public static void main(String args[])
	{
		long[] prices = { 7, 1, 5, 3, 6, 4 };
		int n = prices.length;

		long[][] dp = new long[n + 1][n + 1];
		for (long row[] : dp)
			Arrays.fill(row, -1);

		System.out.println("The maximum profit that can be generated is " + func(prices, n, dp));
	}

}
