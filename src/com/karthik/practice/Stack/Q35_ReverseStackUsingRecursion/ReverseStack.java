package com.karthik.practice.Stack.Q35_ReverseStackUsingRecursion;

import java.util.Stack;

public class ReverseStack
{
	static Stack<Character> st = new Stack<>();

	static void insertAtBottom(char c)
	{
		if (st.isEmpty())
			st.push(c);
		else
		{
			char x = st.pop();
			insertAtBottom(c);
			st.push(x);
		}
	}

	static void reverse()
	{
		if (st.size() > 0)
		{
			char c = st.pop();
			reverse();
			insertAtBottom(c);
		}
	}

	public static void main(String[] args)
	{
		st.push('1');
		st.push('2');
		st.push('3');
		st.push('4');

		System.out.println("Original Stack");

		System.out.println(st);

		// function to reverse
		// the stack
		reverse();

		System.out.println("Reversed Stack");

		System.out.println(st);
	}

}
