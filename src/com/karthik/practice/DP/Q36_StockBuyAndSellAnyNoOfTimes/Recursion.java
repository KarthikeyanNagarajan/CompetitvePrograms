package com.karthik.practice.DP.Q36_StockBuyAndSellAnyNoOfTimes;

public class Recursion
{
	private static long func(int ind, int buy, long[] prices, int n)
	{
		if (ind == n)
			return 0;

		long profit = 0;

		if (buy == 1)
		{
			profit = Math.max(-prices[ind] + func(ind + 1, 0, prices, n), 0 + func(ind + 1, 1, prices, n));
		}
		else
		{
			profit = Math.max(prices[ind] + func(ind + 1, 1, prices, n), 0 + func(ind + 1, 0, prices, n));
		}
		return profit;
	}

	public static void main(String[] args)
	{
		long[] prices = { 7, 1, 5, 3, 6, 4 };
		int n = prices.length;

		System.out.println("The maximum profit that can be generated is " + func(0, 1, prices, n));
	}

}
