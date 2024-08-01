package com.karthik.practice.LinkedList.Q46_LFUCache;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

class LFU
{
	private int capacity;
	private int minFreq = 0;
	private Map<Integer, Integer> keyToVal = new HashMap<>();
	private Map<Integer, Integer> keyToFreq = new HashMap<>();
	private Map<Integer, LinkedHashSet<Integer>> freqToLRUKeys = new HashMap<>();

	public LFU(int capacity)
	{
		this.capacity = capacity;
	}

	public int get(int key)
	{
		if (!keyToVal.containsKey(key))
			return -1;

		int freq = keyToFreq.get(key);
		freqToLRUKeys.get(freq).remove(key);
		if (freq == minFreq && freqToLRUKeys.get(freq).isEmpty())
		{
			freqToLRUKeys.remove(freq);
			++minFreq;
		}

		putFreq(key, freq + 1);
		return keyToVal.get(key);
	}

	public void put(int key, int value)
	{
		if (capacity == 0)
			return;
		if (keyToVal.containsKey(key))
		{
			keyToVal.put(key, value);
			get(key);
			return;
		}

		if (keyToVal.size() == capacity)
		{
			int keyToEvict = freqToLRUKeys.get(minFreq).iterator().next();
			freqToLRUKeys.get(minFreq).remove(keyToEvict);
			keyToVal.remove(keyToEvict);
		}

		minFreq = 1;
		putFreq(key, minFreq);
		keyToVal.put(key, value);
	}

	private void putFreq(int key, int freq)
	{
		keyToFreq.put(key, freq);
		freqToLRUKeys.putIfAbsent(freq, new LinkedHashSet<>());
		freqToLRUKeys.get(freq).add(key);
	}
}

public class LFUCache
{

	public static void main(String[] args)
	{
		LFU lfu = new LFU(2);
		lfu.put(1, 1); // cache=[1,_], cnt(1)=1
		lfu.put(2, 2); // cache=[2,1], cnt(2)=1, cnt(1)=1

		System.out.println(lfu.get(1)); // return 1
		// cache=[1,2], cnt(2)=1, cnt(1)=2

		lfu.put(3, 3); // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
						// cache=[3,1], cnt(3)=1, cnt(1)=2

		System.out.println(lfu.get(2)); // return -1

		System.out.println(lfu.get(3)); // return 3
		// cache=[3,1], cnt(3)=2, cnt(1)=2

		lfu.put(4, 4); // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
						// cache=[4,3], cnt(4)=1, cnt(3)=2

		System.out.println(lfu.get(1)); // return -1

		System.out.println(lfu.get(3)); // return 3
		// cache=[3,4], cnt(4)=1, cnt(3)=3

		System.out.println(lfu.get(4)); // return 4
		// cache=[4,3], cnt(4)=2, cnt(3)=3
	}

}
