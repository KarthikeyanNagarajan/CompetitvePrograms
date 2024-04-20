package com.karthik.practice.Arrays.Q24_TripletSumInArrayOfGivenSum;

public class Using3Loops
{
	public static void Using3LoopsMethod(int[] arr, int sum, int n)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				for (int k = j + 1; k < n; k++)
				{
					if (arr[i] + arr[j] + arr[k] == sum)
						System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 12, 3, 4, 1, 6, 9 }; // ans = 12,3,9
		int sum = 24;
		Using3LoopsMethod(arr, sum, arr.length);
	}

}
