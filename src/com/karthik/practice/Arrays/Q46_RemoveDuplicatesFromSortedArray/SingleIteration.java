package com.karthik.practice.Arrays.Q46_RemoveDuplicatesFromSortedArray;

public class SingleIteration
{
	public static void SingleIterationMethod(int[] arr, int n)
	{
		int i = 0;
		for (int j = 1; j < n; j++)
		{
			if (arr[i] != arr[j])
			{
				i++;
				arr[i] = arr[j];
			}
		}
		for (int k = 0; k < i + 1; k++)
		{
			System.out.print(arr[k]);
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 6 };
		SingleIterationMethod(arr, arr.length);
	}

}
