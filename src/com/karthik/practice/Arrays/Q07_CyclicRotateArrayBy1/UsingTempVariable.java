package com.karthik.practice.Arrays.Q07_CyclicRotateArrayBy1;

import java.util.Arrays;

public class UsingTempVariable
{
	public static void UsingTempVariableMethod(int[] arr, int len)
	{
		int temp = arr[len - 1];
		for (int i = len - 1; i > 0; i--)
		{
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
	}

	public static void main(String[] args)
	{
		int[] arr = { 2, 3, 4, 5 };
		int len = arr.length;
		UsingTempVariableMethod(arr, len);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}
}
