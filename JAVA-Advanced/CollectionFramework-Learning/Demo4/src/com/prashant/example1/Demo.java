package com.prashant.example1;

import java.util.HashMap;
import java.util.Map;


public class Demo {
	public static void main(String[] args) {
		System.out.println("Create a map");
		Map<Integer, String> map = new HashMap<>();
		
		System.out.println("Find size of map");
		System.out.println("Size of map is: " + map.size());
		
		System.out.println("Display map");
		System.out.println("Contents of map are: " + map);
		
		System.out.println("Add key value to map");
		map.put(10, "Java");
		map.put(2, "Python");
		map.put(45, "C");
		System.out.println("Size of map is: " + map.size());
		System.out.println("Contents of map are: " + map);
		
		System.out.println("Fetch value by key from map");
		System.out.println("Element at key 2 is: " + map.get(2));
		
		System.out.println("Modify value by key from map");
		map.put(2, "SQL");
		System.out.println("Size of map is: " + map.size());
		System.out.println("Contents of map are: " + map);
		
		System.out.println("Remove value by key from map");
		map.remove(2);
		System.out.println("Size of map is: " + map.size());
		System.out.println("Contents of map are: " + map);
		
		System.out.println("Check if map contains key");
		Integer searchableKey = 10;
		if (map.containsKey(searchableKey)) {
			System.out.println("Map contains key: " + searchableKey);
		}
		
		System.out.println("Check if map contains value");
		String searchableValue = "Java";
		if (map.containsValue(searchableValue)) {
			System.out.println("Map contains value: " + searchableValue);
		}
		
		System.out.println("Clear map");
		map.clear();
		System.out.println("Size of map is: " + map.size());
		System.out.println("Contents of map are: " + map);
		
		System.out.println("Check if map is empty");
		if (map.isEmpty()) {
			System.out.println("Map is empty");
		}
	}
}
