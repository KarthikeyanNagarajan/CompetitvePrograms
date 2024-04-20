package com.karthik.practice.Arrays.Q01_ReverseAnArray;

public class UsingTempVariable
{
	private static int[] UsingTempVariableMethod(int[] arr, int size)
	{
		for (int i = 0; i < size / 2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[size - i - 1];
			arr[size - i - 1] = temp;
		}
		return arr;
	}

	public static void main(String[] args)
	{
		int[] arr = { 5, 8, 3, 9, 2, 0, 7, 1 };
		arr = UsingTempVariableMethod(arr, arr.length);
		for (int a : arr)
			System.out.print(a + " ");
	}

}
