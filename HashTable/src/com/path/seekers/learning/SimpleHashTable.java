package com.path.seekers.learning;

public class SimpleHashTable {

	private Employee[] hashTable;

	public SimpleHashTable() {
		hashTable = new Employee[10];
	}

	// used for putting value in hash table
	public void put(String key, Employee object) {
		int hashKey = hashKey(key);
		if (hashTable[hashKey] != null)
			System.out.println("Sorry there is already an object allocated at that position" + hashTable[hashKey]);

		else
			hashTable[hashKey] = object;
	}

	// used for returning object using key
	public Employee get(String key) {
		int hashKey = hashKey(key);
		return hashTable[hashKey];
	}

	// calculate hash key using this function
	private int hashKey(String key) {
		return key.length() % this.hashTable.length;
	}

	void printHashTable() {
		for (Employee emp : hashTable) {
			System.out.println(emp);
		}
	}
}
