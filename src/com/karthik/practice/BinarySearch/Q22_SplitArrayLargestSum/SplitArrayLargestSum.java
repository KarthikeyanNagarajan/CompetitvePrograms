package com.karthik.practice.BinarySearch.Q22_SplitArrayLargestSum;

public class SplitArrayLargestSum
{

	public static int countPartitions(int[] arr, int capacity, int n)
	{
		int partitions = 1;
		int subarraySum = 0;		
		for (int i = 0; i < n; i++)
		{
			if(subarraySum + arr[i] > capacity)
			{
				partitions += 1;
				subarraySum = arr[i];
			}
			else
				subarraySum += arr[i];
		}
		return partitions;
	}

	private static int largestSubarraySumMinimized(int[] arr, int d)
	{
		int n = arr.length;
		int low = Integer.MIN_VALUE, high = 0;
		for (int i = 0; i < n; i++)
		{
			high += arr[i];
			low = Math.max(low, arr[i]);
		}

		while (low <= high)
		{
			int mid = (low + high) / 2;
			int partitions = countPartitions(arr, mid, n);
			if (partitions <= d)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args)
	{
		int[] arr = {10, 20, 30, 40};
        int d = 2;
		int ans = largestSubarraySumMinimized(arr, d);
		System.out.println("The minimum capacity should be: " + ans);
	}

}
