package com.karthik.practice.Graph.Q43_KruskalAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.karthik.practice.Graph.util.DisjointSet;

class Edge implements Comparable<Edge>
{
	int src, dest, weight;

	Edge(int _src, int _dest, int _wt)
	{
		this.src = _src;
		this.dest = _dest;
		this.weight = _wt;
	}

	// Comparator function used for
	// sorting edgesbased on their weight
	public int compareTo(Edge compareEdge)
	{
		return this.weight - compareEdge.weight;
	}
};

public class KruskalAlgorithm
{
	public int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj)
	{
		List<Edge> edges = new ArrayList<>();

		for (int i = 0; i < V; i++)
		{
			for (int j = 0; j < adj.get(i).size(); j++)
			{
				int adjNode = adj.get(i).get(j).get(0);
				int adjwt = adj.get(i).get(j).get(1);
				Edge temp = new Edge(i, adjNode, adjwt);
				edges.add(temp);
			}
		}

		DisjointSet ds = new DisjointSet(V);
		Collections.sort(edges);
		int mstwt = 0;

		for (int i = 0; i < edges.size(); i++)
		{
			int wt = edges.get(i).weight;
			int u = edges.get(i).src;
			int v = edges.get(i).dest;

			if (ds.findUPar(u) != ds.findUPar(v))
			{
				mstwt += wt;
				ds.unionBySize(u, v);
			}
		}
		return mstwt;
	}

	public static void main(String[] args)
	{
		int V = 5;
		ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
		int[][] edges = { { 0, 1, 2 }, { 0, 2, 1 }, { 1, 2, 1 }, { 2, 3, 2 }, { 3, 4, 1 }, { 4, 2, 2 } };

		for (int i = 0; i < V; i++)
		{
			adj.add(new ArrayList<ArrayList<Integer>>());
		}

		for (int i = 0; i < 6; i++)
		{
			int u = edges[i][0];
			int v = edges[i][1];
			int w = edges[i][2];

			ArrayList<Integer> tmp1 = new ArrayList<Integer>();
			ArrayList<Integer> tmp2 = new ArrayList<Integer>();
			tmp1.add(v);
			tmp1.add(w);

			tmp2.add(u);
			tmp2.add(w);

			adj.get(u).add(tmp1);
			adj.get(v).add(tmp2);
		}

		KruskalAlgorithm obj = new KruskalAlgorithm();
		int mstWt = obj.spanningTree(V, adj);
		System.out.println("The sum of all the edge weights: " + mstWt);
	}

}
