package com.karthik.practice.Arrays.Q04_Sorting012;

public class UsingDutchNationalFlagAlgo
{
	private static int[] UsingDutchNationalFlagAlgoMethod(int[] arr, int n)
	{
		int low = 0, mid = 0, high = n-1;
		while(mid <= high)
		{
			switch(arr[mid])
			{
			case 0:
				int tmp1 = arr[mid];
				arr[mid] = arr[low];
				arr[low] = tmp1;
				mid++;
				low++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				int tmp2 = arr[high];
				arr[high] = arr[mid];
				arr[mid] = tmp2;
				high--;
				break;
			}
		}
		return arr;
	}

	public static void main(String[] args)
	{
		int[] arr = { 0, 2, 0, 1, 0, 2, 1, 1, 0 };
		int[] ans = UsingDutchNationalFlagAlgoMethod(arr, arr.length);
		System.out.print("Sorted Elements :  ");
		for (int a : ans)
			System.out.print(a + " ");
	}

}
