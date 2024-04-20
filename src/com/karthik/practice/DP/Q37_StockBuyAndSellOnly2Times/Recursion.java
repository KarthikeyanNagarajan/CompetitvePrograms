package com.karthik.practice.DP.Q37_StockBuyAndSellOnly2Times;

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
		long[] prices = { 7, 1, 5, 3, 6, 4 };
		int n = prices.length;

		System.out.println("The maximum profit that can be generated is " + func(0, 1, 2, prices, n));
	}

}
