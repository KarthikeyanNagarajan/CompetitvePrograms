package com.karthik.practice.Arrays.Q21_ElementsMoreThanNbyKTimes;

public class Using2Loops
{
	public static boolean Using2LoopsMethod(int[] arr, int n, int k)
	{
		int ans = n / k;
		int count = 0;
		for (int i = 0; i < n; i++)
		{
			count = 0;
			for (int j = i; j < n; j++)
			{
				if (arr[i] == arr[j])
					count++;
			}
			if (count >= ans)
				return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 1, 1, 1, 1, 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9 };
		int k = 4;
		int n = arr.length;
		System.out.println(Using2LoopsMethod(arr, n, k));

	}

}
