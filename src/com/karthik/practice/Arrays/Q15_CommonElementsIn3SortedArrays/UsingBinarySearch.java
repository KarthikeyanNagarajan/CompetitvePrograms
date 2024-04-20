package com.karthik.practice.Arrays.Q15_CommonElementsIn3SortedArrays;

import java.util.Arrays;

public class UsingBinarySearch
{
	public static void UsingBinarySearchMethod(int arr1[], int arr2[], int arr3[], int n1, int n2, int n3)
	{
		for(int i=0;i<n1;i++)
		{
			if(Arrays.binarySearch(arr2, arr1[i]) >= 0 && Arrays.binarySearch(arr3, arr1[i]) >= 0)
			{
				System.out.print(arr1[i] + " ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		int arr1[] = { 1, 5, 10, 20, 40, 80 };
		int arr2[] = { 6, 7, 20, 80, 100 };
		int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 }; // ans 20 80
		UsingBinarySearchMethod(arr1, arr2, arr3, arr1.length, arr2.length, arr3.length);

	}

}
