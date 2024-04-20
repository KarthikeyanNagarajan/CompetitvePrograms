package com.karthik.practice.Arrays.Q05_MoveNegativeElement;

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
		int[] arr = { -1, 2, 0, 3, 7, -2, 1, -1, 5 };
		List<Integer> ans = UsingSortingMethod(arr);
		System.out.println("Sorted Elements : " + ans);
	}

}
