package com.prashant;

import java.util.function.Consumer;


public class Test4 {
	public static void main(String[] args) {
		Consumer<Integer> operation = num -> System.out.println("You are learning Java - " + num);
		operation.accept(17);
	}
}