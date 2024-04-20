package com.karthik.practice.Stack.Q18_CelebrityProblem;

import java.util.Stack;

public class CelebrityProblem
{
	static int MATRIX[][] = { { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } };

	static boolean knows(int a, int b)
	{
		return MATRIX[a][b] == 1;
	}

	static int findCelebrity(int n)
	{
		Stack<Integer> st = new Stack<>();
		int c = 0;
		for (int i = 0; i < n; i++)
		{
			st.push(i);
		}

		while (st.size() > 1)
		{
			int s1 = st.pop();
			int s2 = st.pop();
			if (knows(s1, s2))
				st.push(s2);
			else
				st.push(s1);
		}

		if (st.isEmpty())
			return -1;
		c = st.pop();
		for (int i = 0; i < n; i++)
		{
			if (i != c && (knows(c, i) || !knows(i, c)))
				return -1;
		}
		return c;
	}

	public static void main(String[] args)
	{
		int n = 4;
		int result = findCelebrity(n);
		if (result == -1)
		{
			System.out.println("No Celebrity");
		}
		else
			System.out.println("Celebrity:  " + result);
	}

}
