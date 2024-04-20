package com.karthik.practice.DP.Q08_GridUniquePaths1;

public class Recursion
{
	private static int recur(int i, int j)
	{
		if (i == 0 && j == 0)
			return 1;
		if (i < 0 || j < 0)
			return 0;

		int up = recur(i - 1, j);
		int left = recur(i, j - 1);
		return up + left;
	}

	public static void main(String[] args)
	{
		int m = 3;
		int n = 2;
		System.out.println(recur(m - 1, n - 1));
	}

}
