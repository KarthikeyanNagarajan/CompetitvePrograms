package temp.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue
{

	public static void main(String[] args)
	{
		Deque<Integer> dq = new ArrayDeque<>();
		dq.push(1);
		dq.push(2);
		System.out.println(dq);
		dq.add(3);
		dq.add(4);
		System.out.println(dq);
		dq.pollFirst();
		System.out.println(dq);
		dq.pollLast();
		System.out.println(dq);
	}

}
