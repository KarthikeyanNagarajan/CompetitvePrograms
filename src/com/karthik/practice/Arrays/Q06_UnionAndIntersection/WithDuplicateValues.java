package com.karthik.practice.Arrays.Q06_UnionAndIntersection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class WithDuplicateValues
{

	public static void main(String[] args)
	{
		int[] arr1 = { 2, 3, 4, 5 };
		int[] arr2 = { 2, 2, 4, 9 };		
		Set<Integer> st1 = new TreeSet<>();
		st1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		Set<Integer> st2 = new TreeSet<>();
		st2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
		Integer[] arr3 = st1.toArray(new Integer[0]);
		Integer[] arr4 = st2.toArray(new Integer[0]);		
		arr1  = Arrays.stream(arr3).mapToInt(Integer::intValue).toArray();
		arr2  = Arrays.stream(arr4).mapToInt(Integer::intValue).toArray();
		int len1 = arr1.length;
		int len2 = arr2.length;
		WithoutDuplicateValues.findUnion(arr1, arr2, len1, len2);
		System.out.println();
		WithoutDuplicateValues.findIntersection(arr1, arr2, len1, len2);
	}

}
