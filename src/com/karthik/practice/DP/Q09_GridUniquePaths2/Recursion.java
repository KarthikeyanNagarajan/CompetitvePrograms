package com.karthik.practice.DP.Q09_GridUniquePaths2;

public class Recursion
{
	private static int recur(int i, int j, int[][] maze)
	{
		if (i >= 0 && j >= 0 && maze[i][j] == -1)
			return 0;

		if (i == 0 && j == 0)
			return 1;

		if (i < 0 || j < 0)
			return 0;

		int up = recur(i - 1, j, maze);
		int left = recur(i, j - 1, maze);

		return up + left;
	}

	public static void main(String[] args)
	{
		int[][] maze = { { 0, 0, 0 }, { 0, -1, 0 }, { 0, 0, 0 } };

		int n = maze.length;
		int m = maze[0].length;

		System.out.println(recur(n - 1, m - 1, maze));
	}

}
