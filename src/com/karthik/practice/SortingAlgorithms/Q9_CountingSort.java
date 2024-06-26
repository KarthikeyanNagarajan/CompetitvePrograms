package com.karthik.practice.SortingAlgorithms;

import java.util.Arrays;

public class Q9_CountingSort
{
	static void sort(int[] arr)
	{
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		int range = max - min + 1;
		int[] count = new int[range];
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			count[arr[i] - min]++;
		}
		for (int i = 1; i < count.length; i++)
		{
			count[i] += count[i - 1];
		}
		for (int i = arr.length - 1; i >= 0; i--)
		{
			output[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min]--;
		}
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = output[i];
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		sort(arr);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

}
