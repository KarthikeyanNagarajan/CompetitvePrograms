package com.karthik.practice.Arrays.Q56_NthPascalRowPrint;

import java.util.ArrayList;
import java.util.List;

public class NthPascalRowPrint
{
	public static void NthPascalRowPrintMethod(int n)
	{
		int prev = 1;
		System.out.print(prev + " ");
		for (int i = 1; i <= n; i++)
		{
			int curr = (prev * (n - i + 1)) / i;
			System.out.print(curr + " ");
			prev = curr;
		}
	}

//	Leetcode
	public static List<Integer> NthPascalRowPrintMethodList(int n)
	{
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < n + 1; i++)
		{
			result.add(1);
			for (int j = i; j >= 0; j--)
			{
				if (j != 0 && j != i)
				{
					result.set(j, result.get(j) + result.get(j - 1));
				}
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		int n = 3;
		NthPascalRowPrintMethod(n - 1);
		System.out.println();
		System.out.println(NthPascalRowPrintMethodList(n - 1));
	}

}
