package com.karthik.practice.Graph.Q32_MinMultiplicationToReachEnd;

import java.util.LinkedList;
import java.util.Queue;

class Pair
{
	int first, second;

	Pair(int first, int second)
	{
		this.first = first;
		this.second = second;
	}
}

public class MinMultiplicationToReachEnd
{
	public int minimumMultiplications(int[] arr, int start, int end)
	{
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(start, 0));

		int[] dist = new int[100000];
		for (int i = 0; i < 100000; i++)
			dist[i] = (int) 1e9;
		dist[start] = 0;

		int mod = 100000;
		int n = arr.length;

		while (!q.isEmpty())
		{
			int node = q.peek().first;
			int steps = q.peek().second;
			q.poll();

			for (int i = 0; i < n; i++)
			{
				int num = (arr[i] * node) % mod;
				if (steps + 1 < dist[num])
				{
					dist[num] = steps + 1;
					if (num == end)
						return steps + 1;
					q.add(new Pair(num, steps + 1));
				}
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{

		int start = 3, end = 30;
		int[] arr = { 2, 5, 7 };

		MinMultiplicationToReachEnd obj = new MinMultiplicationToReachEnd();
		int ans = obj.minimumMultiplications(arr, start, end);

		System.out.print(ans);
		System.out.println();
	}
}
