package com.prashant;

import java.util.function.BiFunction;


public class Test4 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> operation = (num1, num2) -> num1 / num2;
		int result = operation.apply(10, 5);
		System.out.println(result);
	}
}