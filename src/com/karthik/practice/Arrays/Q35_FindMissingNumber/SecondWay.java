package com.karthik.practice.Arrays.Q35_FindMissingNumber;

public class SecondWay
{
	public static void SecondWayMethod(int[] arr, int n)
	{
		int total = 1;
		for (int i = 2; i <= n + 1; i++)
		{
			total += i;
			total -= arr[i - 2];
		}
		System.out.println(total);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 }; // ans = 4
		SecondWayMethod(arr, arr.length);
	}

}
