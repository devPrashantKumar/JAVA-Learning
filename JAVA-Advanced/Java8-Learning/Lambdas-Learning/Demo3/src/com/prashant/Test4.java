package com.prashant;

import java.util.function.Consumer;
import java.util.function.Function;


public class Test4 {
	public static void main(String[] args) {
		Consumer<Integer> operation = num -> System.out.println("You are learning Java - " + num);
		operation.accept(17);

		// Function<Integer, Void> operation2 = num -> System.out.println("You are learning Java - " + num);
		// operation2.apply(17);
	}
}