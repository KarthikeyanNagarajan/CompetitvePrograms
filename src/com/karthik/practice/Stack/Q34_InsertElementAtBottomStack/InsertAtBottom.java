package com.karthik.practice.Stack.Q34_InsertElementAtBottomStack;

import java.util.Stack;

public class InsertAtBottom
{
	static Stack<Integer> recur(Stack<Integer> st, int data)
	{
		if (st.isEmpty())
			st.push(data);
		else
		{
			int x = st.pop();
			recur(st, data);
			st.push(x);
		}
		return st;
	}

	static void insert(Stack<Integer> st, int data)
	{
		st = recur(st, data);
		while (!st.isEmpty())
		{
			System.out.print(st.peek() + " ");
			st.pop();
		}
	}

	public static void main(String[] args)
	{
		Stack<Integer> S = new Stack<Integer>();
		S.push(5);
		S.push(4);
		S.push(3);
		S.push(2);
		S.push(1);

		int N = 7;

		insert(S, N);
	}

}
