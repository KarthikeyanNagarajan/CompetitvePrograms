package com.karthik.practice.Heap.Q19_KMaxSumCombinationOfTwoArray;

import java.util.Collections;
import java.util.PriorityQueue;

public class KMaxSumCombinationOfTwoArray
{
	public static void KMaxCombinations(int A[], int B[], int N, int K)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		// Insert all the possible combinations in max heap.
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				pq.add(A[i] + B[j]);

		// Pop first N elements from max heap and display them.
		int count = 0;
		while (count < K)
		{
			System.out.println(pq.poll());
			count++;
		}
	}

	public static void main(String[] args)
	{
		int A[] = { 4, 2, 5, 1 };
		int B[] = { 8, 0, 5, 3 };
		int N = A.length;
		int K = 3;

		KMaxCombinations(A, B, N, K);
	}
}
