package com.prashant;

import java.util.function.Function;


public class Test4 {
	public static void main(String[] args) {
		Function<Integer, Integer> operation = num -> ++num;  //Lambda Expression
		int result = operation.apply(10);
		System.out.println(result);
	}
}