package com.karthik.practice.BinarySearch.Q21_BookAllocationProblem;

public class BookAllocationProblem
{

	public static int countStudents(int[] arr, int pages, int n)
	{
		int students = 1;
		int pagesStudents = 0;
		for (int i = 0; i < n; i++)
		{
			if (pagesStudents + arr[i] > pages)
			{
				students += 1;
				pagesStudents = arr[i];
			}
			else
				pagesStudents += arr[i];
		}
		return students;
	}

	private static int findPages(int[] arr, int d)
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
			int students = countStudents(arr, mid, n);
			if (students <= d)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args)
	{
		int[] arr = { 25, 46, 28, 49, 24 };
		int d = 4;
		int ans = findPages(arr, d);
		System.out.println("The minimum capacity should be: " + ans);
	}

}
