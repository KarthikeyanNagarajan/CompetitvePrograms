package com.karthik.practice.Arrays.Q12_Merge2SortedArrays;

import java.util.Arrays;

public class GapMethod
{
	public static int NextGap(int n)
	{
		if (n <= 1)
			return 0;
		return (n / 2) + (n % 2);
		// Math.ceil(n/2);
	}

	public static void UsingGapMethod(int[] arr1, int[] arr2, int n1, int n2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int gap = n1 + n2;
		int i = 0, j = 0;
		for (gap = NextGap(gap); gap > 0; gap = NextGap(gap))
		{
			for (i = 0; i + gap < n1; i++)
			{
				if (arr1[i] > arr1[i + gap])
				{
					int temp = arr1[i + gap];
					arr1[i + gap] = arr1[i];
					arr1[i] = temp;
				}
			}
			for (j = gap > n1 ? gap : 0; i < n1 && j < n2; i++, j++)
			{
				if (arr1[i] > arr2[j])
				{
					int temp = arr2[j];
					arr2[j] = arr1[i];
					arr1[i] = temp;
				}
			}
			if (j < n2)
			{
				for (j = 0; j + gap < n2; j++)
				{
					if (arr2[j] > arr2[j + gap])
					{
						int temp = arr2[j + gap];
						arr2[j + gap] = arr2[j];
						arr2[j] = temp;
					}
				}
			}
		}

		Arrays.stream(arr1).forEach(l -> System.out.print(l + " "));
		Arrays.stream(arr2).forEach(l -> System.out.print(l + " "));
	}

	public static void main(String[] args)
	{
		int arr1[] = { 5, 3, 7, 9 };
		int arr2[] = { 6, 7, 1, 8 };
		int n1 = arr1.length;
		int n2 = arr2.length;
		UsingGapMethod(arr1, arr2, n1, n2);

	}

}
