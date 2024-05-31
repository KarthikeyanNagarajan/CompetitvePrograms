package com.karthik.practice.Arrays.Q37_FirstNonRepeatingElement;

public class Using2Loops
{
	public static void Using2LoopsMethod(int[] arr, int n)
	{
		for (int i = 0; i < n; i++)
		{
			int count = 0;
			for (int j = 0; j < n; j++)
			{
				if (arr[i] == arr[j])
					count++;
			}
			if (count == 1)
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
		Using2LoopsMethod(arr, arr.length);
	}

}
