package com.karthik.practice.Arrays.Q53_TwoSum;
//Incorrect
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UsingHashing
{
	public static void UsingHashingMethod(int[] arr, int n, int k)
	{
		int[] result = new int[2];
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++)
		{
			if (mp.containsKey(k - arr[i]))
			{
				result[1] = i;
				result[0] = mp.get(k - arr[i]);
				break;
			}
			mp.put(arr[i], i);
		}
		Arrays.stream(result).forEach(i -> System.out.print(i + " "));
	}

	public static void main(String[] args)
	{
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr = {2,7,11,15};
		int n = arr.length;
		int k = 9;
		UsingHashingMethod(arr, n, k);
	}

}
