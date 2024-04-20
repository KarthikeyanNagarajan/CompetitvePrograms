package com.karthik.practice.Arrays.Q47_RotateArrByKElements;

import java.util.Arrays;

public class RotateLeftWithoutExtraSpace
{
	public static void Reverse(int[] arr, int start, int end)
	{
		while (start <= end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void RotateLeftWithoutExtraSpaceMethod(int[] arr, int n, int k)
	{
		Reverse(arr, 0, k - 1);
		Reverse(arr, k, n - 1);
		Reverse(arr, 0, n - 1);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int k = 2;
		RotateLeftWithoutExtraSpaceMethod(arr, n, k);
	}

}
