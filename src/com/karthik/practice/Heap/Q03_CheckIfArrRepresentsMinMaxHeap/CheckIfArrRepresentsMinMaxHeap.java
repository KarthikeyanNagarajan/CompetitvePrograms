package com.karthik.practice.Heap.Q03_CheckIfArrRepresentsMinMaxHeap;

public class CheckIfArrRepresentsMinMaxHeap
{
	public static boolean isMaxHeap(int arr[], int i, int n)
	{
		if (i >= (n - 1) / 2)
		{
			return true;
		}

		if (arr[i] >= arr[2 * i + 1] && arr[i] >= arr[2 * i + 2] && isMaxHeap(arr, 2 * i + 1, n)
				&& isMaxHeap(arr, 2 * i + 2, n))
		{
			return true;
		}

		return false;
	}

	public static boolean isMinHeap(int[] arr, int i, int n)
	{
		if (2 * i + 2 >= n)
		{
			return true;
		}

		if (arr[i] <= arr[2 * i + 1] && arr[i] <= arr[2 * i + 2] && isMinHeap(arr, 2 * i + 1, n)
				&& isMinHeap(arr, 2 * i + 2, n))
		{
			return true;
		}

		return false;
	}

	public static void main(String[] args)
	{
		int max[] = { 90, 15, 10, 7, 12, 2, 7, 3 };
		int maxIndex = max.length - 1;
		if (isMaxHeap(max, 0, maxIndex))
			System.out.println("The given max array is a max-heap");
		else
			System.out.println("The given min array is not a max-heap");

		int[] min = { 1, 2, 3, 4, 5, 6 };
		int minIndex = min.length;
		if (isMinHeap(min, 0, minIndex))
			System.out.println("The given min array is a min-heap");
		else
			System.out.println("The given min array is not a min-heap");
	}
}
