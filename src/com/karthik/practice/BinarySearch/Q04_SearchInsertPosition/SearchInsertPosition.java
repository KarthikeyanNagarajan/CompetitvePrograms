package com.karthik.practice.BinarySearch.Q04_SearchInsertPosition;

public class SearchInsertPosition
{
	
	private static int searchInsertPosition(int[] arr, int n, int target)
	{
		int low = 0, high = arr.length - 1;
		int ans = n;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (arr[mid] >= target)
			{
				ans = mid;
				high = mid - 1;				
			}
			else
				low = mid + 1;
		}
		return ans;
	}

	public static void main(String[] args)
	{
		int[] arr = { 3, 5, 8, 15, 19 };
		int n = 5, x = 9;
		int ind = searchInsertPosition(arr, n, x);
		System.out.println("The insert position is the index: " + ind);
	}

}
