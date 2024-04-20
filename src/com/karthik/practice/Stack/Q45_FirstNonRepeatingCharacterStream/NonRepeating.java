package com.karthik.practice.Stack.Q45_FirstNonRepeatingCharacterStream;

import java.util.LinkedList;
import java.util.Queue;

public class NonRepeating
{
	static int MAX_CHAR = 26;

	static void firstNonRepeating(String str)
	{
		int[] charCount = new int[MAX_CHAR];
		Queue<Character> q = new LinkedList<Character>();
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			q.add(ch);
			charCount[ch - 'a']++;
			while (!q.isEmpty())
			{
				if (charCount[q.peek() - 'a'] > 1)
					q.remove();
				else
				{
					System.out.print(q.peek() + " ");
					break;
				}
			}
			if (q.isEmpty())
				System.out.print(-1 + " ");
		}

	}

	public static void main(String[] args)
	{
		String str = "aabc";
		firstNonRepeating(str);
	}

}
