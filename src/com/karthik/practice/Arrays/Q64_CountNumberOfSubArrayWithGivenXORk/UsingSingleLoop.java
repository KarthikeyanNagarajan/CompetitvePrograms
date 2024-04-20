package com.karthik.practice.Arrays.Q64_CountNumberOfSubArrayWithGivenXORk;

public class UsingSingleLoop
{
	public static void UsingSingleLoopMethod(int[] arr, int n, int k)
	{
		int c = 0;
		for (int i = 0; i < n; i++)
		{
			int current_xor = 0;
			for (int j = i; j < n; j++)
			{
				current_xor ^= arr[j];
				if (current_xor == k)
					c++;
			}
		}
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, -1, 2, 3, -3, -2 };
		int n = arr.length;
		int k = 5;
		UsingSingleLoopMethod(arr, n, k);
	}

}
