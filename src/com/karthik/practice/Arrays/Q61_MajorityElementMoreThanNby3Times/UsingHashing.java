package com.karthik.practice.Arrays.Q61_MajorityElementMoreThanNby3Times;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UsingHashing
{
	public static void UsingHashingMethod(int[] arr, int n)
	{
		int length = arr.length;
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++)
		{
			if (mp.containsKey(arr[i]))
				mp.put(arr[i], mp.get(arr[i]) + 1);
			else
				mp.put(arr[i], 1);
		}
		for (Entry<Integer, Integer> a : mp.entrySet())
		{
			if(a.getValue() > n/3)
				System.out.println(a.getKey());
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 6 };
		int n = arr.length;
		UsingHashingMethod(arr, n);
	}

}
