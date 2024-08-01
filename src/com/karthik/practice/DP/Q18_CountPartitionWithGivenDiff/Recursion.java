package com.karthik.practice.DP.Q18_CountPartitionWithGivenDiff;

public class Recursion
{
	public static int findWaysUtil(int ind, int target, int[] arr)
	{
		if (ind == 0)
		{
			if (target == 0 && arr[0] == 0)
				return 2;
			if (target == 0 || arr[0] == target)
				return 1;
			return 0;
		}

		int notTaken = findWaysUtil(ind - 1, target, arr);

		int taken = 0;
		if (arr[ind] <= target)
			taken = findWaysUtil(ind - 1, target - arr[ind], arr);

		return notTaken + taken;
	}

	public static void main(String[] args)
	{
		int[] arr = { 0, 0, 1 };
		int k = 1;
		int n = arr.length;

		System.out.println("The number of subsets found are " + findWaysUtil(n - 1, k, arr));
	}

}
