package com.karthik.practice.Graph.Q46_MostStonesRemovedWithSameRowAndCol;

public class MostStonesRemovedWithSameRowAndCol
{
	int maxRemove(int[][] stones, int n)
	{

	}

	public static void main(String[] args)
	{
		int n = 6;
		int[][] stones = { { 0, 0 }, { 0, 2 }, { 1, 3 }, { 3, 1 }, { 3, 2 }, { 4, 3 } };

		MostStonesRemovedWithSameRowAndCol obj = new MostStonesRemovedWithSameRowAndCol();
		int ans = obj.maxRemove(stones, n);
		System.out.println("The maximum number of stones we can remove is: " + ans);
	}
}
