package com.karthik.practice.Heap.Q22_MaximizeElementsUsingAnotherArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

public class MaximizeElementsUsingAnotherArray
{
	static ArrayList<Integer> maximizeArray(int[] arr1, int[] arr2, int n)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i : arr1)
			pq.offer(i);

		for (int i : arr2)
			pq.offer(i);

		while (set.size() != n)
			set.add(pq.poll());

		for (int i : arr2)
		{
			if (set.contains(i))
			{
				ans.add(i);
				set.remove(i);
			}
		}
		for (int i : arr1)
		{
			if (set.contains(i))
			{
				ans.add(i);
				set.remove(i);
			}
		}
		return ans;
	}

	public static void main(String[] args)
	{
		int arr1[] = { 7, 4, 8, 0, 1 };
		int arr2[] = { 9, 7, 2, 3, 6 };
		System.out.println(maximizeArray(arr1, arr2, 5));
	}
}
