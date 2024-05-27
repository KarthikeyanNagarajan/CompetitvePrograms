package com.karthik.practice.Arrays.Q08_LargestSumContigousSubArray;

public class Using2Loops
{
	public static int Using2LoopsMethod(int[] arr, int len)
	{
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < len; i++)
		{
			sum = 0;
			for (int j = i; j < len; j++)
			{
				sum += arr[j];
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
		System.out.println(Using2LoopsMethod(arr, len));

	}

}
