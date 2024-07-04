package com.karthik.practice.Greedy.Q01_AssignCookies;

import java.util.Arrays;

public class AssignCookies
{
	public static int func(int[] greed, int n, int[] size, int m)
	{
		Arrays.sort(greed);
		Arrays.sort(size);

		int l = 0, r = 0;
		while (l < m && r < n)
		{
			if (greed[r] <= size[l])
				r += 1;
			l += 1;
		}

		return r;
	}

	public static void main(String[] args)
	{
		int n = 2;
		int[] greed = { 1, 2 };

		int m = 3;
		int[] size = { 1, 2, 3 };

		System.out.println(func(greed, n, size, m));
	}

}
