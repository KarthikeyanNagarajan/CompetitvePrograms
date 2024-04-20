package com.karthik.practice.Stack.Q33_GetMinimumElementInStack;

import java.util.Stack;

public class MinElement
{
	Stack<Integer> st;
	int minEle = 0;

	MinElement()
	{
		st = new Stack<>();
	}

	void getMin()
	{
		if (st.isEmpty())
		{
			System.out.println("Empty");
			return;
		}
		System.out.println(minEle);
	}

	void peek()
	{
		if (st.isEmpty())
		{
			System.out.println("Empty");
			return;
		}
		int t = st.peek();
		if (t < minEle)
			System.out.println(minEle);
		else
			System.out.println(t);
	}

	void pop()
	{
		if (st.isEmpty())
		{
			System.out.println("Empty");
			return;
		}
		int t = st.peek();
		st.pop();
		if (t < minEle)
		{
			System.out.println(minEle);
			minEle = 2 * minEle - t;
		}
		else
			System.out.println(t);
	}

	void push(int data)
	{
		if (st.isEmpty())
		{
			minEle = data;
			st.push(data);
			return;
		}
		if (data < minEle)
		{
			st.push(2 * data - minEle);
			minEle = data;
		}
		else
			st.push(data);
	}

	public static void main(String[] args)
	{
		MinElement s = new MinElement();

		s.push(3);
		s.push(5);
		s.getMin();
		s.push(2);
		s.push(1);
		s.getMin();
		s.pop();
		s.getMin();
		s.pop();
		s.peek();
	}

}
