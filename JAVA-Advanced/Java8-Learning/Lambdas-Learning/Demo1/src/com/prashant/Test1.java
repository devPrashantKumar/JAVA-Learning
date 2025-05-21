package com.prashant;

import com.prashant.service.Operation;
import com.prashant.service.impl.OperationImpl;


public class Test1 {
	public static void main(String[] args) {
		// Create an object of Operation
		Operation operation = new OperationImpl();
		// invoke increment method and save output in result variable
		int result = operation.increment(10);
		// print result variable
		System.out.println(result);
	}
}