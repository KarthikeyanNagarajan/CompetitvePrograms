package com.karthik.practice.DP.Q17_CountSubsetsWithSumK;

public class Recursion
{
	public static int findWaysUtil(int ind, int target, int[] arr)
	{
		if (target == 0)
			return 1;

		if (ind == 0)
			return arr[0] == target ? 1 : 0;

		int notTaken = findWaysUtil(ind - 1, target, arr);

		int taken = 0;
		if (arr[ind] <= target)
			taken = findWaysUtil(ind - 1, target - arr[ind], arr);

		return notTaken + taken;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 2, 3 };
		int n = arr.length;
		int k = 3;

		System.out.println("The number of subsets found are " + findWaysUtil(n - 1, k, arr));
	}

}
