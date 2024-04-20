package com.karthik.practice.Recursion.Q08_ReverseAnArray;

import java.util.Arrays;

public class ReverseAnArray
{
	public static void swap(int[] arr, int val1, int val2)
	{
		int temp = arr[val1];
		arr[val1] = arr[val2];
		arr[val2] = temp;
	}

	public static void print(int i, int[] arr, int n)
	{
		if (i >= n / 2)
			return;
		swap(arr, i, n - i - 1);
		print(i + 1, arr, n);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 5;
		print(0, arr, n);
		Arrays.stream(arr).forEach(System.out::println);
	}
}
