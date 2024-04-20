package com.karthik.practice.Arrays.Q02_MinAndMaxElement;

public class UsingLinearSearch
{
	public static void main(String[] args)
	{
		int[] arr = { 5, 8, 3, 9, 2, 0, 7, 1 };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++)
		{
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Min Element : " + min);
		System.out.println("Max Element : " + max);
	}

}
