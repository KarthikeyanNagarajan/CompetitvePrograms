package com.karthik.practice.Stack.Q11_NextGreaterElement;

import java.util.Stack;

public class NextGreaterElementCircular
{

	static int[] find(int[] arr)
	{
		int n = arr.length;
		int[] nge = new int[n];
		Stack<Integer> st = new Stack<>();
		// 2n - 1 size of imaginary array
		for (int i = 2 * n - 1; i >= 0; i--)
		{
			while (!st.isEmpty() && st.peek() <= arr[i % n]) // i % n -> 5%5=0, 6%5=1 return index as circular
				st.pop();
			if (i < n)
			{
				if (!st.isEmpty())
					nge[i] = st.peek();
				else
					nge[i] = -1;
			}
			st.push(arr[i % n]);
		}
		return nge;
	}

	public static void main(String[] args)
	{
		int arr[] = { 5, 7, 1, 2, 6, 0 };

		int arr2[] = find(arr);
		System.out.println("The next greater elements are ");
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
	}

}
