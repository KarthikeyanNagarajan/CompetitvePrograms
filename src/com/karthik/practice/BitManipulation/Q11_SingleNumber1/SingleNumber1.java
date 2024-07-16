package com.karthik.practice.BitManipulation.Q11_SingleNumber1;

public class SingleNumber1
{

	public static int func(int[] arr, int n)
	{
		int ans = 0;
		for (int i = 0; i < n; i++)
		{
			ans = ans ^ arr[i];
		}

		return ans;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 2, 3 };
		int n = arr.length;

		System.out.println(func(arr, n));
	}

}
