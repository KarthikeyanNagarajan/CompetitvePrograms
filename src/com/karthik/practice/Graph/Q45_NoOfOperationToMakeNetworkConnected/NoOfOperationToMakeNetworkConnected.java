package com.karthik.practice.Graph.Q45_NoOfOperationToMakeNetworkConnected;

import com.karthik.practice.Graph.util.DisjointSet;

public class NoOfOperationToMakeNetworkConnected
{

	public int Solve(int n, int[][] edge)
	{
		DisjointSet ds = new DisjointSet(n);
		int cntExtras = 0;

		for (int i = 0; i < edge.length; i++)
		{
			int u = edge[i][0];
			int v = edge[i][1];
			if (ds.findUPar(u) == ds.findUPar(v))
				cntExtras++;
			else
				ds.unionBySize(u, v);
		}

		int cntC = 0;
		for (int i = 0; i < n; i++)
			if (ds.parent.get(i) == i)
				cntC++;

		int ans = cntC - 1;
		if (cntExtras >= ans)
			return ans;
		return -1;
	}

	public static void main(String[] args)
	{
		int V = 9;
		int[][] edge = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 2 }, { 2, 3 }, { 4, 5 }, { 5, 6 }, { 7, 8 } };

		NoOfOperationToMakeNetworkConnected obj = new NoOfOperationToMakeNetworkConnected();
		int ans = obj.Solve(V, edge);
		System.out.println("The number of operations needed: " + ans);
	}

}
