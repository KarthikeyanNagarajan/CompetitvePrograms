package com.karthik.practice.Stack.Q01_ImplementStackUsingArray;

public class Stack
{
	int[] arr = new int[1000];
	int top = -1;

	void push(int data)
	{
		top++;
		arr[top] = data;
	}

	int pop()
	{
		int val = arr[top];
		top--;
		return val;
	}

	int top()
	{
		return arr[top];
	}

	int size()
	{
		return top + 1;
	}

	void print()
	{
		for (int i = top ; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Stack st = new Stack();
		st.push(5);
		st.push(3);
		st.push(7);
		st.push(1);
		st.print();
		System.out.println("Pop : " + st.pop());
		st.print();
		System.out.println("Top : " + st.top());
		System.out.println("Size : " + st.size());
	}

}
