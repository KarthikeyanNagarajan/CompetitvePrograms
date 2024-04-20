package com.karthik.practice.Arrays.Q46_RemoveDuplicatesFromSortedArray;

import java.util.HashSet;
import java.util.Set;

public class UsingHashSet
{
	public static void UsingHashSetMethod(int[] arr, int n)
	{
		Set<Integer> hs = new HashSet<>();
		for (int i = 0; i < n; i++)
		{
			hs.add(arr[i]);
		}		
		hs.stream().forEach(i -> System.out.print(i));	
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 6 };
		UsingHashSetMethod(arr, arr.length);
	}

}
