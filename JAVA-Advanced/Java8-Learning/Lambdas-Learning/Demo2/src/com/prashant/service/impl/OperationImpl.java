package com.prashant.service.impl;

import com.prashant.service.Operation;


public class OperationImpl implements Operation {
	@Override
	public boolean isPositive(int num) {
		return num >= 0;
	}
}