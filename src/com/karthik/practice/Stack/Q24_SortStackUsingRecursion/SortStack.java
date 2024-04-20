package com.karthik.practice.Stack.Q24_SortStackUsingRecursion;

import java.util.Stack;

public class SortStack
{
	static void sort(Stack<Integer> s)
	{
		if (!s.isEmpty())
		{
			int x = s.pop();
			sort(s);
			sortInsert(s, x);
		}
	}

	static void sortInsert(Stack<Integer> s, int x)
	{
		if (s.isEmpty() || x > s.peek())
		{
			s.push(x);
			return;
		}
		int y = s.pop();
		sortInsert(s, x);
		s.push(y);
	}

	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
        
        System.out.println(s.toString());
        sort(s);
        System.out.println(s.toString());
	}

}
