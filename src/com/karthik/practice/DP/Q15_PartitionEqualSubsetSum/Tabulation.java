package com.karthik.practice.DP.Q15_PartitionEqualSubsetSum;

public class Tabulation
{

	private static boolean subsetSumToK(int n, int k, int[] arr)
	{
		int totalSum = 0;
		for (int i = 0; i < n; i++)
			totalSum += arr[i];
		if (totalSum % 2 == 1)
			return false;
		else
		{
			boolean dp[][] = new boolean[n][k + 1];
			for (int i = 0; i < n; i++)
				dp[i][0] = true;

			if (arr[0] <= k)
				dp[0][arr[0]] = true;

			for (int ind = 1; ind < n; ind++)
			{
				for (int target = 1; target <= k; target++)
				{
					boolean notTaken = dp[ind - 1][target];
					boolean taken = false;
					if (arr[ind] <= target)
						taken = dp[ind - 1][target - arr[ind]];
					dp[ind][target] = notTaken || taken;
				}
			}
			return dp[n - 1][k];
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4 };
		int k = 4;
		int n = arr.length;

		if (subsetSumToK(n, k, arr))
			System.out.println("Subset with the given target found");
		else
			System.out.println("Subset with the given target not found");
	}

}
