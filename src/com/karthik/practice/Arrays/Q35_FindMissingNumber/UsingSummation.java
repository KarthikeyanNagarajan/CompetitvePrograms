package com.karthik.practice.Arrays.Q35_FindMissingNumber;

public class UsingSummation
{
	public static void UsingSummationMethod(int[] arr, int n)
	{
		int sum = n + 1;
		int total = sum * (sum + 1) / 2;
		for (int i = 0; i < n; i++)
		{
			total -= arr[i];
		}
		System.out.println(total);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
		UsingSummationMethod(arr, arr.length);
	}

}
