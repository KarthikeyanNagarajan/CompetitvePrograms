package com.karthik.practice.Arrays.Q54_LeadersInArray;

public class Using2Loops
{
	public static void Using2LoopsMethod(int[] arr, int n)
	{
		for (int i = 0; i < n - 1; i++)
		{
			boolean leader = true;
			for (int j = i + 1; j < n; j++)
			{
				if (arr[j] > arr[i])
				{
					leader = false;
					break;
				}
			}
			if (leader)
				System.out.print(arr[i] + " ");
		}
		System.out.print(arr[n - 1]);
	}

	public static void main(String[] args)
	{
		int[] arr = { 6, 7, 1, 0 };
		int n = arr.length;
		Using2LoopsMethod(arr, n);
	}

}
