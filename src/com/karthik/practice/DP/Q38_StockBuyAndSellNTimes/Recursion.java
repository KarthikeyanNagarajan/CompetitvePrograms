package com.karthik.practice.DP.Q38_StockBuyAndSellNTimes;

public class Recursion
{
	private static long func(int ind, int buy, int cap, long[] prices, int n)
	{
		if (ind == n || cap == 0)
			return 0;

		long profit = 0;

		if (buy == 1)
		{
			profit = Math.max(-prices[ind] + func(ind + 1, 0, cap, prices, n), 0 + func(ind + 1, 1, cap, prices, n));
		}
		else
		{
			profit = Math.max(prices[ind] + func(ind + 1, 1, cap, prices, n), 0 + func(ind + 1, 0, cap, prices, n));
		}

		return profit;
	}

	public static void main(String[] args)
	{
		long[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };
		int n = prices.length;
		int k = 2;

		System.out.println("The maximum profit that can be generated is " + func(0, 1, k, prices, n));
	}

}
