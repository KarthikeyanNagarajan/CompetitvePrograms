package com.karthik.practice.LinkedList.Q45_LRUCache;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class LRU
{
	private int capacity;
	private Map<Integer, Integer> cache;
	private Set<Integer> use;

	public LRU(int capacity)
	{
		this.capacity = capacity;
		this.cache = new HashMap<>();
		this.use = new LinkedHashSet<>();
	}

	public int get(int key)
	{
		if (!cache.containsKey(key))
			return -1;

		use.remove(key);
		use.add(key);
		return cache.get(key);
	}

	public void put(int key, int value)
	{
		if (cache.containsKey(key))
			use.remove(key);
		else if (cache.size() >= capacity)
		{
			int lru = use.iterator().next();
			use.remove(lru);
			cache.remove(lru);
		}

		cache.put(key, value);
		use.add(key);
	}
}

public class LRUCache
{
	public static void main(String[] args)
	{
		LRU lRUCache = new LRU(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}

		System.out.println(lRUCache.get(1));

		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}

		System.out.println(lRUCache.get(2));

		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}

		System.out.println(lRUCache.get(1));
		System.out.println(lRUCache.get(3));
		System.out.println(lRUCache.get(4));
	}

}
