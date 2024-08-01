package com.karthik.practice.DP.Q17_CountSubsetsWithSumK;

public class Tabulation
{
	public static int findWays(int[] arr, int k)
	{
		int n = arr.length;

		int[][] dp = new int[n][k + 1];

		// Initialize the first row of the DP array
		for (int i = 0; i < n; i++)
		{
			dp[i][0] = 1;
		}

		// Initialize the first column of the DP array
		if (arr[0] <= k)
		{
			dp[0][arr[0]] = 1;
		}

		for (int ind = 1; ind < n; ind++)
		{
			for (int target = 1; target <= k; target++)
			{
				int notTaken = dp[ind - 1][target];

				int taken = 0;
				if (arr[ind] <= target)
				{
					taken = dp[ind - 1][target - arr[ind]];
				}

				dp[ind][target] = notTaken + taken;
			}
		}

		return dp[n - 1][k];
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 2, 3 };
		int k = 3;

		System.out.println("The number of subsets found are " + findWays(arr, k));
	}

}
