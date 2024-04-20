package com.karthik.practice.Recursion.Q11_PrintAllSubSequence;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequence
{
	private static void print(int ind, List<Integer> ls, int[] arr, int n)
	{
		if (ind == n)
		{
			for (int l : ls)
				System.out.print(l + " ");
			if (ls.size() == 0)
				System.out.print("{}");
			System.out.println();
			return;
		}

		ls.add(arr[ind]);
		print(ind + 1, ls, arr, n);
		ls.remove(ls.size() - 1);
		print(ind + 1, ls, arr, n);
				
//		Reverse Order
//		print(ind + 1, ls, arr, n);
//		ls.add(arr[ind]);		
//		print(ind + 1, ls, arr, n);
//		ls.remove(ls.size() - 1);
	}

	public static void main(String[] args)
	{
		int arr[] = { 3, 1, 2 };
		int n = 3;
		List<Integer> ls = new ArrayList<>();
		print(0, ls, arr, n);
	}

}
