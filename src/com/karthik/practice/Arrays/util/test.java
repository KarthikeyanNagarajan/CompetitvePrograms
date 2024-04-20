package com.karthik.practice.Arrays.util;

public class test
{
	public static void rotate(int[] arr, int n, int k)
	{
		if(n==0)
			return;
		k = k% n;
		System.out.println(k);
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5 };
		rotate(arr, arr.length, 2);
	}

}
