package com.karthik.practice.DP.Q24_RodCuttingProblem;

public class Recursion
{
	public static int findWaysUtil(int ind, int[] val, int rodLength)
	{
		if (ind == 0)
		{
			return rodLength * val[0];
		}

		int notTake = 0 + findWaysUtil(ind - 1, val, rodLength);
		int take = Integer.MIN_VALUE;
		int len = ind + 1;
		if (len <= rodLength)
			take = val[ind] + findWaysUtil(ind, val, rodLength - len);

		return Math.max(notTake, take);
	}

	public static void main(String[] args)
	{
		int val[] = { 2, 5, 7, 8, 10 };
		int rodLength = 5;

		int n = val.length;

		System.out.println("The Maximum price by cutting rod is " + findWaysUtil(n - 1, val, rodLength));
	}

}
