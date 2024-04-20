package com.karthik.practice.DP.Q07_NinjaTraining;

public class Recursion
{

	private static int f(int day, int last, int[][] points)
	{
		if (day == 0)
		{
			int maxi = 0;
			for (int i = 0; i <= 2; i++)
			{
				if (i != last)
					maxi = Math.max(maxi, points[0][i]);
			}
			return maxi;
		}

		int maxi = 0;
		for (int i = 0; i <= 2; i++)
		{
			if (i != last)
			{
				int activity = points[day][i] + f(day - 1, i, points);
				maxi = Math.max(maxi, activity);
			}
		}
		return maxi;
	}

	public static void main(String[] args)
	{
		int[][] points = { { 10, 40, 70 }, { 20, 50, 80 }, { 30, 60, 90 } };
		int n = points.length;
		System.out.println(f(n - 1, 3, points));
	}

}
