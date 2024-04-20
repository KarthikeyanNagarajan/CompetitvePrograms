package com.karthik.practice.Stack.Q47_SumOfMinAndMaxOfAllSubArrayOfSizeK;

import java.util.Deque;
import java.util.LinkedList;

public class Sum
{
	static int SumOfKsubArray(int[] arr, int k)
	{
		int sum = 0;
		Deque<Integer> S = new LinkedList<>();
		Deque<Integer> G = new LinkedList<>();
		int i = 0;
		for (i = 0; i < k; i++)
		{
			while (!S.isEmpty() && arr[S.peekFirst()] >= arr[i])
				S.removeLast();
			while (!G.isEmpty() && arr[G.peekFirst()] <= arr[i])
				G.removeLast();
			S.addLast(i);
			G.addLast(i);
		}
		for (; i < arr.length; i++)
		{
			sum += arr[S.peekFirst()] + arr[G.peekFirst()];
			while (!S.isEmpty() && S.peekFirst() <= i - k)
				S.removeFirst();
			while (!G.isEmpty() && G.peekFirst() <= i - k)
				G.removeFirst();
			while (!S.isEmpty() && arr[S.peekFirst()] >= arr[i])
				S.removeLast();
			while (!G.isEmpty() && arr[G.peekFirst()] <= arr[i])
				G.removeLast();
			S.addLast(i);
			G.addLast(i);
		}
		sum += arr[S.peekFirst()] + arr[G.peekFirst()];
		return sum;
	}

	public static void main(String[] args)
	{
		int arr[] = { 2, 5, -1, 7, -3, -1, -2 };
		int k = 3;
		System.out.println(SumOfKsubArray(arr, k));
	}

}
