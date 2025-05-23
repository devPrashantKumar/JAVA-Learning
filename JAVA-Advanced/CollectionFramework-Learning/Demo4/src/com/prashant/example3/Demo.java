package com.prashant.example3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(30, "Thirty");
		hashMap.put(80, "Eighty");
		hashMap.put(17, "Seventeen");
		hashMap.put(56, "Fifty Six");
		hashMap.put(34, "Thirty Four");
		hashMap.put(90, "Ninety");
		hashMap.put(2, "Two");
		hashMap.put(null, "a");
		hashMap.put(null, "b");
		System.out.println("Contents of HashMap are: " + hashMap);

		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(30, "Thirty");
		linkedHashMap.put(80, "Eighty");
		linkedHashMap.put(17, "Seventeen");
		linkedHashMap.put(56, "Fifty Six");
		linkedHashMap.put(34, "Thirty Four");
		linkedHashMap.put(90, "Ninety");
		linkedHashMap.put(2, "Two");
		linkedHashMap.put(null, "a");
		linkedHashMap.put(null, "b");
		System.out.println("Contents of LinkedHashMap are: " + linkedHashMap);

		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(30, "Thirty");
		treeMap.put(80, "Eighty");
		treeMap.put(17, "Seventeen");
		treeMap.put(56, "Fifty Six");
		treeMap.put(34, "Thirty Four");
		treeMap.put(90, "Ninety");
		treeMap.put(2, "Two");
		//treeMap.put(null, "a");
		//treeMap.put(null, "b");
		System.out.println("Contents of TreeMap are: " + treeMap);
	}
}
