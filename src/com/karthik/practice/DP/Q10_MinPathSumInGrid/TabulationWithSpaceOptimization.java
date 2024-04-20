package com.karthik.practice.DP.Q10_MinPathSumInGrid;

public class TabulationWithSpaceOptimization
{

	static int recur(int n, int m, int[][] matrix)
	{
		int prev[] = new int[m];
		for (int i = 0; i < n; i++)
		{
			int temp[] = new int[m];
			
			for (int j = 0; j < m; j++)
			{
				if (i == 0 && j == 0)
				{
					temp[j] = matrix[i][j];
				}
				else
				{
					int up = matrix[i][j];
					int left = matrix[i][j];

					if (i > 0)
						up += prev[j];
					else
						up += (int) 1e9;

					if (j > 0)
						left += temp[j - 1];
					else
						left += (int) 1e9;

					temp[j] = Math.min(up, left);
				}
			}
			prev = temp;
		}
		return prev[m - 1];
	}

	public static void main(String[] args)
	{
		int matrix[][] = { { 5, 9, 6 }, { 11, 5, 2 } };

		int n = matrix.length;
		int m = matrix[0].length;

		System.out.println(recur(n, m, matrix));
	}

}
