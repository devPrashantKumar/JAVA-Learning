package com.prashant.service.impl;

import com.prashant.service.Operation;


public class OperationImpl implements Operation {
	@Override
	public boolean isGreater(int num1, int num2) {
		return num1 > num2;
	}
}