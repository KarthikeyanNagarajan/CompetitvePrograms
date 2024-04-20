package com.karthik.practice.Stack.Q11_NumberOfNextGreaterElement;

public class NumberOfNextGreaterElement1
{
	static void count(int[] a, int n, int q)
	{
		int count = 0;
		int lastEle = a[q];
		for (int i = q + 1; i < n; i++)
		{
			if (a[i] > lastEle)
			{
				lastEle = a[i];
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args)
	{
		int a[] = { 1, 3, 6, 5, 8, 9, 13, 4 };
		int n = a.length;

		count(a, n, 0);
		count(a, n, 1);
		count(a, n, 5);
	}

}
