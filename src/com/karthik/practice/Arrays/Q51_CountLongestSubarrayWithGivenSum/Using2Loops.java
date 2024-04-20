package com.karthik.practice.Arrays.Q51_CountLongestSubarrayWithGivenSum;

public class Using2Loops
{
	public static void Using2LoopsMethod(int[] arr, int n, int k)
	{
		int maxlength = 0;
		for (int i = 0; i < n; i++)
		{
			int sum = 0;
			for (int j = i; j < n; j++)
			{
				sum += arr[j];
				if (sum == k)
					maxlength = Math.max(maxlength, j - i + 1);
			}
		}
		System.out.println(maxlength);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		int k = 7;
		Using2LoopsMethod(arr, n, k);
	}

}
