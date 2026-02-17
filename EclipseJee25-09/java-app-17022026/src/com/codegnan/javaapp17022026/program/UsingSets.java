package com.codegnan.javaapp17022026.program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class UsingSets {
	public static void main(String[] args) {
		
		// HashSet --> Unordered, Unique values: No Duplicates of same object type, No position-based access
		HashSet hashSet = new HashSet();
		hashSet.add(10); 
		hashSet.add(20);
		hashSet.add("Anuj");
		hashSet.add("anuj");
		hashSet.add(true);
		hashSet.add(10);
		hashSet.add("10");
		hashSet.add('e');
		System.out.println(hashSet);
		
		// LinkedHashSet --> Insertion Order maintained, Unique values: No Duplicates of same object type, No position-based access
		LinkedHashSet linkHashSet = new LinkedHashSet();
		linkHashSet.add(10);
		linkHashSet.add(20);
		linkHashSet.add("Anuj");
		linkHashSet.add("anuj");
		linkHashSet.add(true);
		linkHashSet.add(10);
		linkHashSet.add("10");
		linkHashSet.add('e');
		System.out.println(linkHashSet);
		
		// TreeSet --> Sorted(natural-order), Unique values: No Duplicates of same object type, No position-based access
		TreeSet treeSet1 = new TreeSet();
		treeSet1.add(10);
		treeSet1.add(50);
		treeSet1.add(30);
		treeSet1.add(20);
		treeSet1.add(10);
		treeSet1.add(90);
		System.out.println(treeSet1);
		
		TreeSet treeSet2 = new TreeSet();
		treeSet2.add('a');
		treeSet2.add('z');
		treeSet2.add('h');
		treeSet2.add('a');
		treeSet2.add('b');
		treeSet2.add('c');
		System.out.println(treeSet2);
		
		TreeSet treeSet3 = new TreeSet();
		treeSet3.add("Bac");
		treeSet3.add("bac");
		treeSet3.add("ABC");
		treeSet3.add("abc");
		treeSet3.add("ABC");
		treeSet3.add("CBa");
		System.out.println(treeSet3);
		
	}
}
