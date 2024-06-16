package com.karthik.practice.Recursion.Q42_SortStackUsingRecursion;

import java.util.Stack;

public class SortStackUsingRecursion
{
	public static void sortStack(Stack<Integer> s)
	{
		if (s.empty())
			return;

		int x = s.pop();

		sortStack(s);

		Stack<Integer> tempStack = new Stack<>();

		// Move all elements that are greater than x from
		// the main stack to the tempStack
		while (!s.empty() && s.peek() > x)
		{
			tempStack.push(s.pop());
		}

		// Push x back into the main stack
		s.push(x);

		// Move all elements from tempStack back to the main
		// stack
		while (!tempStack.empty())
		{
			s.push(tempStack.pop());
		}
	}

	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<>();
		s.push(34);
		s.push(3);
		s.push(31);
		s.push(98);
		s.push(92);
		s.push(23);

		sortStack(s);

		System.out.print("Sorted numbers are: ");
		while (!s.empty())
		{
			System.out.print(s.pop() + " ");
		}
	}

}
