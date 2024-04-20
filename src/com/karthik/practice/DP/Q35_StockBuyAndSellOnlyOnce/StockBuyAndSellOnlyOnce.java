package com.karthik.practice.DP.Q35_StockBuyAndSellOnlyOnce;

public class StockBuyAndSellOnlyOnce
{

	private static int maximumProfit(int[] prices, int n)
	{
		int mini = prices[0];
		int maxProfit = 0;

		for (int i = 0; i < n; i++)
		{
			int cost = prices[i] - mini;
			maxProfit = Math.max(maxProfit, cost);
			mini = Math.min(mini, prices[i]);
		}
		return maxProfit;
	}

	public static void main(String[] args)
	{
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int n = prices.length;
		System.out.println("The maximum profit by selling the stock is " + maximumProfit(prices, n));
	}

}
