package com.path.seekers.learning;

public class HashTableMainClass {

	public static void main(String[] args) {

		Employee e1 = new Employee("Shubham", "Bhusri", 1);
		Employee e2 = new Employee("Ved", "Bhusri", 2);
		Employee e3 = new Employee("Payal", "Bhusri", 3);
		Employee e4 = new Employee("Anita", "Bhusri", 4);

		SimpleHashTable hashTable = new SimpleHashTable();
		hashTable.put("Shubham", e1);
		hashTable.put("Ved", e2);
		hashTable.put("Anita", e3);
		hashTable.put("Payal", e4);

		hashTable.printHashTable();
	}
}
