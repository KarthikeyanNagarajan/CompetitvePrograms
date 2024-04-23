package com.karthik.practice.Graph.Q31_CheapestFlightsWithinKStops;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair
{
	int first;
	int second;

	public Pair(int first, int second)
	{
		this.first = first;
		this.second = second;
	}
}

class Tuple
{
	int first, second, third;

	Tuple(int first, int second, int third)
	{
		this.first = first;
		this.second = second;
		this.third = third;
	}
}

public class CheapestFlightsWithinKStops
{
	public int CheapestFlight(int n, int flights[][], int src, int dst, int K)
	{
		ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++)
			adj.add(new ArrayList<>());

		int m = flights.length;
		for (int i = 0; i < m; i++)
		{
			adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2]));
		}

		int[] dist = new int[n];
		for (int i = 0; i < n; i++)
			dist[i] = (int) 1e9;
		dist[src] = 0;

		Queue<Tuple> q = new LinkedList<>();
		q.add(new Tuple(0, src, 0));

		while (!q.isEmpty())
		{
			int stops = q.peek().first;
			int node = q.peek().second;
			int cost = q.peek().third;
			q.poll();

			if (stops > K)
				continue;

			for (Pair it : adj.get(node))
			{
				int adjNode = it.first;
				int edjWeight = it.second;

				if (cost + edjWeight < dist[adjNode])
				{
					dist[adjNode] = cost + edjWeight;
					q.add(new Tuple(stops + 1, adjNode, cost + edjWeight));
				}
			}
		}

		if (dist[dst] == (int) 1e9)
			return -1;
		return dist[dst];
	}

	public static void main(String[] args)
	{
		int n = 4, src = 0, dst = 3, K = 1;
		int[][] flights = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };

		CheapestFlightsWithinKStops obj = new CheapestFlightsWithinKStops();
		int ans = obj.CheapestFlight(n, flights, src, dst, K);

		System.out.print(ans);
		System.out.println();
	}
}
