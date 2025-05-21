package com.prashant;

import java.util.function.BiConsumer;


public class Test4 {
	public static void main(String[] args) {
		BiConsumer<String, Integer> operation = (language, version) -> System.out.println("You are learning " + language + " - " + version);
		operation.accept("Java", 17);
	}
}