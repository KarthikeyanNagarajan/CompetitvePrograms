package com.karthik.practice.SortingAlgorithms;

import java.util.Arrays;

public class Q7_ShellSort
{
	static void sort(int[] arr)
	{
		int n = arr.length;
		for (int gap = n / 2; gap > 0; gap /= 2)
		{
			for (int i = gap; i < n; i++)
			{
				int temp = arr[i];
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
				{
					arr[j] = arr[j - gap];
				}
				arr[j] = temp;
			}
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		sort(arr);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

}
