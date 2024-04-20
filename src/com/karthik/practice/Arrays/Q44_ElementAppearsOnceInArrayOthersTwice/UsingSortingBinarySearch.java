package com.karthik.practice.Arrays.Q44_ElementAppearsOnceInArrayOthersTwice;

import java.util.Arrays;

public class UsingSortingBinarySearch
{
	public static void UsingSortingBinarySearchMethod(int[] arr, int n)
	{
		Arrays.sort(arr);
		int low = 0, high = n - 2;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (arr[mid] == arr[mid ^ 1])
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		System.out.println(arr[low]);
	}

	public static void main(String[] args)
	{
//		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6 };
		int[] arr = { 2, 2, 1 };
		UsingSortingBinarySearchMethod(arr, arr.length);
	}
}
