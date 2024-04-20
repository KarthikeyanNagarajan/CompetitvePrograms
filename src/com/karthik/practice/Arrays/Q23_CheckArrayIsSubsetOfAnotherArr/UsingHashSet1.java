package com.karthik.practice.Arrays.Q23_CheckArrayIsSubsetOfAnotherArr;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class UsingHashSet1
{
	public static boolean UsingHashSet1Method(int[] arr1, int[] arr2, int len1, int len2)
	{
		Set<Integer> hs = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		Set<Integer> hs1 = Arrays.stream(arr2).boxed().filter(i -> hs.contains(i)).collect(Collectors.toSet());
		if(hs1.size() == len2)
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 1, 2, 4 };
		System.out.println(UsingHashSet1Method(arr1, arr2, arr1.length, arr2.length));
	}

}
