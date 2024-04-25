package com.karthik.practice.Graph.Q43_AccountsMerge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.karthik.practice.Graph.util.DisjointSet;

public class AccountsMerge
{
	public static List<List<String>> accountsMerge(List<List<String>> details)
	{
		int n = details.size();
		DisjointSet ds = new DisjointSet(n);
		Map<String, Integer> mapMailNode = new HashMap<>();

		for (int i = 0; i < n; i++)
		{
			for (int j = 1; j < details.get(i).size(); j++)
			{
				String mail = details.get(i).get(j);
				if (!mapMailNode.containsKey(mail))
					mapMailNode.put(mail, i);
				else
					ds.unionBySize(i, mapMailNode.get(mail));
			}
		}

		ArrayList<String>[] merged = new ArrayList[n];
		for (int i = 0; i < n; i++)
			merged[i] = new ArrayList<String>();

		for (Map.Entry<String, Integer> it : mapMailNode.entrySet())
		{
			String mail = it.getKey();
			int node = ds.findUPar(it.getValue());
			merged[node].add(mail);
		}

		List<List<String>> ans = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			if (merged[i].size() == 0)
				continue;
			Collections.sort(merged[i]);
			List<String> temp = new ArrayList<>();
			temp.add(details.get(i).get(0));
			for (String it : merged[i])
			{
				temp.add(it);
			}
			ans.add(temp);
		}
		return ans;
	}

	public static void main(String[] args)
	{
		List<List<String>> accounts = new ArrayList<List<String>>()
		{
			{
				add(new ArrayList<String>(Arrays.asList("John", "j1@com", "j2@com", "j3@com")));
				add(new ArrayList<String>(Arrays.asList("John", "j4@com")));
				add(new ArrayList<String>(Arrays.asList("Raj", "r1@com", "r2@com")));
				add(new ArrayList<String>(Arrays.asList("John", "j1@com", "j5@com")));
				add(new ArrayList<String>(Arrays.asList("Raj", "r2@com", "r3@com")));
				add(new ArrayList<String>(Arrays.asList("Mary", "m1@com")));
			}
		};

		AccountsMerge obj = new AccountsMerge();
		List<List<String>> ans = obj.accountsMerge(accounts);

		int n = ans.size();
		for (int i = 0; i < n; i++)
		{
			System.out.print(ans.get(i).get(0) + ": ");
			int size = ans.get(i).size();
			for (int j = 1; j < size; j++)
			{
				System.out.print(ans.get(i).get(j) + " ");
			}

			System.out.println("");
		}

	}
}
