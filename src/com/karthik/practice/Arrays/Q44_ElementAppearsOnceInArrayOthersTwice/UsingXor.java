package com.karthik.practice.Arrays.Q44_ElementAppearsOnceInArrayOthersTwice;

public class UsingXor
{
	public static void UsingXorMethod(int[] arr, int n)
	{
		int res = arr[0];
		for (int i = 1; i < n; i++)
		{
			res ^= arr[i];
		}
		System.out.println(res);
	}

	public static void main(String[] args)
	{
//		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6 };
		int[] arr = { 2, 2, 1 };
		UsingXorMethod(arr, arr.length);
	}

}
