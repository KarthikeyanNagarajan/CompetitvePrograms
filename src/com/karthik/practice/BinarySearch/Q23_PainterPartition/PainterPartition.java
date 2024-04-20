package com.karthik.practice.BinarySearch.Q23_PainterPartition;

public class PainterPartition
{

	public static int countPainters(int[] arr, int capacity, int n)
	{
		int painters = 1;
		int boardsPainter = 0;		
		for (int i = 0; i < n; i++)
		{
			if(boardsPainter + arr[i] > capacity)
			{
				painters += 1;
				boardsPainter = arr[i];
			}
			else
				boardsPainter += arr[i];
		}
		return painters;
	}

	private static int findLargestMinDistance(int[] arr, int d)
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
			int painters = countPainters(arr, mid, n);
			if (painters <= d)
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
		int ans = findLargestMinDistance(arr, d);
		System.out.println("The minimum capacity should be: " + ans);
	}

}
