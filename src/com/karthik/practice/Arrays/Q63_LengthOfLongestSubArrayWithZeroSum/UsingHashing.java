package com.karthik.practice.Arrays.Q63_LengthOfLongestSubArrayWithZeroSum;

import java.util.HashMap;
import java.util.Map;

public class UsingHashing
{
	public static void UsingHashingMethod(int[] arr, int n)
	{
		Map<Integer, Integer> mp = new HashMap<>();
		int max = 0, sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum += arr[i];
			if (sum == 0)
				max = i + 1;
			else
			{
				if (mp.get(sum) != null)
					max = Math.max(max, i - mp.get(sum));
				else
					mp.put(sum, i);
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, -1, 2, 3, -3, -2 };
		int n = arr.length;
		UsingHashingMethod(arr, n);
	}

}
