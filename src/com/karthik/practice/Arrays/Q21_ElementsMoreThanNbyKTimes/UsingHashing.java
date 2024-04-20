package com.karthik.practice.Arrays.Q21_ElementsMoreThanNbyKTimes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UsingHashing
{
	public static boolean UsingHashingMethod(int[] arr, int n, int k)
	{
		int ans = n / k;
		Map<Integer, Integer> mp = new HashMap<>();
		// Old Method
		for (int i = 0; i < n; i++)
		{
			if (mp.containsKey(arr[i]))
			{
				mp.put(arr[i], mp.get(arr[i]) + 1);
			}
			else
			{
				mp.put(arr[i], 1);
			}
		}

		// New Method
		Map<Integer, Long> mp1 = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

		long count = mp1.entrySet().stream().filter(i -> i.getValue() >= ans).count();
		if (count > 0)
			return true;
		return false;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 1, 1, 1, 1, 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9 };
		int k = 4;
		int n = arr.length;
		System.out.println(UsingHashingMethod(arr, n, k));

	}

}
