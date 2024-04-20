package com.karthik.practice.DP.Q12_MinMaxFallingPathSum;

public class Recursion
{
	private static int recur(int i, int j, int m, int[][] matrix)
	{
		if (j < 0 || j >= m)
			return (int) Math.pow(-10, 9);
		if (i == 0)
			return matrix[0][j];

		int up = matrix[i][j] + recur(i - 1, j, m, matrix);
		int leftDiagonal = matrix[i][j] + recur(i - 1, j - 1, m, matrix);
		int rightDiagonal = matrix[i][j] + recur(i - 1, j + 1, m, matrix);
		return Math.max(up, Math.max(leftDiagonal, rightDiagonal));
	}

	public static void main(String[] args)
	{
		int matrix[][] = { { 1, 2, 10, 4 }, { 100, 3, 2, 1 }, { 1, 1, 20, 2 }, { 1, 2, 2, 1 } };
		int n = matrix.length;
		int m = matrix[0].length;

		int maxi = Integer.MIN_VALUE;
		for (int j = 0; j < m; j++)
		{
			int ans = recur(n - 1, j, m, matrix);
			maxi = Math.max(maxi, ans);
		}
		System.out.println(maxi);
	}

}
