package com.karthik.practice.Arrays.Q29_ChocolateDistribution;

import java.util.Arrays;

public class UsingSorting
{
	public static int UsingSortingMethod(int[] arr, int m, int n)
	{
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i + m - 1 < n; i++)
		{
			if (arr[i + m - 1] - arr[i] < min)
				min = arr[i + m - 1] - arr[i];
		}
		return min;
	}

	public static void main(String[] args)
	{
		int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
		int m = 7; // ans = 10;
		System.out.println(UsingSortingMethod(arr, m, arr.length));
	}

}
