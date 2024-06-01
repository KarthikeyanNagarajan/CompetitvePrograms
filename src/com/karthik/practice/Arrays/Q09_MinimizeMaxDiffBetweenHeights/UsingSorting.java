package com.karthik.practice.Arrays.Q09_MinimizeMaxDiffBetweenHeights;

import java.util.Arrays;

public class UsingSorting
{
	public static int UsingSortingMethod(int[] arr, int n, int k)
	{
		Arrays.sort(arr); // Sort the Array

		int ans = arr[n - 1] - arr[0]; // Initial ans without inc/dec by K

		// Minimise diff between first and last tower
		int smallest = arr[0] + k;
		int largest = arr[n - 1] - k;

		int min = 0, max = 0;
		for (int i = 0; i < n - 1; i++)
		{
			min = Math.min(smallest, arr[i + 1] - k);
			max = Math.max(largest, arr[i] + k);
			if (min < 0)
				continue;
			ans = Math.min(ans, max - min);
		}
		return ans;
	}

	public static void main(String[] args)
	{
		// Tower Problem, Each value is Tower height
		int arr[] = { 1, 5, 15, 10 }; // ans = 8
		int k = 3; // Increment/Decrement each tower height by K
		int n = arr.length;
		System.out.println(UsingSortingMethod(arr, n, k));
	}

}
