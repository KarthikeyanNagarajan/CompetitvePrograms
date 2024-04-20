package com.karthik.practice.Arrays.Q14_CountPairsEqualToSum;

import java.util.HashMap;
import java.util.Map;

public class UsingSingleLoopHashing
{
	public static int UsingSingleLoopHashingMethod(int[] arr, int n, int sum)
	{
		Map<Integer, Integer> mp = new HashMap<>();
		int count = 0;
		for (int i = 0; i < n; i++)
		{
			if (mp.containsKey(sum - arr[i]))
			{
				count += mp.get(sum - arr[i]);
			}
			if (mp.containsKey(arr[i]))
			{
				mp.put(arr[i], mp.get(arr[i]) + 1);
			}
			else
			{
				mp.put(arr[i], 1);
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4 }; // ans = 2
		int sum = 5;
		int n = arr.length;
		System.out.println(UsingSingleLoopHashingMethod(arr, n, sum));

	}

}
