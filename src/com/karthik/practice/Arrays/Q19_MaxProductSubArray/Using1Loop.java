package com.karthik.practice.Arrays.Q19_MaxProductSubArray;

public class Using1Loop
{
	// public static int Using1LoopsMethod(int[] arr, int n)
	// {
	// int ans = arr[0];
	// int min = arr[0];
	// int max = arr[0];
	// for (int i = 0; i < n; i++)
	// {
	// if (arr[i] < 0)
	// {
	// int temp = min;
	// min = max;
	// max = temp;
	// }
	//
	// min = Math.min(arr[i], min * arr[i]);
	// max = Math.max(arr[i], max * arr[i]);
	// ans = Math.max(ans, max);
	// }
	// return ans;
	// }

	// Leetcode Working
	public static int Using1LoopsMethod(int[] arr, int n)
	{
		int ans = arr[0];
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < n; ++i)
		{
			int num = arr[i];
			int prevMin = min; // min[i - 1]
			int prevMax = max; // max[i - 1]
			if (num < 0)
			{
				min = Math.min(prevMax * num, num);
				max = Math.max(prevMin * num, num);
			}
			else
			{
				min = Math.min(prevMin * num, num);
				max = Math.max(prevMax * num, num);
			}
			ans = Math.max(ans, max);
		}
		return ans;
	}

	public static void main(String[] args)
	{
		int[] arr = { 6, -3, -10, 0, 2 }; // ans = 180
		System.out.println(Using1LoopsMethod(arr, arr.length));
	}

}
