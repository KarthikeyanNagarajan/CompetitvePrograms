package com.karthik.practice.DP.Q10_MinPathSumInGrid;

public class Recursion
{
	private static int recur(int i, int j, int[][] matrix)
	{
		if (i == 0 && j == 0)
			return matrix[0][0];
		if (i < 0 || j < 0)
			return (int) 1e9;

		int up = matrix[i][j] + recur(i - 1, j, matrix);
		int left = matrix[i][j] + recur(i, j - 1, matrix);
		return Math.min(up, left);
	}

	public static void main(String[] args)
	{
		int matrix[][] = { { 5, 9, 6 }, { 11, 5, 2 } };

		int n = matrix.length;
		int m = matrix[0].length;

		System.out.println(recur(n - 1, m - 1, matrix));
	}

}
