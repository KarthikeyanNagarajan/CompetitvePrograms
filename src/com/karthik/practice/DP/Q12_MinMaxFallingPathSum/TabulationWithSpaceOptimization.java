package com.karthik.practice.DP.Q12_MinMaxFallingPathSum;

public class TabulationWithSpaceOptimization
{

	static int recur(int n, int m, int[][] matrix)
	{
		int[] prev = new int[n];
		int[] cur = new int[n];

		for (int j = 0; j < m; j++)
			prev[j] = matrix[0][j];

		for (int i = 1; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				int up = matrix[i][j] + prev[j];

				int leftDiagonal = matrix[i][j];
				if (j - 1 >= 0)
				{
					leftDiagonal += prev[j - 1];
				}
				else
				{
					leftDiagonal += (int) Math.pow(-10, 9);
				}

				int rightDiagonal = matrix[i][j];
				if (j + 1 < m)
				{
					rightDiagonal += prev[j + 1];
				}
				else
				{
					rightDiagonal += (int) Math.pow(-10, 9);
				}

				cur[j] = Math.max(up, Math.max(leftDiagonal, rightDiagonal));
			}
			prev = cur;
		}

		int maxi = Integer.MIN_VALUE;
		for (int j = 0; j < m; j++)
		{
			maxi = Math.max(maxi, prev[j]);
		}

		return maxi;
	}

	public static void main(String[] args)
	{
		int matrix[][] = { { 1, 2, 10, 4 }, { 100, 3, 2, 1 }, { 1, 1, 20, 2 }, { 1, 2, 2, 1 } };
		int n = matrix.length;
		int m = matrix[0].length;

		System.out.println(recur(n, m, matrix));
	}

}
