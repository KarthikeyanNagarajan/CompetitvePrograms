package com.karthik.practice.DP.Q20_MinimumCoins;

public class Recursion
{
	public static int findWaysUtil(int[] arr, int ind, int target)
	{
		if (ind == 0)
		{
			if (target % arr[0] == 0)
				return target / arr[0];
			else
				return (int) Math.pow(10, 9);
		}

		int notTaken = 0 + findWaysUtil(arr, ind - 1, target);
		int taken = (int) Math.pow(10, 9);
		if (arr[ind] <= target)
			taken = 1 + findWaysUtil(arr, ind, target - arr[ind]);

		return Math.min(notTaken, taken);
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3 };
		int target = 7;
		int n = arr.length;

		System.out.println(
				"The minimum number of coins required to form the target sum is " + findWaysUtil(arr, n - 1, target));
	}

}
