package com.karthik.practice.DP.Q22_CoinChange2;

public class Recursion
{
	public static int findWaysUtil(int[] arr, int ind, int target)
	{
		if (ind == 0)
		{
			if (target % arr[0] == 0)
				return 1;
			else
				return 0;
		}

		int notTaken = findWaysUtil(arr, ind - 1, target);
		int taken = 0;
		if (arr[ind] <= target)
			taken = findWaysUtil(arr, ind, target - arr[ind]);

		return notTaken + taken;
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
