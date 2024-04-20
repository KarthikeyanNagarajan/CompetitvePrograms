package com.karthik.practice.SortingAlgorithms;

import java.util.Arrays;

public class Q1_SelectionSort
{
	static void sort(int[] arr)
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
		{
			int min_index = i;
			for (int j = i + 1; j < n; j++)
			{
				if (arr[j] < arr[min_index])
					min_index = j;
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		sort(arr);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

}
