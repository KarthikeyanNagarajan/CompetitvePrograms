package com.karthik.practice.Arrays.Q43_SecondSmallestLargestElement;

import java.util.Arrays;

public class UsingSorting
{
	public static void UsingSortingMethod(int[] arr, int n)
	{
		Arrays.sort(arr);
		System.out.println(arr[1]);
		System.out.println(arr[n-2]);
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		UsingSortingMethod(arr, n);
	}

}
