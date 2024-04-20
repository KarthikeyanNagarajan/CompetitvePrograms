package com.karthik.practice.SortingAlgorithms;

import java.util.Arrays;

public class Q4_QuickSort
{
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];
		int i = low - 1;
		for (int j = 0; j < high; j++)
		{
			if (arr[j] < pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	static void sort(int[] arr, int low, int high)
	{
		if (low < high)
		{
			int p = partition(arr, low, high);
			sort(arr, low, p - 1);
			sort(arr, p + 1, high);
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;
		sort(arr, 0, n - 1);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

}
