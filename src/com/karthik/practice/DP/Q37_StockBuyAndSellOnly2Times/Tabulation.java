package com.karthik.practice.DP.Q37_StockBuyAndSellOnly2Times;

import java.util.Arrays;

public class Tabulation
{
	private static long func(long[] prices, int n, long[][][] dp)
	{		
		for (int ind = n - 1; ind >= 0; ind--)
		{
			for (int buy = 0; buy <= 1; buy++)
			{
				for (int cap = 1; cap <= 2; cap++)
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
		return dp[0][1][2];
	}

	public static void main(String args[])
	{
		long[] prices = { 7, 1, 5, 3, 6, 4 };
		int n = prices.length;

		long[][][] dp = new long[n + 1][2][3];
		for (long[][] rows : dp)
			for (long[] row : rows)
				Arrays.fill(row, 0);

		System.out.println("The maximum profit that can be generated is " + func(prices, n, dp));
	}

}
