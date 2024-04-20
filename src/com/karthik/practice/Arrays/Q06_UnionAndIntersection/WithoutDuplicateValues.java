package com.karthik.practice.Arrays.Q06_UnionAndIntersection;

public class WithoutDuplicateValues
{
	public static void findUnion(int[] arr1, int[] arr2, int len1, int len2)
	{
		int i = 0, j = 0;
		while (i < len1 && j < len2)
		{
			if(arr1[i] < arr2[j])
			{
				System.out.print(arr1[i] + " ");
				i++;
			}
			else if(arr1[i] > arr2[j])
			{
				System.out.print(arr2[j] + " ");
				j++;
			}
			else
			{
				System.out.print(arr2[j] + " ");
				i++;
				j++;
			}
		}
		while(i< len1)
		{
			System.out.print(arr1[i] + " ");
			i++;
		}
		while(j< len2)
		{
			System.out.print(arr2[j] + " ");
			j++;
		}
	}

	public static void findIntersection(int[] arr1, int[] arr2, int len1, int len2)
	{
		int i = 0, j = 0;
		while (i < len1 && j < len2)
		{
			if(arr1[i] < arr2[j])
			{
				i++;
			}
			else if(arr1[i] > arr2[j])
			{
				j++;
			}
			else
			{
				System.out.print(arr2[j] + " ");
				i++;
				j++;
			}
		}
	}

	public static void main(String[] args)
	{
		int[] arr1 = { 2, 3, 4, 5 };
		int[] arr2 = { 2, 4, 8, 9 };
		int len1 = arr1.length;
		int len2 = arr2.length;
		findUnion(arr1, arr2, len1, len2);
		System.out.println();
		findIntersection(arr1, arr2, len1, len2);

	}

}
