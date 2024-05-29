package com.karthik.practice.Arrays.Q25_SmallestSubarrayWithSumGreaterThanGivenValue;

public class Using1Loop
{
	public static int Using1LoopsMethod(int[] arr, int x, int n)
	{
		int min = Integer.MAX_VALUE;
		int i = 0, j = 0, sum = 0;
		while (i <= j && j < n)
		{
			while (sum <= x && j < n)
			{
				sum += arr[j++];
			}
			while (sum > x && i < j)
			{
				min = Integer.min(min, j - i);
				sum -= arr[i++];
			}
		}
		return min;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 4, 45, 6, 10, 19 }; // ans = 3
		int x = 51;
		System.out.println(Using1LoopsMethod(arr, x, arr.length));
	}

}
