package com.karthik.practice.Arrays.Q01_ReverseAnArray;

import java.util.Arrays;

public class UsingTempArray
{
	private static int[] UsingTempArrayMethod(int[] arr, int size)
	{
		int[] arr1 = new int[size];
		for (int i = size - 1, j = 0; i >= 0; i--, j++)
		{
			arr1[j] = arr[i];
		}
		return arr1;
	}

	public static void main(String[] args)
	{
		int[] arr = { 5, 8, 3, 9, 2, 0, 7, 1 };
		arr = UsingTempArrayMethod(arr, arr.length);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

}
