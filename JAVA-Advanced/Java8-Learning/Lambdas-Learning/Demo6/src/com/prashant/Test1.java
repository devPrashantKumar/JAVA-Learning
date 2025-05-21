package com.prashant;

import com.prashant.service.Operation;
import com.prashant.service.impl.OperationImpl;


public class Test1 {
	public static void main(String[] args) {
		Operation operation = new OperationImpl();
		boolean result = operation.isGreater(10, 5);
		System.out.println(result);
	}
}