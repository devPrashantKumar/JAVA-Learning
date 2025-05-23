package com.prashant.example4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Demo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Java");
		hashSet.add("is");
		hashSet.add("good");
		hashSet.add("You");
		hashSet.add("should");
		hashSet.add("learn");
		hashSet.add("this");
		System.out.println("Contents of HashSet are: " + hashSet);

		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Java");
		linkedHashSet.add("is");
		linkedHashSet.add("good");
		linkedHashSet.add("You");
		linkedHashSet.add("should");
		linkedHashSet.add("learn");
		linkedHashSet.add("this");
		System.out.println("Contents of LinkedHashSet are: " + linkedHashSet);

		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Java");
		treeSet.add("is");
		treeSet.add("good");
		treeSet.add("You");
		treeSet.add("should");
		treeSet.add("learn");
		treeSet.add("this");
		System.out.println("Contents of TreeSet are: " + treeSet);
	}
}
