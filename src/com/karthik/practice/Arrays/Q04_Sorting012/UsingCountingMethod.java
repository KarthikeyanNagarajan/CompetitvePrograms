package com.karthik.practice.Arrays.Q04_Sorting012;

public class UsingCountingMethod
{
	private static int[] ConstructArray(int zero, int one, int two)
	{
		int[] arr = new int[zero+one+two];
		int i = 0;
		while(zero > 0)
		{
			arr[i] = 0;
			i++;
			zero--;
		}
		while(one > 0)
		{
			arr[i] = 1;
			i++;
			one--;
		}
		while(two > 0)
		{
			arr[i] = 2;
			i++;
			two--;
		}
		return arr;
	}

	private static int[] UsingCounting(int[] arr)
	{
		int zero = 0, one = 0, two = 0;
		for (int a : arr)
		{
			if (a == 0)
				zero++;
			else if (a == 1)
				one++;
			else
				two++;
		}
		return ConstructArray(zero, one, two);
	}

	public static void main(String[] args)
	{
		int[] arr = { 0, 2, 0, 1, 0, 2, 1, 1, 0 };
		int[] ans = UsingCounting(arr);
		System.out.print("Sorted Elements :  ");
		for (int a : ans)		
			System.out.print(a + " ");
	}

}
