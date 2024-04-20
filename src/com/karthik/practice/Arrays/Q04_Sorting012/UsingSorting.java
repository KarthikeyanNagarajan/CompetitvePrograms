package com.karthik.practice.Arrays.Q04_Sorting012;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UsingSorting
{
	private static List<Integer> UsingSortingMethod(int[] arr)
	{
		List<Integer> ls = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(ls);
		return ls;
	}

	public static void main(String[] args)
	{
		int[] arr = { 0, 2, 0, 1, 0, 2, 1, 1, 0 };
		List<Integer> ans = UsingSortingMethod(arr);
		System.out.println("Sorted Elements : " + ans);
	}

}
