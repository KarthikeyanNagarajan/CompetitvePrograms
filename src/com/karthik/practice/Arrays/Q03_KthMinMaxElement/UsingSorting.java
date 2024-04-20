package com.karthik.practice.Arrays.Q03_KthMinMaxElement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UsingSorting
{
	private static int[] UsingSortingMethod(int[] arr, int k)
	{
		int[] ans = new int[2];
		List<Integer> ls = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(ls);
		ans[0] = ls.get(k - 1);
		Collections.reverse(ls);
		ans[1] = ls.get(k - 1);
		return ans;
	}

	public static void main(String[] args)
	{
		int[] arr = { 5, 8, 3, 9, 2, 0, 7, 1 };
		int k = 3;
		int[] ans = UsingSortingMethod(arr, k);
		System.out.println("Kth Min Element : " + ans[0]);
		System.out.println("Kth Max Element : " + ans[1]);
	}

}
