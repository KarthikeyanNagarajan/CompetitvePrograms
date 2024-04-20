package com.karthik.practice.Arrays.Q12_Merge2SortedArrays;

import java.util.Arrays;

public class WithExtraSpaceUnsorted
{
	public static void UsingMethod1(int[] arr1, int[] arr2, int n1, int n2)
	{
		int[] arr3 = new int[n1 + n2];
		int i = 0;
		for (int a : arr1)
		{
			arr3[i++] = a;
		}
		for (int a : arr2)
		{
			arr3[i++] = a;
		}
		Arrays.sort(arr3);
		Arrays.stream(arr3).forEach(j -> System.out.print(j + " "));
	}

	public static void main(String[] args)
	{
		int arr1[] = { 5, 3, 7, 9 };
		int arr2[] = { 6, 7, 1, 8 };
		int n1 = arr1.length;
		int n2 = arr2.length;
		UsingMethod1(arr1, arr2, n1, n2);
	}

}
