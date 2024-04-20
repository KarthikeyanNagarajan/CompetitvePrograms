package com.karthik.practice.Arrays.Q54_LeadersInArray;

public class UsingSingleLoop
{
	public static void UsingSingleLoopMethod(int[] arr, int n)
	{
		int max = arr[n - 1];
		System.out.print(max + " ");
		for (int i = n - 2; i >= 0; i--)
		{
			if (arr[i] > max)
			{
				System.out.print(arr[i] + " ");
				max = arr[i];
			}
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 6, 7, 1, 0 };
		int n = arr.length;
		UsingSingleLoopMethod(arr, n);
	}

}
