package com.karthik.practice.Graph.Q50_RatInMaze;

import java.util.ArrayList;
import java.util.Collections;

public class RatInMaze
{
	public static void solve(int row, int col, int[][] m, int n, int[][] vis, int[] dr, int[] dc, String s,
			ArrayList<String> ans)
	{
		if (row == n - 1 && col == n - 1)
		{
			ans.add(s);
			return;
		}

		String str = "URDL";
		m[row][col] = 0;
		for (int i = 0; i < 4; i++)
		{
			int newr = row + dr[i];
			int newc = col + dc[i];

			if (newr >= 0 && newr < n && newc >= 0 && newc < n && vis[newr][newc] == 0 && m[newr][newc] == 1)
			{
				vis[newr][newc] = 1;
				solve(newr, newc, m, n, vis, dr, dc, s + str.charAt(i), ans);
				vis[newr][newc] = 0;
			}
		}
		m[row][col] = 1;
	}

	public static ArrayList<String> findPath(int[][] m, int n)
	{
		int[][] vis = new int[n][n];
		int[] dr = { -1, 0, 1, 0 };
		int[] dc = { 0, 1, 0, -1 };

		ArrayList<String> ans = new ArrayList<>();
		if (m[0][0] != 0 && m[n - 1][n - 1] != 0)
			solve(0, 0, m, n, vis, dr, dc, "", ans);

		if (ans.size() == 0)
		{
			ArrayList<String> temp = new ArrayList<>();
			temp.add("-1");
			return temp;
		}
		else
			return ans;
	}

	public static void main(String[] args)
	{
		int[][] maze = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
		int n = maze.length;

		ArrayList<String> result = findPath(maze, n);
		Collections.sort(result);

		if (result.size() == 0)
			System.out.println(-1);
		else
			for (String path : result)
				System.out.print(path + " ");
		System.out.println();
	}
}
