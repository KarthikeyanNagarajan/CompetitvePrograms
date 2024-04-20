package com.karthik.practice.Arrays.Q23_CheckArrayIsSubsetOfAnotherArr;

import java.util.Arrays;

public class UsingBinarySearch
{
	public static boolean UsingBinarySearchMethod(int[] arr1, int[] arr2, int len1, int len2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int j = 0; j < len2; j++)
		{
			if (Arrays.binarySearch(arr1, arr2[j]) < 0)				
			return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 1, 2, 4 };
		System.out.println(UsingBinarySearchMethod(arr1, arr2, arr1.length, arr2.length));
	}

}
