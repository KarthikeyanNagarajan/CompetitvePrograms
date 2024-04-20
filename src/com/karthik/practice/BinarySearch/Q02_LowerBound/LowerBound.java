package com.karthik.practice.BinarySearch.Q02_LowerBound;

public class LowerBound
{

	private static int lowerBound(int[] arr, int n, int target)
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
		int ind = lowerBound(arr, n, x);
		System.out.println("The lower bound is the index: " + ind);
	}

}
