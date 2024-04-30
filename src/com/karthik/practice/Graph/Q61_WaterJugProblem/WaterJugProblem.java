package com.karthik.practice.Graph.Q61_WaterJugProblem;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WaterJugProblem
{
	public static boolean canMeasureWater(int jug1, int jug2, int target)
	{
		if (jug1 + jug2 < target)
			return false;

		Queue<Integer> q = new LinkedList<>();
		q.add(0);

		int[] dr = { jug1, -jug1, jug2, -jug2 };

		Set<Integer> vis = new HashSet<>();
		vis.add(0);

		while (!q.isEmpty())
		{
			int cur = q.poll();

			if (cur == target)
				return true;

			for (int it : dr)
			{
				int total = it + cur;

				if (total == target)
					return true;

				if (total < 0 || total > jug1 + jug2)
					continue;

				if (!vis.contains(total))
				{
					vis.add(total);
					q.add(total);
				}
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		int jug1 = 4;
		int jug2 = 3;
		int target = 2;

		System.out.println(canMeasureWater(jug1, jug2, target));
	}
}
