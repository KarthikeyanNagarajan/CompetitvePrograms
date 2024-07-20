package com.karthik.practice.Greedy.Q10_MinPlatformInRailwayStation;

import java.util.Arrays;

public class MinPlatformInRailwayStation
{
	public static int func(int[] arrival, int[] departure)
	{
		int n = arrival.length;

		Arrays.sort(arrival);
		Arrays.sort(departure);

		int i = 0, j = 0;
		int cnt = 0, maxCnt = 0;

		while (i < n)
		{
			if (arrival[i] <= departure[j])
			{
				cnt++;
				i++;
			}
			else
			{
				cnt--;
				j++;
			}

			maxCnt = Math.max(maxCnt, cnt);
		}
		return maxCnt;
	}

	public static void main(String[] args)
	{
		int[] arrival = { 900, 945, 955, 1100, 1500, 1800 };
		int[] departure = { 920, 1200, 1130, 1150, 1900, 2000 };

		System.out.println(func(arrival, departure));
	}
}
