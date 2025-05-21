package com.prashant.service.impl;

import java.io.IOException;

import com.prashant.service.Operation;


public class OperationImpl implements Operation {
	@Override
	public int divide(int num1, int num2) throws IOException {
		if (num2 == 0) {
			throw new IOException("Cannot divide " + num1 + " by " + num2);
		}
		return num1 / num2;
	}
}