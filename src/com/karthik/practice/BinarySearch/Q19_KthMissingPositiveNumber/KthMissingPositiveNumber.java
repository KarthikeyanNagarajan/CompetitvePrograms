package com.karthik.practice.BinarySearch.Q19_KthMissingPositiveNumber;

public class KthMissingPositiveNumber
{

	private static int missingK(int[] arr, int n, int k)
	{
		int low = 0, high = n - 1;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			int missing = arr[mid] - (mid + 1);
			if (missing < k)
				low = mid + 1;
			else
				high = mid - 1;
		}

		// Both return can be used
		return k + high + 1;
		// return low + k;
	}

	// Step 1: k = 4, low = 0, high = 3, mid = 1, missing = (7 - 2) = 5
	// Step 2: k = 4, low = 0, high = 0, mid = 0, missing = (4 - 1) = 3

	public static void main(String[] args)
	{
		int[] arr = { 4, 7, 9, 10 };
		int n = 4, k = 4;
		int ans = missingK(arr, n, k);
		System.out.println("The missing number is: " + ans);
	}

}
