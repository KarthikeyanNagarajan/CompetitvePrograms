package com.karthik.practice.DP.Q05_MaxSumOfNonAdjacentElements;

public class Recursion
{
	private static int recur(int n, int[] arr)
	{
		if (n == 0)
			return arr[n];

		if (n < 0)
			return 0;

		int pick = arr[n] + recur(n - 2, arr);
		int notpick = 0 + recur(n - 1, arr);
		return Math.max(pick, notpick);
	}

	public static void main(String[] args)
	{
		int arr[] = { 2, 1, 4, 9 };
		int n = arr.length;
		System.out.println(recur(n - 1, arr));
	}

}
