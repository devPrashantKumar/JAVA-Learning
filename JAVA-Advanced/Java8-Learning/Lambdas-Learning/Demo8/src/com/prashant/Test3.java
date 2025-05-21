package com.prashant;

import java.io.IOException;

import com.prashant.service.Operation;


public class Test3 {
	public static void main(String[] args) {
		try {
			Operation operation = (num1, num2) -> {
				if (num2 == 0) {
					throw new IOException("Cannot divide " + num1 + " by " + num2);
				}
				return num1 / num2;
			};
			int result = operation.divide(10, 0);
			System.out.println(result);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}