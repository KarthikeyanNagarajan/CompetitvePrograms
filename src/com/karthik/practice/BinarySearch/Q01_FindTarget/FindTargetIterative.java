package com.karthik.practice.BinarySearch.Q01_FindTarget;

public class FindTargetIterative
{
	
	private static int binarySearch(int[] arr, int target)
	{
		int low = 0, high = arr.length - 1;
		while(low <= high)
		{
			int mid = (low + high) / 2;
			if(target == arr[mid])
				return mid;
			else if(arr[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int[] a = { 3, 4, 6, 7, 9, 12, 16, 17 };
		int target = 6;
		int ind = binarySearch(a, target);
		if (ind == -1)
			System.out.println("The target is not present.");
		else
			System.out.println("The target is at index: " + ind);
	}	

}
