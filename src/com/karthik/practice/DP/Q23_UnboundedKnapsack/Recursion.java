package com.karthik.practice.DP.Q23_UnboundedKnapsack;

public class Recursion
{
	public static int findWaysUtil(int ind, int[] val, int[] wt, int w)
	{
		if (ind == 0)
		{
			return ((int) (w / wt[0])) * val[0];
		}

		int notTake = 0 + findWaysUtil(ind - 1, val, wt, w);
		int take = Integer.MIN_VALUE;
		if (wt[ind] <= w)
			take = val[ind] + findWaysUtil(ind, val, wt, w - wt[ind]);

		return Math.max(notTake, take);
	}

	public static void main(String[] args)
	{
		int val[] = { 5, 11, 13 };
		int wt[] = { 2, 4, 6 };
		int w = 10;

		int n = wt.length;

		System.out.println("The Maximum value of items, the thief can steal is " + findWaysUtil(n - 1, val, wt, w));
	}

}
