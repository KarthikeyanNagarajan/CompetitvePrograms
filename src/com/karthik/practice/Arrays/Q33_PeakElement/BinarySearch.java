package com.karthik.practice.Arrays.Q33_PeakElement;

public class BinarySearch
{
	public static void BinarySearchMethod(int[] arr, int n)
	{
		int start = 0, end = n - 1;
		while (start < end)
		{
			int mid = start + (end - start) / 2;
			if (arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1])
				System.out.println(arr[mid]);
			if (arr[mid] < arr[mid - 1])
				end = mid - 1;
			else
				start = mid + 1;
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 3, 2 }; // ans = 3
		BinarySearchMethod(arr, arr.length);
	}
}
