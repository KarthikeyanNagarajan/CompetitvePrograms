package com.karthik.practice.Arrays.Q63_LengthOfLongestSubArrayWithZeroSum;

public class Using2Loops
{
	public static void Using2LoopsMethod(int[] arr, int n)
	{
		int max = 0;
		for (int i = 0; i < n; i++)
		{
			int sum = 0;
			for (int j = i; j < n; j++)
			{
				sum += arr[j];
				if (sum == 0)
					max = Math.max(max, j - i + 1);
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, -1, 2, 3, -3, -2 };
		int n = arr.length;
		Using2LoopsMethod(arr, n);
	}

}
