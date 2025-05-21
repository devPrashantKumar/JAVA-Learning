package com.prashant;

import java.time.LocalDateTime;

import com.prashant.service.Operation;


public class Test3 {
	public static void main(String[] args) {
		Operation operation = () -> LocalDateTime.now();
		LocalDateTime result = operation.generate();
		System.out.println(result);
	}
}