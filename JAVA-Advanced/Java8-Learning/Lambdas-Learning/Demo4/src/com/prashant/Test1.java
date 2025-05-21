package com.prashant;

import java.time.LocalDateTime;

import com.prashant.service.Operation;
import com.prashant.service.impl.OperationImpl;


public class Test1 {
	public static void main(String[] args) {
		Operation operation = new OperationImpl();
		LocalDateTime result = operation.generate();
		System.out.println(result);
	}
}