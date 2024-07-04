package com.karthik.practice.Greedy.Q05_JumpGame2;

public class Optimised
{
	public static int func(int[] arr, int n)
	{
		int jumps = 0, l = 0, r = 0;
		while (r < n - 1)
		{
			int farthest = 0;

			for (int i = l; i <= r; i++)
				farthest = Math.max(farthest, i + arr[i]);

			l = r + 1;
			r = farthest;
			jumps = jumps + 1;
		}
		return jumps;
	}

	public static void main(String[] args)
	{
		int[] arr = { 2, 3, 1, 1, 4 };
		int n = arr.length;
		System.out.println(func(arr, n) + " Jumps to reach end");
	}

}
