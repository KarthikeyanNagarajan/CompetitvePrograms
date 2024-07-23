package com.karthik.practice.Greedy.Q12_Candy;

public class BruteMethod
{
	public static int func(int[] ratings, int n)
	{
		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = 1;
		right[n - 1] = 1;

		for (int i = 1; i < n; i++)
		{
			if (ratings[i] > ratings[i - 1])
				left[i] = left[i - 1] + 1;
			else
				left[i] = 1;
		}

		for (int i = n - 2; i >= 0; i--)
		{
			if (ratings[i] > ratings[i + 1])
				right[i] = right[i + 1] + 1;
			else
				right[i] = 1;
		}

		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum = sum + Math.max(left[i], right[i]);
		}

		return sum;
	}

	public static void main(String[] args)
	{
		int[] ratings = { 0, 2, 4, 3, 2, 1, 1, 3, 5, 6, 4, 0, 0 };
		int n = ratings.length;

		System.out.println(func(ratings, n));
	}

}
