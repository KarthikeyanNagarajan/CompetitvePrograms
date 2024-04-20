package com.karthik.practice.Arrays.Q12_Merge2SortedArrays;

import java.util.Arrays;

public class WithExtraSpaceSorted
{
	public static void UsingMethod2(int[] arr1, int[] arr2, int n1, int n2)
	{
		int[] arr3 = new int[n1 + n2];
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2)
		{
			if (arr1[i] <= arr2[j])
			{
				arr3[k++] = arr1[i++];
			}
			else if (arr1[i] > arr2[j])
			{
				arr3[k++] = arr2[j++];
			}
		}
		while (i < n1)
		{
			arr3[k++] = arr1[i++];
		}
		while (j < n2)
		{
			arr3[k++] = arr2[j++];
		}
		Arrays.stream(arr3).forEach(l -> System.out.print(l + " "));
	}

	public static void main(String[] args)
	{
		int arr1[] = { 5, 3, 7, 9 };
		int arr2[] = { 6, 7, 1, 8 };
		int n1 = arr1.length;
		int n2 = arr2.length;
		UsingMethod2(arr1, arr2, n1, n2);

	}

}
