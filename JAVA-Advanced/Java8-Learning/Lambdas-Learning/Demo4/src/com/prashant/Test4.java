package com.prashant;

import java.time.LocalDateTime;
import java.util.function.Supplier;


public class Test4 {
	public static void main(String[] args) {
		Supplier<LocalDateTime> operation = () -> LocalDateTime.now();
		LocalDateTime result = operation.get();
		System.out.println(result);
	}
}