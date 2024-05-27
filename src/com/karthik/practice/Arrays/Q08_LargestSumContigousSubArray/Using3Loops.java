package com.karthik.practice.Arrays.Q08_LargestSumContigousSubArray;

public class Using3Loops
{
	public static int Using3LoopsMethod(int[] arr, int len)
	{
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < len; i++)
		{
			for (int j = i; j < len; j++)
			{
				sum = 0;
				for (int k = i; k < j; k++)
				{
					sum += arr[k];
				}
				max = Math.max(max, sum);
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 }; // ans = 7
//		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // ans = 6
		int len = arr.length;
		System.out.println(Using3LoopsMethod(arr, len));
	}

}
