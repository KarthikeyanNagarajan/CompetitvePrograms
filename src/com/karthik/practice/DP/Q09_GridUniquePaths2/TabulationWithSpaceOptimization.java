package com.karthik.practice.DP.Q09_GridUniquePaths2;

public class TabulationWithSpaceOptimization
{

	public static void main(String[] args)
	{
		int arr[] = { 2, 1, 4, 9 };
		int n = arr.length;
		int prev = arr[0];
		int prev2 = 0;
		for (int i = 1; i < n; i++)
		{
			int pick = arr[i];
			if (i > 1)
				pick += prev2;
			int notpick = 0 + prev;
			int cur = Math.max(pick, notpick);
			prev2 = prev;
			prev = cur;
		}
		System.out.println(prev);
	}

}
