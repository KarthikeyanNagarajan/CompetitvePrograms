package com.karthik.practice.Arrays.Q33_PeakElement;

public class LinearSearch
{
	public static void LinearSearchMethod(int[] arr, int n)
	{
		for (int i = 1; i < n - 1; i++)
		{
			if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 3, 2 }; // ans = 3
		LinearSearchMethod(arr, arr.length);
	}

}
