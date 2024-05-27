package com.karthik.practice.Arrays.Q08_LargestSumContigousSubArray;

public class UsingKadaneAlgo
{
	public static int UsingKadaneAlgoMethod(int[] arr, int len)
	{
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < len; i++)
		{
			sum += arr[i];
			max = Math.max(max, sum);
			if (sum < 0)
				sum = 0;
		}
		return max;
	}

	public static void main(String[] args)
	{
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 }; // ans = 7
//		 int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // ans = 6
		int len = arr.length;
		System.out.println(UsingKadaneAlgoMethod(arr, len));
	}

}
