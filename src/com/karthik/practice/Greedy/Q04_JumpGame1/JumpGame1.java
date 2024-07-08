package com.karthik.practice.Greedy.Q04_JumpGame1;

public class JumpGame1
{
	public static boolean func(int[] arr, int n)
	{
		int maxInd = 0;
		for (int i = 0; i < n; i++)
		{
			if (i > maxInd)
				return false;
			maxInd = Math.max(maxInd, i + arr[i]);
		}
		return true;
	}

	public static void main(String[] args)
	{
		int[] arr = { 2, 3, 1, 1, 4 };
		int n = 5;
		System.out.println("Is Jump is possible ? --> " + func(arr, n));
	}

}
