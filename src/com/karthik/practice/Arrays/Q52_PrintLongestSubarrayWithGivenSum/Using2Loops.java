package com.karthik.practice.Arrays.Q52_PrintLongestSubarrayWithGivenSum;

public class Using2Loops
{
	public static void Using2LoopsMethod(int[] arr, int n, int k)
	{
		for (int i = 0; i < n; i++)
		{
			int sum = 0;
			for (int j = i; j < n; j++)
			{
				sum += arr[j];
				if (sum == k)
				{
					for (int p = i; p <= j; p++)
					{
						System.out.print(arr[p] + " ");
					}
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		int k = 7;
		Using2LoopsMethod(arr, n, k);
	}

}
