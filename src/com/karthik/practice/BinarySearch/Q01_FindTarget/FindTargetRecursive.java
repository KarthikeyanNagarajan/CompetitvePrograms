package com.karthik.practice.BinarySearch.Q01_FindTarget;

public class FindTargetRecursive
{

	private static int binarySearch(int[] arr, int low, int high, int target)
	{
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (arr[mid] == target)
			return mid;
		else if (arr[mid] < target)
			return binarySearch(arr, mid + 1, high, target);
		else
			return binarySearch(arr, low, mid - 1, target);
	}

	public static void main(String[] args)
	{
		int[] a = { 3, 4, 6, 7, 9, 12, 16, 17 };
		int target = 6;
		int ind = binarySearch(a, 0, a.length - 1, target);
		if (ind == -1)
			System.out.println("The target is not present.");
		else
			System.out.println("The target is at index: " + ind);

	}

}
