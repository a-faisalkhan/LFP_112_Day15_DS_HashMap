package com.bridgelabz.hashtable.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.bridgelabz.hashtable.MyHashMap;
import com.bridgelabz.hashtable.MyHashTable;
import com.bridgelabz.hashtable.node.INode;
import com.bridgelabz.hashtable.node.MyMapNode;

public class MyHashMapTest {

	public void testFrequencyOfWords() {

		String str = "To be or not to be";

		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

		String[] words = str.split(" ");

		for (String s : words) {
			if (myHashMap.get(s.toLowerCase()) != null) {
				myHashMap.add(s.toLowerCase(),
						myHashMap.get(s.toLowerCase()) + 1);
			} else {
				myHashMap.add(s.toLowerCase(), 1);
			}
		}

		for (String s : words) {
			System.out.println(s.toLowerCase() + " : "
					+ myHashMap.get(s.toLowerCase()));
		}

		assertEquals(2, myHashMap.get("to"));
		System.out.println(myHashMap);
		System.out.println(
				"Hashmap size : " + myHashMap.size());
	}

	@Test
	public void testHashTable() {
		MyHashTable<String, Integer> ht = new MyHashTable<>(
				10);

		String str = "Paranoids are not paranoid because they are "
				+ "paranoid but because they keep putting themselves "
				+ "deliberately into paranoid avoidable situations";

		String[] words = str.split(" ");

		for (String s : words) {
			if (ht.get(s.toLowerCase()) != null) {
				ht.add(s.toLowerCase(),
						ht.get(s.toLowerCase()) + 1);
			} else {
				ht.add(s.toLowerCase(), 1);
			}
		}

		ht.printAllList();
		System.out.println(ht.size());
		System.out.println(ht.remove("avoidable"));
		ht.printAllList();
		System.out.println(ht.size());
		System.out.println(ht.isEmpty());
	}
}
