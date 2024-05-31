package com.karthik.practice.Arrays.Q30_NextPermutation;

import java.util.Arrays;

public class NextPermutation
{
	static void reverse(int[] arr, int start, int end)
	{
		while (start < end)
		{
			swap(arr, start, end);
			start++;
			end--;
		}
	}

	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// public static void NextPermutationMethod(int[] arr, int n)
	// {
	// int k = 0, l = 0;
	// for (k = n - 2; k >= 0; k--)
	// {
	// if (arr[k] < arr[k + 1])
	// break;
	// }
	// if (k < 0)
	// reverse(arr, 0, n - 1);
	// else
	// {
	// for (l = n - 1; l > k; l--)
	// {
	// if (arr[l] > arr[k])
	// break;
	// }
	// swap(arr, arr[k], arr[l]);
	// reverse(arr, k+1, n - 1);
	// }
	// Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	// }

	// Leetcode Working
	public static void NextPermutationMethod(int[] arr, int n)
	{
		// From back to front, find the first number < nums[i + 1].
		int i;
		for (i = n - 2; i >= 0; --i)
			if (arr[i] < arr[i + 1])
				break;

		// From back to front, find the first number > nums[i], swap it with nums[i].
		if (i >= 0)
			for (int j = n - 1; j > i; --j)
				if (arr[j] > arr[i])
				{
					swap(arr, i, j);
					break;
				}

		// Reverse nums[i + 1..n - 1].
		reverse(arr, i + 1, n - 1);
		Arrays.stream(arr).forEach(o -> System.out.print(o + " "));
	}

	public static void main(String[] args)
	{
		 int arr[] = { 3, 2, 1 }; // ans = {1, 2, 3}
		// int arr[] = {1, 2, 3, 6, 5, 4}; // ans = {1, 2, 4, 3, 5, 6}
//		int arr[] = { 1, 2, 3 };
		// int arr[] = {1, 1, 5};
		NextPermutationMethod(arr, arr.length);

	}

}
