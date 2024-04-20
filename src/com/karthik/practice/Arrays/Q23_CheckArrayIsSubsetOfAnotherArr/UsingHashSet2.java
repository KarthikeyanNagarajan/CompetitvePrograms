package com.karthik.practice.Arrays.Q23_CheckArrayIsSubsetOfAnotherArr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingHashSet2
{
	public static boolean UsingHashSet2Method(int[] arr1, int[] arr2, int len1, int len2)
	{
		Set<Integer> hs1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		Set<Integer> hs2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
		Set<Integer> mergedSet = Stream.of(hs1, hs2).flatMap(x -> x.stream()).collect(Collectors.toSet());
		if (mergedSet.size() == len1)
			return true;
		return false;
	}

	public static void main(String[] args)
	{
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 1, 2, 4 };
		System.out.println(UsingHashSet2Method(arr1, arr2, arr1.length, arr2.length));
	}

}
