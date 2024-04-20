package com.karthik.practice.Arrays.Q13_MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithConstantSpace
{

	public static int[][] merge(int[][] intervals)
	{
		List<int[]> ans = new ArrayList<>();

		Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

		for (int[] interval : intervals)
			if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0])
				ans.add(interval);
			else
				ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);

		return ans.toArray(new int[ans.size()][2]);
	}

	public static void main(String[] args)
	{
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] merged = merge(intervals);
		for (int i = 0; i < merged.length; i++)
		{
			for (int j = 0; j < merged[i].length; j++)
			{
				System.out.print(merged[i][j] + " ");
			}
			System.out.println();
		}
	}

}
