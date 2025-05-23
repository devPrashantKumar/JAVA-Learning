package com.prashant.example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C");

		System.out.println("---using index---");
		for (int i = 0; i < list.size(); i++)
			System.out.println("Value of element at index " + i + " is: " + list.get(i));

		System.out.println("---enhanced for loop---");
		for (String element : list)
			System.out.println("Value of element is: " + element);

		System.out.println("---using iterator---");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext())
			System.out.println("Value of element is: " + iterator.next());
		
		System.out.println("---using list iterator forward---");
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext())
			System.out.println("Value of element is: " + listIterator.next());
		
		System.out.println("---using list iterator backward---");
		while (listIterator.hasPrevious())
			System.out.println("Value of element is: " + listIterator.previous());
	}
}
