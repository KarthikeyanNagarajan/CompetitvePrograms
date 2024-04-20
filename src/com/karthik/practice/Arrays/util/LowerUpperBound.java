package com.karthik.practice.Arrays.util;

public class LowerUpperBound
{
	public static int lowerBound(int[] arr, int start, int end, int key)
	{
		while (start < end)
		{
			int mid = start + (end - start) / 2;
			if (arr[mid] < key)
			{
				start = mid + 1;
			}
			else
			{
				end = mid;
			}
		}
		return start;
	}

	// upperBound implementation
	public static int upperBound(int[] arr, int start, int end, int key)
	{
		while (start < end)
		{
			int mid = start + (end - start) / 2;
			if (arr[mid] <= key)
			{
				start = mid + 1;
			}
			else
			{
				end = mid;
			}
		}
		return start;
	}
}
