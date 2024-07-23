package com.karthik.practice.Greedy.Q12_Candy;

public class OptimisedSlopeApproach
{
	public static int func(int[] ratings, int n)
	{
		int sum = 1, i = 1;

		while (i < n)
		{
			if (ratings[i] == ratings[i - 1])
			{
				sum += 1;
				i++;
				continue;
			}

			int peak = 1;
			while (i < n && ratings[i] > ratings[i - 1])
			{
				peak++;
				sum += peak;				
				i++;
			}

			int down = 1;
			while (i < n && ratings[i] < ratings[i - 1])
			{
				sum += down;
				down++;
				i++;
			}

			if (down > peak)
				sum += down - peak;
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
