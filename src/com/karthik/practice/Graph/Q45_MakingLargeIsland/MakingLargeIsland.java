package com.karthik.practice.Graph.Q45_MakingLargeIsland;

import java.util.HashSet;
import java.util.Set;

import com.karthik.practice.Graph.util.DisjointSet;

public class MakingLargeIsland
{
	public int MaxConnection(int grid[][])
	{
		int n = grid.length;
		DisjointSet ds = new DisjointSet(n * n);

		for (int row = 0; row < n; row++)
		{
			for (int col = 0; col < n; col++)
			{
				if (grid[row][col] == 0)
					continue;
				int[] dr = { -1, 0, 1, 0 };
				int[] dc = { 0, 1, 0, -1 };
				for (int i = 0; i < 4; i++)
				{
					int newr = row + dr[i];
					int newc = col + dc[i];
					if (newr >= 0 && newr < n && newc >= 0 && newc < n && grid[newr][newc] == 1)
					{
						int nodeno = row * n + col;
						int adjnodeno = newr * n + newc;
						ds.unionBySize(nodeno, adjnodeno);
					}
				}
			}
		}

		int mx = 0;

		for (int row = 0; row < n; row++)
		{
			for (int col = 0; col < n; col++)
			{
				if (grid[row][col] == 1)
					continue;
				int[] dr = { -1, 0, 1, 0 };
				int[] dc = { 0, 1, 0, -1 };
				Set<Integer> components = new HashSet<Integer>();
				for (int i = 0; i < 4; i++)
				{
					int newr = row + dr[i];
					int newc = col + dc[i];
					if (newr >= 0 && newr < n && newc >= 0 && newc < n && grid[newr][newc] == 1)
					{
						components.add(ds.findUPar(newr * n + newc));
					}
				}
				int sizeTotal = 0;
				for (Integer parents : components)
				{
					sizeTotal += ds.size.get(parents);
				}
				mx = Math.max(mx, sizeTotal + 1);
			}
		}
		for (int cellNo = 0; cellNo < n * n; cellNo++)
		{
			mx = Math.max(mx, ds.size.get(ds.findUPar(cellNo)));
		}
		return mx;
	}

	public static void main(String[] args)
	{
		int[][] grid = { { 1, 1, 0, 1, 1, 0 }, { 1, 1, 0, 1, 1, 0 }, { 1, 1, 0, 1, 1, 0 }, { 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 0 } };

		MakingLargeIsland obj = new MakingLargeIsland();
		int ans = obj.MaxConnection(grid);
		System.out.println("The largest group of connected 1s is of size: " + ans);
	}
}
