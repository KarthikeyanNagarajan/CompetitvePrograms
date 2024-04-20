package com.karthik.practice.Arrays.Q19_MaxProductSubArray;

public class Using2Loops
{
	// Leetcode Not Working
	public static int Using2LoopsMethod(int[] arr, int n)
	{
		int result = 0;
		int mul = 0;
		for (int i = 0; i < n; i++)
		{
			mul = arr[i];
			for (int j = i + 1; j < n; j++)
			{
				result = Math.max(result, mul);
				mul = mul * arr[j];
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		int[] arr = { 6, -3, -10, 0, 2 }; // ans = 180
		System.out.println(Using2LoopsMethod(arr, arr.length));

	}

}
