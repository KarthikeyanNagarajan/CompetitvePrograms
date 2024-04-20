package com.karthik.practice.Arrays.Q15_CommonElementsIn3SortedArrays;

public class IterationMethod
{
	public static void IterationMethod1(int arr1[], int arr2[], int arr3[], int n1, int n2, int n3)
	{
		int i = 0, j = 0, k = 0;
		int prev1 = 0, prev2 = 0, prev3 = 0;
		while (i < n1 && j < n2 && k < n3)
		{
			while (i < n1 && arr1[i] == prev1)
				i++;
			while (j < n1 && arr2[j] == prev2)
				j++;
			while (k < n1 && arr3[k] == prev3)
				k++;

			if (arr1[i] == arr2[j] && arr2[j] == arr3[k])
			{
				System.out.print(arr1[i] + " ");
				prev1 = arr1[i];
				prev2 = arr2[j];
				prev3 = arr3[k];
				i++;
				j++;
				k++;
			}
			else if (arr1[i] < arr2[j])
			{
				prev1 = arr1[i];
				i++;
			}
			else if (arr2[j] < arr3[k])
			{
				prev2 = arr2[j];
				j++;
			}
			else
			{
				prev3 = arr3[k];
				k++;
			}
		}
	}

	public static void main(String[] args)
	{
		int arr1[] = { 1, 5, 10, 20, 40, 80 };
		int arr2[] = { 6, 7, 20, 80, 100 };
		int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 }; // ans 20 80
		IterationMethod1(arr1, arr2, arr3, arr1.length, arr2.length, arr3.length);
	}

}
