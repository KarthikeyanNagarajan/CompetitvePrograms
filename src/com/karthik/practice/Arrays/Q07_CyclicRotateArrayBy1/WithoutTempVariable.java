package com.karthik.practice.Arrays.Q07_CyclicRotateArrayBy1;

import java.util.Arrays;

public class WithoutTempVariable
{
	public static void WithoutTempVariableMethod(int[] arr, int len)
	{
		int i = 0, j = len -1;
		while(i != j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 2, 3, 4, 5 };
		int len = arr.length;
		WithoutTempVariableMethod(arr, len);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
	}

}
