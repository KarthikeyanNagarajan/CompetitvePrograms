package com.karthik.practice.Arrays.Q45_CheckArrayIsSorted;

public class Using2Loops
{
	public static boolean Using2LoopsMethod(int[] arr, int n)
	{
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (arr[i] > arr[j])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Using2LoopsMethod(arr, arr.length));
	}

}
