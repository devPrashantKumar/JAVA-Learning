package com.prashant.example4;

import java.util.Map;


public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> map = Map.of(30, "Thirty", 80, "Eighty", 17, "Seventeen");
		System.out.println("This set is an unmodifiable map");
		System.out.println("Contents of map are: " + map);
		
		System.out.println("Modification of map is not allowed");
		// map.put(80, "Ten");
		
		System.out.println("Addition of new element to map is not allowed");
		// map.put(90, "Ninety");
		
		System.out.println("Removal of element from map is not allowed");
		// map.remove("80);

		System.out.println("Clear map is not allowed");
		// map.clear();
	}
}
