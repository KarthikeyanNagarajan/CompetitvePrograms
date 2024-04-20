package com.karthik.practice.Arrays.Q02_MinAndMaxElement;

public class UsingSlidingWindow
{
	private static int[] UsingSlidingWindowMethod(int[] arr, int n, int min, int max)
	{
		int[] ans = new int[2];
		if (n == 1)
		{
			min = arr[0];
			max = arr[0];
		}
		else if (n == 2)
		{
			if (arr[0] < arr[1])
			{
				min = arr[0];
				max = arr[1];
			}
			else
			{
				min = arr[1];
				max = arr[0];
			}
		}
		else
		{
			int j;
			if ((n & 1) == 1) // Odd if 1
			{
				min = arr[0];
				max = arr[0];
				j = 1;
			}
			else // Even if 0
			{
				j = 2;
				if (arr[0] < arr[1])
				{
					min = arr[0];
					max = arr[1];
				}
				else
				{
					min = arr[1];
					max = arr[0];
				}
			}

			for (int i = j; i < n-1; i+=2)
			{
				if (arr[i] < arr[i + 1])
				{
					if (min > arr[i])
						min = arr[i];
					if (max < arr[i + 1])
						max = arr[i + 1];
				}
				else
				{
					if (min > arr[i + 1])
						min = arr[i + 1];
					if (max < arr[i])
						max = arr[i];
				}
			}
		}
		ans[0] = min;
		ans[1] = max;
		return ans;
	}
	
	public static void main(String[] args)
	{
		int[] arr = { 5, 8, 3, 9, 2, 0, 7, 1 };
		int min = 0, max = 0;
		int[] ans  = UsingSlidingWindowMethod(arr, arr.length, min, max);
		System.out.println("Min Element : " + ans[0]);
		System.out.println("Max Element : " + ans[1]);
	}

}
