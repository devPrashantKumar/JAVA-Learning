package com.prashant.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Demo {
	public static void main(String[] args) {
		System.out.println("Create a set");
		Set<String> set = new HashSet<>();

		System.out.println("Find size of set");
		System.out.println("Size of set is: " + set.size());
		
		System.out.println("Display set");
		System.out.println("Contents of set are: " + set);
		
		System.out.println("Add element to set");
		set.add("Java");
		set.add("Python");
		set.add("C");
		System.out.println("Size of set is: " + set.size());
		System.out.println("Contents of set are: " + set);
		
		System.out.println("Remove element by value from set");
		set.remove("Python");
		System.out.println("Size of set is: " + set.size());
		System.out.println("Contents of set are: " + set);
				
		System.out.println("Check if set contains element");
		String searchableItem = "Java";
		if (set.contains(searchableItem)) {
			System.out.println("Set contains element: " + searchableItem);
		}
		
		System.out.println("Clear set");
		set.clear();
		System.out.println("Size of set is: " + set.size());
		System.out.println("Contents of set are: " + set);
		
		System.out.println("Check if set is empty");
		if (set.isEmpty()) {
			System.out.println("Set is empty");
		}
		
		System.out.println("Add elements to set");
		List<String> list = Arrays.asList("JavaScript", "C#", "Java");
		set.addAll(list);
		System.out.println("Size of set is: " + set.size());
		System.out.println("Contents of set are: " + set);
		List<String> list2 = Arrays.asList("Python", "Java", "C");
		set.addAll(list2);
		System.out.println("Size of set is: " + set.size());
		System.out.println("Contents of set are: " + set);
		
		System.out.println("Sort elements of set");
		List<String> list3 = new ArrayList<>(set);
		System.out.println("Contents of list are: " + list3);		
		Collections.sort(list3);
		System.out.println("Contents of sorted list are: " + list3);
	}
}
