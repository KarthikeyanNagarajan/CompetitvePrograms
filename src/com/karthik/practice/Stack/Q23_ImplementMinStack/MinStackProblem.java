package com.karthik.practice.Stack.Q23_ImplementMinStack;

import java.util.Stack;

public class MinStackProblem
{
	class Pair
	{
		int x, y;

		Pair(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}

	class MinStack
	{
		Stack<Pair> st;

		MinStack()
		{
			st = new Stack<>();
		}

		void push(int val)
		{
			int min = 0;
			if (st.isEmpty())
				min = val;
			else
			{
				min = Math.min(val, st.peek().y);
			}
			st.push(new Pair(val, min));
		}

		void pop()
		{
			st.pop();
		}

		int top()
		{
			return st.peek().x;
		}

		int min()
		{
			return st.peek().y;
		}
	}

	public static void main(String[] args)
	{
//		MinStackProblem st = new MinStackProblem();
	}

}
