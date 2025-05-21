package com.prashant;

import java.io.IOException;

import com.prashant.service.Operation;


public class Test2 {
	public static void main(String[] args) {
		try {
			Operation operation = new Operation() {
				@Override
				public int divide(int num1, int num2) throws IOException {
					if (num2 == 0) {
						throw new IOException("Cannot divide " + num1 + " by " + num2);
					}
					return num1 / num2;
				}
			};
			int result = operation.divide(10, 0);
			System.out.println(result);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}