package com.karthik.practice.Arrays.Q10_MinNumberOfJumpsToReachEnd;

public class UsingRecursion
{
	public static int minJumps(int arr[], int low, int high)
	{
		if (low == high)
			return 0;

		// When nothing is reachable
		// from the given source
		if (arr[low] == 0)
			return Integer.MAX_VALUE;

		// Traverse through all the points
		// reachable from arr[l]. Recursively
		// get the minimum number of jumps
		// needed to reach arr[h] from these
		// reachable points.
		int min_jumps = Integer.MAX_VALUE;
		for (int i = low + 1; i <= high && i <= low + arr[low]; i++)
		{
			int jumps = minJumps(arr, i, high);
			if (jumps != Integer.MAX_VALUE && jumps + 1 < min_jumps)
				min_jumps = jumps + 1;
		}
		return min_jumps;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		int n = arr.length;
		int ans = minJumps(arr, 0, n - 1);
		System.out.print("Minimum number of jumps to reach end is " + ans);
	}

}
