package com.karthik.practice.Arrays.Q47_RotateArrByKElements;

import java.util.Arrays;

public class RotateRightWithoutExtraSpace
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

	public static void RotateRightWithoutExtraSpaceMethod(int[] arr, int n, int k)
	{
		Reverse(arr, 0, n-k-1);
		Reverse(arr, n-k, n-1);
		Reverse(arr, 0, n-1);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int k = 2;
		RotateRightWithoutExtraSpaceMethod(arr, n, k);
	}

}
