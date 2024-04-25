package com.karthik.practice.Graph.Q44_NoOfIslands2;

import java.util.ArrayList;
import java.util.List;

import com.karthik.practice.Graph.util.DisjointSet;

public class NoOfIslands2
{
	public List<Integer> numOfIslands(int n, int m, int[][] operators)
	{
		DisjointSet ds = new DisjointSet(n * m);
		int[][] vis = new int[n][m];
		int cnt = 0;
		List<Integer> ans = new ArrayList<>();
		for (int[] oper : operators)
		{
			int row = oper[0];
			int col = oper[1];
			if (vis[row][col] == 1)
			{
				ans.add(cnt);
				continue;
			}

			vis[row][col] = 1;
			cnt++;

			int[] dr = { -1, 0, 1, 0 };
			int[] dc = { 0, 1, 0, -1 };
			for (int ind = 0; ind < 4; ind++)
			{
				int newr = row + dr[ind];
				int newc = col + dc[ind];
				if (newr >= 0 && newr < n && newc >= 0 && newc < m && vis[newr][newc] == 1)
				{
					int nodeno = row * m + col;
					int adjnodeno = newr * m + newc;
					if (ds.findUPar(nodeno) != ds.findUPar(adjnodeno))
					{
						cnt--;
						ds.unionBySize(nodeno, adjnodeno);
					}
				}
			}
			ans.add(cnt);
		}
		return ans;
	}

	public static void main(String[] args)
	{
		int n = 4, m = 5;
		int[][] operators = { { 0, 0 }, { 0, 0 }, { 1, 1 }, { 1, 0 }, { 0, 1 }, { 0, 3 }, { 1, 3 }, { 0, 4 }, { 3, 2 },
				{ 2, 2 }, { 1, 2 }, { 0, 2 } };

		NoOfIslands2 obj = new NoOfIslands2();
		List<Integer> ans = obj.numOfIslands(n, m, operators);

		int sz = ans.size();
		for (int i = 0; i < sz; i++)
		{
			System.out.print(ans.get(i) + " ");
		}
		System.out.println("");
	}
}
