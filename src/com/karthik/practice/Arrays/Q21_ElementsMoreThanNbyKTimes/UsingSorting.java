package com.karthik.practice.Arrays.Q21_ElementsMoreThanNbyKTimes;

import java.util.Arrays;

public class UsingSorting
{
	public static boolean UsingSortingMethod(int[] arr, int n, int k)
	{
		int ans = n / k;
		int count = 0;
		Arrays.sort(arr);
		for (int i = 0, j = 0; i < n - 1; i++)
		{
			if (arr[j] == arr[i + 1])
			{
				count++;
			}
			else
			{
				if (count >= ans)
					return true;
				j = i;
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 1, 1, 1, 1, 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9 };
		int k = 7;
		int n = arr.length;
		System.out.println(UsingSortingMethod(arr, n, k));

	}

}
