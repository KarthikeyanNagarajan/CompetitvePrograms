package com.karthik.practice.Graph.Q56_MinCostToConnectAllPoints;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class MinCostToConnectAllPoints
{
	public static int minCostConnectPoints(int[][] edges)
	{
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
		pq.add(new int[] { 0, 0, 0 });

		Set<Integer> vis = new HashSet<>();

		int num = edges.length;
		int cost = 0;

		while (!pq.isEmpty() && vis.size() < num)
		{
			int[] curr = pq.poll();
			int endId = curr[1];
			int currcost = curr[2];

			if (vis.contains(endId))
				continue;

			vis.add(endId);
			cost += currcost;

			for (int i = 0; i < num; i++)
				if (!vis.contains(i))
					pq.add(new int[] { endId, i,
							Math.abs(edges[endId][0] - edges[i][0]) + Math.abs(edges[endId][1] - edges[i][1]) });
		}
		return cost;
	}

	public static void main(String[] args)
	{
		int[][] points = { { 0, 0 }, { 2, 2 }, { 3, 10 }, { 5, 2 }, { 7, 0 } };
		System.out.println(minCostConnectPoints(points));
	}
}
