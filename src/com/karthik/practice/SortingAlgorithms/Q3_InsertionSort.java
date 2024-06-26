package com.karthik.practice.SortingAlgorithms;

import java.util.Arrays;

public class Q3_InsertionSort
{
	static void sort(int[] arr)
	{
		int n = arr.length;
		for (int i = 1; i < n; i++)
		{
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		sort(arr);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

}
