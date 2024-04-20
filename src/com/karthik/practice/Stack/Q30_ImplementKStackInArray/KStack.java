package com.karthik.practice.Stack.Q30_ImplementKStackInArray;

public class KStack
{
	int[] arr, top, next;
	int n, k, free;

	KStack(int k1, int n1)
	{
		k = k1;
		n = n1;
		arr = new int[n];
		next = new int[n];
		top = new int[k];
		for (int i = 0; i < k; i++)
			top[i] = -1;
		free = 0;
		for (int i = 0; i < n - 1; i++)
			next[i] = i + 1;
		next[n - 1] = -1;
	}

	boolean isFull()
	{
		return free == -1;
	}

	boolean isEmpty(int k)
	{
		return top[k] == -1;
	}

	void push(int data, int k)
	{
		if (isFull())
			System.out.println("Full");
		else
		{
			int i = free;
			free = next[i];
			next[i] = top[k];
			top[k] = i;
			arr[i] = data;
		}
	}

	int pop(int k)
	{
		if (isEmpty(k))
			System.out.println("Empty");
		else
		{
			int i = top[k];
			top[k] = next[i];
			next[i] = free;
			free = i;
			return arr[i];
		}
		return 0;
	}

	public static void main(String[] args)
	{
		int k = 3, n = 10;

		KStack ks = new KStack(k, n);

		ks.push(15, 2);
		ks.push(45, 2);

		// Let us put some items in stack number 1
		ks.push(17, 1);
		ks.push(49, 1);
		ks.push(39, 1);

		// Let us put some items in stack number 0
		ks.push(11, 0);
		ks.push(9, 0);
		ks.push(7, 0);

		System.out.println("Popped element from stack 2 is " + ks.pop(2));
		System.out.println("Popped element from stack 1 is " + ks.pop(1));
		System.out.println("Popped element from stack 0 is " + ks.pop(0));
	}

}
