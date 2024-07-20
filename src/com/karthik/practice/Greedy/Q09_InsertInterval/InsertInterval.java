package com.karthik.practice.Greedy.Q09_InsertInterval;

import java.util.LinkedList;
import java.util.List;

public class InsertInterval
{
	public static int[][] func(int[][] interval, int[] newInterval)
	{
		int n = interval.length;
		List<int[]> result = new LinkedList<>();

		int i = 0;

		while (i < n && interval[i][1] < newInterval[0])
		{
			result.add(interval[i]); 
			i++;
		}

		while (i < n && interval[i][0] <= newInterval[1])
		{
			newInterval[0] = Math.min(newInterval[0], interval[i][0]);
			newInterval[1] = Math.max(newInterval[1], interval[i][1]);
			i++;
		}

		result.add(newInterval);
		
		while (i < n)
		{
			result.add(interval[i]);
			i++;
		}

		return result.toArray(new int[result.size()][]);
	}

	public static void main(String[] args)
	{
		int[][] interval = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
		int[] newInterval = { 2, 5 };

		System.out.println(func(interval, newInterval));
	}

}
