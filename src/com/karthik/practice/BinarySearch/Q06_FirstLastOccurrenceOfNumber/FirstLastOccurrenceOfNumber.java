package com.karthik.practice.BinarySearch.Q06_FirstLastOccurrenceOfNumber;

import java.util.Arrays;

public class FirstLastOccurrenceOfNumber
{

	private static int firstOccurrence(int[] arr, int n, int target)
	{
		int low = 0, high = arr.length - 1;
		int ans = -1;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (arr[mid] == target)
			{
				ans = mid;
				high = mid - 1;
			}
			else if(arr[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return ans;
	}

	private static int lastOccurrence(int[] arr, int n, int target)
	{
		int low = 0, high = arr.length - 1;
		int ans = -1;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (arr[mid] == target)
			{
				ans = mid;
				low = mid + 1;
			}
			else if(arr[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return ans;
	}

	public static int[] firstAndLastPosition(int[] arr, int n, int k)
	{
		int first = firstOccurrence(arr, n, k);
		if (first == -1)
			return new int[] { -1, -1 };
		int last = lastOccurrence(arr, n, k);
		return new int[] { first, last };
	}

	public static void main(String[] args)
	{
		int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };
		int n = 8, x = 8;
		int[] ans = firstAndLastPosition(arr, n, x);
		Arrays.stream(ans).forEach(i -> System.out.println(i));
	}

}
