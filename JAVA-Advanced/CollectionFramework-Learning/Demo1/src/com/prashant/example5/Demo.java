package com.prashant.example5;

import java.util.Arrays;
import java.util.List;


public class Demo {
	public static void main(String[] args) {
		String[] array = { "Java", "Python", "C" };
		List<String> list = Arrays.asList(array);

		System.out.println("This list is backed by array");
		System.out.println("Contents of list are: " + list);
		for (String element : array) {
			System.out.println("Value of element is: " + element);
		}

		System.out.println("Modifying list will modify array also");
		list.set(2, "SQL");
		System.out.println("Contents of list are: " + list);
		for (String element : array) {
			System.out.println("Value of element is: " + element);
		}

		System.out.println("Modifying array will modify list also");
		array[1] = "JavaScript";
		System.out.println("Contents of list are: " + list);
		for (String element : array) {
			System.out.println("Value of element is: " + element);
		}
		
		System.out.println("Addition of new element to list is not allowed");
		//list.add("C#");
		
		System.out.println("Removal of element from list is not allowed");
		//list.remove("Java");

		System.out.println("Clear list is not allowed");
		//list.clear();
	}
}
