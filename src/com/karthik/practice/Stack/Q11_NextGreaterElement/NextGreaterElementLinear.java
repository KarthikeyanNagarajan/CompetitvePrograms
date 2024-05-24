package com.karthik.practice.Stack.Q11_NextGreaterElement;

import java.util.Stack;

public class NextGreaterElementLinear
{

	static int[] find(int[] arr)
	{
		int n = arr.length;
		int[] nge = new int[n];
		Stack<Integer> st = new Stack<>();
		for (int i = n - 1; i >= 0; i--)
		{
			while (!st.isEmpty() && st.peek() <= arr[i])
				st.pop();
			if (i < n)
			{
				if (!st.isEmpty())
					nge[i] = st.peek();
				else
					nge[i] = -1;
			}
			st.push(arr[i]);
		}
		return nge;
	}

	public static void main(String[] args)
	{
		int arr[] = { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };

		int arr2[] = find(arr);
		System.out.println("The next greater elements are ");
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
	}

}
