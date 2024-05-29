package com.karthik.practice.Arrays.Q12_Merge2SortedArrays;

import java.util.Arrays;

public class GapMethod
{
	public static void swap(int[] arr1, int[] arr2, int i, int j)
	{
		if (arr1[i] > arr2[j])
		{
			int temp = arr1[i];
			arr1[i] = arr2[j];
			arr2[j] = temp;
		}
	}

	public static void UsingGapMethod(int[] arr1, int[] arr2, int n, int m)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int len = n + m;
		int gap = (len / 2) + (len % 2);

		while (gap > 0)
		{
			int left = 0;
			int right = left + gap;

			while (right < len)
			{
				// In both arr
				if (left < n && right >= n)
					swap(arr1, arr2, left, right - n);
				// In arr2
				else if (left >= n)
					swap(arr2, arr2, left - n, right - n);
				// In arr1
				else
					swap(arr1, arr1, left, right);

				left++;
				right++;
			}

			if (gap == 1)
				break;

			gap = (gap / 2) + (gap % 2);
		}

		Arrays.stream(arr1).forEach(l -> System.out.print(l + " "));
		Arrays.stream(arr2).forEach(l -> System.out.print(l + " "));
	}

	public static void main(String[] args)
	{
		int arr1[] = { 5, 3, 7, 9 };
		int arr2[] = { 6, 7, 1, 8 };
		int n = arr1.length;
		int m = arr2.length;
		UsingGapMethod(arr1, arr2, n, m);

	}

}
