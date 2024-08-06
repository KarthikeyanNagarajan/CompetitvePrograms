package com.karthik.practice.DP.Q19_0or1Knapsack;

public class Recursion
{
	public static int findWaysUtil(int ind, int[] val, int[] wt, int w)
	{
		if (ind == 0)
		{
			if (wt[0] <= w)
				return wt[0];
			else
				return 0;
		}

		int notTake = 0 + findWaysUtil(ind - 1, val, wt, w);
		int take = Integer.MIN_VALUE;

		if (wt[ind] <= w)
			take = val[ind] + findWaysUtil(ind - 1, val, wt, w - wt[ind]);

		return Math.max(notTake, take);
	}

	public static void main(String[] args)
	{
		int val[] = { 5, 11, 13 };
		int wt[] = { 2, 4, 6 };
		int w = 10;

		int n = wt.length;
		System.out.println("The items the thief can steal is " + findWaysUtil(n - 1, val, wt, w));
	}

}
