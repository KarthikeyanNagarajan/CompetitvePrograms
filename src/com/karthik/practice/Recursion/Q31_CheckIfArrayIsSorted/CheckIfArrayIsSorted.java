package com.karthik.practice.Recursion.Q31_CheckIfArrayIsSorted;

public class CheckIfArrayIsSorted
{
	public static int arraySortedOrNot(int arr[], int n)
	{
		if (n == 0 || n == 1)
			return 1;
		if (arr[n - 1] < arr[n - 2])
			return 0;

		return arraySortedOrNot(arr, n - 1);
	}

	public static void main(String[] args)
	{
		int arr[] = { 20, 23, 23, 45, 78, 88 };
		int n = arr.length;
		if (arraySortedOrNot(arr, n) != 0) // ans = yes
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
