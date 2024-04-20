package com.karthik.practice.Arrays.Q27_MinMergeOperationsToMakePalindrome;

public class Using2Pointer
{
	public static int Using2PointerMethod(int[] arr, int n)
	{
		int ans = 0;
		int i = 0, j = n - 1;
		while (i <= j)
		{
			if (arr[i] == arr[j])
			{
				i++;
				j--;
			}
			else if (arr[i] > arr[j])
			{
				j--;
				arr[j] += arr[j + 1];
				ans++;
			}
			else
			{
				j--;
				arr[i] += arr[i - 1];
				ans++;
			}
		}
		return ans;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 4, 5, 1 }; // ans = 1
		System.out.println(Using2PointerMethod(arr, arr.length));

	}

}
