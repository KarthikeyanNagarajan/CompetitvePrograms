package com.karthik.practice.Arrays.Q37_FirstNonRepeatingElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UsingHashMap
{
	public static void UsingHashMapMethod(int[] arr, int n)
	{
		Map<Integer, Long> mp = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
		mp.entrySet().stream().filter(i -> i.getValue() == 1).forEach(i -> System.out.println(i.getKey()));
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
		UsingHashMapMethod(arr, arr.length);
	}

}
