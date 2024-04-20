package com.karthik.practice.Graph.Q05_FloodFill;

public class FloodFill
{

	private void dfs(int row, int col, int[][] ans, int[][] image, int newColor, int delRow[], int delCol[],
			int iniColor)
	{
		ans[row][col] = newColor;
		int n = image.length;
		int m = image[0].length;

		for (int i = 0; i < 4; i++)
		{
			int nrow = row + delRow[i];
			int ncol = col + delCol[i];

			if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == iniColor
					&& ans[nrow][ncol] != newColor)
			{
				dfs(nrow, ncol, ans, image, newColor, delRow, delCol, iniColor);
			}
		}
	}

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
	{
		int iniColour = image[sr][sc];
		int[][] ans = image;

		int[] delrow = { 0, 0, 1, -1 };
		int[] delcol = { 1, -1, 0, 0 };
		dfs(sr, sc, ans, image, newColor, delrow, delcol, iniColour);
		return ans;
	}

	public static void main(String[] args)
	{
		int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };

		FloodFill obj = new FloodFill();
		int[][] ans = obj.floodFill(image, 1, 1, 2);
		for (int i = 0; i < ans.length; i++)
		{
			for (int j = 0; j < ans[i].length; j++)
				System.out.print(ans[i][j] + " ");
			System.out.println();
		}
	}

}
