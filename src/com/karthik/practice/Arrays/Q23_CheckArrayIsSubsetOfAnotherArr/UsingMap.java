package com.karthik.practice.Arrays.Q23_CheckArrayIsSubsetOfAnotherArr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UsingMap
{
	public static boolean UsingMapMethod(int[] arr1, int[] arr2, int len1, int len2)
	{
		Map<Integer, Long> mp = Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(Function.identity(), HashMap::new,Collectors.counting()));
		long flag = Arrays.stream(arr2).boxed().filter(i -> !mp.containsKey(i)).count();
		if(flag > 0)
			return false;
		else
			return true;
	}
	public static void main(String[] args)
	{
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 1, 2, 4 };
		System.out.println(UsingMapMethod(arr1, arr2, arr1.length, arr2.length));
	}

}
