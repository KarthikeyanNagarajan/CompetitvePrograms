package com.karthik.practice.BitManipulation.Q13_SingleNumber3;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber3
{
	public static List<Integer> func(int[] arr, int n)
	{
		List<Integer> ans = new ArrayList<>();

		int xor = 0;
		for (int i = 0; i < n; i++)
			xor = xor ^ arr[i]; // contains min of 1 set bit

		int rightMostBitSetTo1 = (xor & (xor - 1)) ^ xor; // get rightmost set bit

		int bucket1 = 0, bucket2 = 0;
		for (int i = 0; i < n; i++)
		{
			if ((arr[i] & rightMostBitSetTo1) != 0)
				bucket1 = bucket1 ^ arr[i];
			else
				bucket2 = bucket2 ^ arr[i];
		}

		ans.add(bucket1);
		ans.add(bucket2);

		return ans;
	}

	public static void main(String[] args)
	{
		int[] arr = { 2, 4, 2, 6, 3, 7, 7, 3 };
		int n = arr.length;
		System.out.println(func(arr, n));
	}

}
