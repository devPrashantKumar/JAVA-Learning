package com.prashant.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Demo {
	public static void main(String[] args) {
		System.out.println("Create a list");
		List<String> list = new ArrayList<>(); // 0 1 2
		
		System.out.println("Find size of list");
		System.out.println("Size of list is: " + list.size());
		
		System.out.println("Display list");
		System.out.println("Contents of list are: " + list);
		
		System.out.println("Add element to list (always added at tail)");
		list.add("Java");
		list.add("Python");
		list.add("C");
		System.out.println("Size of list is: " + list.size());
		System.out.println("Contents of list are: " + list);
		
		System.out.println("Add element at given index of list");
		list.add(1, "SQL");
		System.out.println("Size of list is: " + list.size());
		System.out.println("Contents of list are: " + list);
		
		System.out.println("Fetch element by index from list");
		System.out.println("Element at index 2 is: " + list.get(2));
		
		System.out.println("Fetch index by element from list");
		System.out.println("Index of element Python is: " + list.indexOf("Python"));
		
		System.out.println("Modify element by index from list");
		list.set(1, "Go");
		System.out.println("Size of list is: " + list.size());
		System.out.println("Contents of list are: " + list);
		
		System.out.println("Remove element by value from list");
		list.remove("Python");
		System.out.println("Size of list is: " + list.size());
		System.out.println("Contents of list are: " + list);
		
		System.out.println("Remove element by index from list");
		list.remove(1);
		System.out.println("Size of list is: " + list.size());
		System.out.println("Contents of list are: " + list);
				
		System.out.println("Check if list contains element");
		String searchableItem = "Java";
		if (list.contains(searchableItem)) {
			System.out.println("List contains element: " + searchableItem);
		}
		
		System.out.println("Clear list");
		list.clear();
		System.out.println("Size of list is: " + list.size());
		System.out.println("Contents of list are: " + list);
		
		System.out.println("Check if list is empty");
		if (list.isEmpty()) {
			System.out.println("List is empty");
		}
		
		System.out.println("Add elements to list (always added at tail)");
		List<String> list2 = Arrays.asList("JavaScript", "C#", "Java");
		list.addAll(list2);
		System.out.println("Size of list is: " + list.size());
		System.out.println("Contents of list are: " + list);
		
		System.out.println("Add elements at given index of list");
		List<String> list3 = Arrays.asList("Python", "Java", "C");
		list.addAll(1, list3);
		System.out.println("Size of list is: " + list.size());
		System.out.println("Contents of list are: " + list);
		
		System.out.println("Sort elements of list");
		Collections.sort(list);
		System.out.println("Contents of sorted list are: " + list);
		
		System.out.println("Exception scenario");
		list.add(10, "execption");	
	}
}
