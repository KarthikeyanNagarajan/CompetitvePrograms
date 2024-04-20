package com.karthik.practice.DP.Q14_SubsetSumEqualToTarget;

public class Recursion
{
	private static boolean subsetSumUtil(int ind, int target, int[] arr)
	{
		if (target == 0)
			return true;

		if (ind == 0)
			return arr[0] == target;

		boolean notTaken = subsetSumUtil(ind - 1, target, arr);
		boolean taken = false;
		if (arr[ind] <= target)
			taken = subsetSumUtil(ind - 1, target - arr[ind], arr);
		return taken || notTaken;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4 };
		int k = 4;
		int n = arr.length;

		if (subsetSumUtil(n - 1, k, arr))
			System.out.println("Subset with the given target found");
		else
			System.out.println("Subset with the given target not found");
	}

}
