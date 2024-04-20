package com.karthik.practice.Arrays.Q55_PascalTrianglePrint;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle
{
	public static void PascalTriangleMethod(int n)
	{
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> row, pre = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			row = new ArrayList<>();
			for (int j = 0; j <= i; j++)
			{
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			}
			pre = row;
			result.add(row);
		}
		result.stream().forEach(i ->  System.out.println(i));
	}

	public static void main(String[] args)
	{
		int n = 5;
		PascalTriangleMethod(n);
	}

}
