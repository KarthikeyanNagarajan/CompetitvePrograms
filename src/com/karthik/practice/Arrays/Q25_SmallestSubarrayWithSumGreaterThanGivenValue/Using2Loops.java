package com.karthik.practice.Arrays.Q25_SmallestSubarrayWithSumGreaterThanGivenValue;

public class Using2Loops
{
	public static int Using2LoopsMethod(int[] arr, int x, int n)
	{
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++)
		{
			int sum = 0;
			for (int j = i; j < n; j++)
			{
				sum = sum + arr[j];
				if (sum > x)
					min = Integer.min(min, j - i + 1);
			}
		}
		return min;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 4, 45, 6, 10, 19 }; // ans = 3
		int x = 51;
		System.out.println(Using2LoopsMethod(arr, x, arr.length));
	}

}
