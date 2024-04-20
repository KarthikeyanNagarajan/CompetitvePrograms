package com.karthik.practice.Arrays.Q01_ReverseAnArray;

public class UsingStartAndEndIndex
{
	private static int[] UsingStartAndEndIndexMethod(int[] arr, int size)
	{
		int start = 0, end = size - 1;
		while (start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	public static void main(String[] args)
	{
		int[] arr = { 5, 8, 3, 9, 2, 0, 7, 1 };
		arr = UsingStartAndEndIndexMethod(arr, arr.length);
		for (int a : arr)
		{
			System.out.print(a + " ");
		}
	}

}
