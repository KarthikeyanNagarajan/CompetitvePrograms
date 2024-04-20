package com.karthik.practice.DP.Q38_StockBuyAndSellNTimes;

import java.util.Arrays;

public class Tabulation
{
	private static long func(long[] prices, int n, long[][][] dp, int k)
	{
		for (int ind = n - 1; ind >= 0; ind--)
		{
			for (int buy = 0; buy <= 1; buy++)
			{
				for (int cap = 1; cap <= k; cap++)
				{
					if (buy == 1)
					{
						dp[ind][buy][cap] = Math.max(-prices[ind] + dp[ind + 1][0][cap], 0 + dp[ind + 1][1][cap]);
					}
					else
					{
						dp[ind][buy][cap] = Math.max(prices[ind] + dp[ind + 1][1][cap - 1], 0 + dp[ind + 1][0][cap]);
					}
				}
			}
		}
		return dp[0][1][k];
	}

	public static void main(String args[])
	{
		long[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };
		int n = prices.length;
		int k = 2;

		long[][][] dp = new long[n + 1][2][k + 1];
		for (long[][] rows : dp)
			for (long[] row : rows)
				Arrays.fill(row, 0);

		System.out.println("The maximum profit that can be generated is " + func(prices, n, dp, k));
	}

}
