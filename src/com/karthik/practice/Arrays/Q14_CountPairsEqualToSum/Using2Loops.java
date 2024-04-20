package com.karthik.practice.Arrays.Q14_CountPairsEqualToSum;

public class Using2Loops
{
	public static void Using2LoopsMethod(int[] arr, int n, int sum)
	{
		int count = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (arr[i] + arr[j] == sum)
					count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4 }; // ans = 2
		int sum = 5;
		int n = arr.length;
		Using2LoopsMethod(arr, n, sum);
	}

}
