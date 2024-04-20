package com.karthik.practice.Arrays.Q44_ElementAppearsOnceInArrayOthersTwice;

public class Using1Loops
{
	public static int Using1LoopsMethod(int[] arr, int n)
	{
		int i = 0;
		for (i = 1; i < n; i++)
		{
			if(arr[i-1] != arr[i] && arr[i] != arr[i+1])
				return arr[i];
		}
		return 0;
	}

	public static void main(String[] args)
	{
//		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6 };
		int[] arr = { 2, 2, 1 };
		System.out.println(Using1LoopsMethod(arr, arr.length));
	}

}
