package com.karthik.practice.Arrays.Q51_CountLongestSubarrayWithGivenSum;

public class UsingSlidingWindow
{
	public static void UsingSlidingWindowMethod(int[] arr, int n, int k)
	{
		int start = 0, end = -1, sum = 0, maxlength = 0;
		while (start < n)
		{
			while ((end + 1 < n) && (sum + arr[end + 1] <= k))
				sum += arr[++end];
			if (sum == k)
				maxlength = Math.max(maxlength, end - start + 1);
			sum -= arr[start];
			start++;
		}
		System.out.println(maxlength);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		int k = 7;
		UsingSlidingWindowMethod(arr, n, k);
	}

}
