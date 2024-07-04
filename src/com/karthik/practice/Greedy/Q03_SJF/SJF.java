package com.karthik.practice.Greedy.Q03_SJF;

import java.util.Arrays;

public class SJF
{
	public static int func(int[] arr, int n)
	{
		Arrays.sort(arr);
		int time = 0, wtTime = 0;

		for (int i = 0; i < n; i++)
		{
			wtTime += time;
			time += arr[i];
		}

		return wtTime / n;
	}

	public static void main(String[] args)
	{
		int n = 5;
		int[] arr = { 4, 3, 7, 1, 2 };

		System.out.println(func(arr, n));
	}

}
