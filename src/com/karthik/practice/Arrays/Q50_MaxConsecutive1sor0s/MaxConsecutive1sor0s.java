package com.karthik.practice.Arrays.Q50_MaxConsecutive1sor0s;

public class MaxConsecutive1sor0s
{
	public static void MaxConsecutive1sor0sMethod(int[] arr, int n)
	{
		int count = 0, result = 0;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] == 0)
				count++;
			else
				count = 0;
			result = Math.max(result, count);
		}
		System.out.println(result);
	}

	public static void main(String[] args)
	{
		int[] arr = { 0, 0, 0, 1, 2, 3, 3, 0, 0, 5, 0, 0, 0, 0, 0 };
		int n = arr.length;
		MaxConsecutive1sor0sMethod(arr, n);
	}

}
