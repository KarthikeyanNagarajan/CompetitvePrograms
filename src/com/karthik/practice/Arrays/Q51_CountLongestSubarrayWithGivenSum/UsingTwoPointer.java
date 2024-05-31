package com.karthik.practice.Arrays.Q51_CountLongestSubarrayWithGivenSum;

public class UsingTwoPointer
{
	public static void twoPointer(int[] arr, int n, int k)
	{
		int left = 0, right = 0;
		int len = 0;

		int sum = arr[0];

		while (right < n)
		{
			while (left <= right && sum > k)
			{
				sum -= arr[left];
				left++;
			}

			if (sum == k)
				len = Math.max(len, right - left + 1);

			right++;
			if (right < n)
				sum += arr[right];
		}
		System.out.println(len);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		int k = 7;
		twoPointer(arr, n, k);
	}

}
