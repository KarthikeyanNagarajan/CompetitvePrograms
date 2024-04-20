package com.karthik.practice.Arrays.Q48_MoveAllZeroToEndOfArr;

import java.util.Arrays;

public class WithExtraSpace
{
	public static void WithExtraSpaceMethod(int[] arr, int n)
	{
		int[] temp = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] != 0)
			{
				temp[k] = arr[i];
				k++;
			}
		}
		Arrays.stream(temp).forEach(i -> System.out.print(i + " "));
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 0, 0, 0, 2, 0, 0, 3, 4, 5 };
		int n = arr.length;
		WithExtraSpaceMethod(arr, n);
	}

}
