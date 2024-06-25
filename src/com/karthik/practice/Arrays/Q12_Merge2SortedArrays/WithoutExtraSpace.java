package com.karthik.practice.Arrays.Q12_Merge2SortedArrays;

import java.util.Arrays;

public class WithoutExtraSpace
{
	public static void WithConstantSpaceMethod(int[] arr1, int[] arr2, int n1, int n2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0, j = 0;
		while (i < n1 && j < n2)
		{
			if(arr1[i] > arr2[j])
			{
				int temp = arr2[j];
				arr2[j] = arr1[i];
				arr1[i] = temp;
				i++;
			}
			else if(arr1[i] < arr2[j])
				i++;
			Arrays.sort(arr2);
		}
		Arrays.stream(arr1).forEach(l -> System.out.print(l + " "));
		Arrays.stream(arr2).forEach(l -> System.out.print(l + " "));
	}

	public static void main(String[] args)
	{
		int arr1[] = { 5, 1, 7, 9 }; 
		int arr2[] = { 6, 7, 3, 8 }; 
		int n1 = arr1.length;
		int n2 = arr2.length;
		WithConstantSpaceMethod(arr1, arr2, n1, n2);
	}

}
