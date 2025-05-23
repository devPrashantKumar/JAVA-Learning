package com.prashant.example2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Demo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Python");
		set.add("C");

		System.out.println("---enhanced for loop---");
		for (String element : set)
			System.out.println("Value of element is: " + element);

		System.out.println("---using iterator---");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext())
			System.out.println("Value of element is: " + iterator.next());
	}
}
