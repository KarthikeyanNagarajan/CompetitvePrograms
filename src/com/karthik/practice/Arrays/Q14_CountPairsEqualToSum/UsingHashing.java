package com.karthik.practice.Arrays.Q14_CountPairsEqualToSum;

import java.util.HashMap;
import java.util.Map;

public class UsingHashing
{
	public static int UsingHashingMethod(int[] arr, int n, int sum)
	{
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++)
		{
			if (!mp.containsKey(arr[i]))
				mp.put(arr[i], 0);

			mp.put(arr[i], mp.get(arr[i]) + 1);
		}

		int twice_count = 0, x=0;
		for (int i = 0; i < n; i++)
		{
			x = sum - arr[i];
			if (mp.get(x) != null)
				twice_count += mp.get(x);

			if (x == arr[i])
				twice_count--;
		}
		return twice_count / 2;

		// mp.entrySet().stream().filter(i -> i.getValue() == sum).forEach(i ->
		// System.out.println(i.getKey()));
	}

	public static void main(String[] args)
	{
		 int arr[] = { 1, 2, 3, 4 }; // ans = 2
		int sum = 5;
		int n = arr.length;
		System.out.println(UsingHashingMethod(arr, n, sum));
	}

}
