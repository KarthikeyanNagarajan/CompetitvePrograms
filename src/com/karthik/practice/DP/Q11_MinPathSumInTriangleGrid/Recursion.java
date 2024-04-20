package com.karthik.practice.DP.Q11_MinPathSumInTriangleGrid;

public class Recursion
{
	private static int recur(int i, int j, int[][] triangle, int n)
	{
		if (i == n - 1)
			return triangle[i][j];

		int down = triangle[i][j] + recur(i + 1, j, triangle, n);
		int diagonal = triangle[i][j] + recur(i + 1, j + 1, triangle, n);
		return Math.min(down, diagonal);
	}

	public static void main(String[] args)
	{
		int triangle[][] = { { 1 }, { 2, 3 }, { 3, 6, 7 }, { 8, 9, 6, 10 } };
		int n = triangle.length;

		System.out.println(recur(0, 0, triangle, n));
	}

}
