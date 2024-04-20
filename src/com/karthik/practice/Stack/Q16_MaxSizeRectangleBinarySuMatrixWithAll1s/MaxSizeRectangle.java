package com.karthik.practice.Stack.Q16_MaxSizeRectangleBinarySuMatrixWithAll1s;

import java.util.Stack;

public class MaxSizeRectangle
{

	static int maxhist(int[] arr, int r, int c)
	{
		Stack<Integer> st = new Stack<>();
		int topval = 0, maxarea = 0, area = 0, i = 0;
		while (i < c)
		{
			if (st.isEmpty() || arr[st.peek()] <= arr[i])
				st.push(i++);
			else
			{
				topval = arr[st.peek()];
				st.pop();
				area = topval * i;
				if (!st.isEmpty())
					area = topval * (i - st.peek() - 1);
				maxarea = Math.max(area, maxarea);
			}
		}
		while (!st.isEmpty())
		{
			topval = arr[st.peek()];
			st.pop();
			area = topval * i;
			if (!st.isEmpty())
				area = topval * (i - st.peek() - 1);
			maxarea = Math.max(area, maxarea);
		}
		return maxarea;
	}

	static int maxRectangle(int[][] arr, int R, int C)
	{
		int result = maxhist(arr[0], R, C);
		for (int i = 1; i < R; i++)
		{
			for (int j = 0; i < C; i++)
			{
				if (arr[i][j] == 1)
					arr[i][j] += arr[i - 1][j];
			}
			result = Math.max(result, maxhist(arr[i], R, C));
		}
		return result;
	}

	public static void main(String[] args)
	{
		int R = 4;
		int C = 4;
		int M[][] = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };
		System.out.println(maxRectangle(M, R, C));
	}

}
