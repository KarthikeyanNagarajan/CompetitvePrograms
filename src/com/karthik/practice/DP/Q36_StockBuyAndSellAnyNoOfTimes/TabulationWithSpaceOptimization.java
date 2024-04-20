package com.karthik.practice.DP.Q36_StockBuyAndSellAnyNoOfTimes;

public class TabulationWithSpaceOptimization
{
	private static long func(long[] prices, int n)
	{

		long[] ahead = new long[2];
		long[] cur = new long[2];

		ahead[0] = ahead[1] = 0;
		long profit = 0;

		for (int ind = n - 1; ind >= 0; ind--)
		{
			for (int buy = 0; buy <= 1; buy++)
			{
				if (buy == 1)
				{
					profit = Math.max(-prices[ind] + ahead[0], 0 + ahead[1]);
				}
				else
				{
					profit = Math.max(prices[ind] + ahead[1], 0 + ahead[0]);
				}
				cur[buy] = profit;
			}
			ahead = cur;
		}
		return ahead[1];
	}

	public static void main(String args[])
	{
		long[] prices = { 7, 1, 5, 3, 6, 4 };
		int n = prices.length;

		System.out.println("The maximum profit that can be generated is " + func(prices, n));
	}

}
