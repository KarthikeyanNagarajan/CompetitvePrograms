package com.karthik.practice.Greedy.Q05_JumpGame2;

public class UsingRecursion
{
	public static int func(int[] arr, int n, int ind, int jump)
	{
		if (ind >= n - 1)
			return jump;

		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= arr[ind]; i++)
			min = Math.min(min, func(arr, n, ind + i, jump + 1));

		return min;
	}

	public static void main(String[] args)
	{
		int[] arr = { 2, 3, 1, 1, 4 };
		int n = arr.length;
		System.out.println(func(arr, n, 0, 0) + " Jumps to reach end");
	}

}
