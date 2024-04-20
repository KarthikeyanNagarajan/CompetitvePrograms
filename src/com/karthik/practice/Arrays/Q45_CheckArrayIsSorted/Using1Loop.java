package com.karthik.practice.Arrays.Q45_CheckArrayIsSorted;

public class Using1Loop
{
	public static boolean Using1LoopMethod(int[] arr, int n)
	{
		for (int i = 1; i < n - 1; i++)
		{
			if (arr[i] < arr[i - 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Using1LoopMethod(arr, arr.length));
	}

}
