package com.karthik.practice.Arrays.Q23_CheckArrayIsSubsetOfAnotherArr;

public class Using2Loops
{
	public static boolean Using2LoopsMethod(int[] arr1, int[] arr2, int len1, int len2)
	{
		int i = 0, j = 0;
		for (j = 0; j < len2; j++)
		{
			for (i = j; i < len1; i++)
			{
				if (arr1[i] == arr2[j])
					break;				
			}
			if (i == len1)
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 1, 2, 4 };
		System.out.println(Using2LoopsMethod(arr1, arr2, arr1.length, arr2.length));
	}

}
