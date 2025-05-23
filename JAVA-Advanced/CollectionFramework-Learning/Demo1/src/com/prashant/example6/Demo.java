package com.prashant.example6;

import java.util.List;


public class Demo {
	public static void main(String[] args) {
		List<String> list = List.of("Java", "Python", "C");

		System.out.println("This list is an unmodifiable list");
		System.out.println("Contents of list are: " + list);

		System.out.println("Modification of list is not allowed");
		// list.set(2, "SQL");

		System.out.println("Addition of new element to list is not allowed");
		// list.add("C#");

		System.out.println("Removal of element from list is not allowed");
		// list.remove("C#");

		System.out.println("Clear list is not allowed");
		// list.clear();
	}
}
