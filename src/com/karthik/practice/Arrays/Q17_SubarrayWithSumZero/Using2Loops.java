package com.karthik.practice.Arrays.Q17_SubarrayWithSumZero;

public class Using2Loops
{
	public static boolean Using2LoopsMethod(int[] arr, int n)
	{
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum = 0;
			for (int j = i; j < n; j++)
			{
				sum += arr[j];
				if (sum == 0)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, -1 };
		System.out.println(Using2LoopsMethod(arr, arr.length));
	}
}
