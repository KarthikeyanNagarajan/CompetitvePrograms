package com.karthik.practice.Greedy.Q08_NonOverlappingIntervals;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals
{
	public static int func(int[][] arr, int n)
	{
		Arrays.sort(arr, new Comparator<int[]>()
		{
			@Override
			public int compare(int[] a, int[] b)
			{
				return a[1] - b[1];
			}
		});

		int cnt = 1, lastEndTime = arr[0][1];

		for (int i = 1; i < n; i++)
		{
			if (arr[i][0] >= lastEndTime)
			{
				cnt++;
				lastEndTime = arr[i][1];
			}
		}

		return n - cnt;
	}

	public static void main(String[] args)
	{
		int[][] arr = { { 1, 2 }, { 1, 2 }, { 1, 2 } };

		int n = arr.length;

		System.out.println(func(arr, n));
	}

}
