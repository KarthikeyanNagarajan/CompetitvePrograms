package com.karthik.practice.Graph.Q51_StepsByKnight;

import java.util.LinkedList;
import java.util.Queue;

class Pair
{
	int row;
	int col;
	int dist;

	Pair(int row, int col, int dist)
	{
		this.row = row;
		this.col = col;
		this.dist = dist;
	}
}

public class StepsByKnight
{
	public static int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
	{
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(KnightPos[0], KnightPos[1], 0));

		int dr[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
		int dc[] = { -1, -2, -2, -1, 1, 2, 2, 1 };

		int[][] vis = new int[N + 1][N + 1];
		vis[KnightPos[0]][KnightPos[1]] = 1;

		while (!q.isEmpty())
		{
			Pair it = q.peek();
			q.remove();

			if (it.row == TargetPos[0] && it.col == TargetPos[1])
				return it.dist;

			for (int i = 0; i < 8; i++)
			{
				int newr = it.row + dr[i];
				int newc = it.col + dc[i];

				if (newr >= 1 && newr <= N && newc >= 1 && newc <= N && vis[newr][newc] == 0)
				{
					vis[newr][newc] = 1;
					q.add(new Pair(newr, newc, it.dist + 1));
				}
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args)
	{
		int N = 30;
		int knightPos[] = { 1, 1 };
		int targetPos[] = { 30, 30 };

		System.out.println(minStepToReachTarget(knightPos, targetPos, N));
	}
}
