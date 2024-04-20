package com.karthik.practice.Arrays.Q23_CheckArrayIsSubsetOfAnotherArr;

import java.util.Arrays;

public class UsingTwoPointer
{
	public static boolean UsingTwoPointerMethod(int[] arr1, int[] arr2, int len1, int len2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0, j = 0;
		while (i < len1 && j < len2)
		{
			if (arr1[i] < arr2[j])
			{
				i++;
			}
			else if (arr1[i] == arr2[j])
			{
				j++;
				i++;
			}
			else if (arr1[i] > arr2[j])
				return false;
		}
		if (j < len2)
			return false;
		else
			return true;
	}

	public static void main(String[] args)
	{
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 1, 2, 4 };
		System.out.println(UsingTwoPointerMethod(arr1, arr2, arr1.length, arr2.length));
	}

}
