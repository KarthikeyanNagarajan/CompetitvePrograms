package com.karthik.practice.Arrays.Q47_RotateArrByKElements;

import java.util.Arrays;

public class RotateRightWithExtraSpace
{
	public static void RotateRightWithExtraSpaceMethod(int[] arr, int n, int k)
	{
		if (n == 0)
			return;
		k = k % n;
		if (k > n)
			return;
		int[] temp = new int[k];
		for (int i = n - k; i < n; i++)
		{
			temp[i - n + k] = arr[i];
		}
		for (int i = n - k - 1; i >= 0; i--)
		{
			arr[i + k] = arr[i];
		}
		for (int i = 0; i < k; i++)
		{
			arr[i] = temp[i];
		}
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int k = 2;
		RotateRightWithExtraSpaceMethod(arr, n, k);
	}

}
