package com.karthik.practice.Arrays.Q52_PrintLongestSubarrayWithGivenSum;

public class UsingTwoPointer
{
	public static void twoPointer(int[] arr, int n, int k)
	{
		int left = 0, right = 0;

		int sum = arr[0];

		while (right < n)
		{
			while (left <= right && sum > k)
			{
				sum -= arr[left];
				left++;
			}

			if (sum == k)
			{
				for (int p = left; p <= right; p++)
				{
					System.out.print(arr[p] + " ");
				}
				System.out.println();
			}

			right++;
			if (right < n)
				sum += arr[right];
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		int k = 7;
		twoPointer(arr, n, k);
	}

}
