package com.karthik.practice.Arrays.Q52_PrintLongestSubarrayWithGivenSum;

public class UsingSlidingWindow
{
	public static void UsingSlidingWindowMethod(int[] arr, int n, int k)
	{
		int start = 0, end = -1, sum = 0;
		while (start < n)
		{
			while ((end + 1 < n) && (sum + arr[end + 1] <= k))
				sum += arr[++end];
			if (sum == k)
			{
				for (int p = start; p <= end; p++)
				{
					System.out.print(arr[p] + " ");
				}
				System.out.println();
			}
			sum -= arr[start];
			start++;
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		int k = 7;
		UsingSlidingWindowMethod(arr, n, k);
	}

}
