package com.karthik.practice.Arrays.Q53_TwoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingTwoPointer
{
	public static void UsingTwoPointerMethod(int[] arr, int n, int k)
	{
		List<Integer> result = new ArrayList<>();
		int[] store = new int[n];
		store = arr;
		Arrays.sort(store);
		int left = 0, right = n - 1, n1 = 0, n2 = 0;
		while (left < right)
		{
			if (store[left] + store[right] == k)
			{
				n1 = store[left];
				n2 = store[right];
				break;
			}
			else if (store[left] + store[right] > k)
				right--;
			else
				left++;
		}
		for (int i = 0; i < n; i++)
		{
			if (arr[i] == n1)
				result.add(i);
			else if (arr[i] == n2)
				result.add(i);
		}
		System.out.println(result);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		int k = 7;
		UsingTwoPointerMethod(arr, n, k);
	}

}
