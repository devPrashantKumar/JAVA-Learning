package com.prashant.service.impl;

import com.prashant.service.Operation;


public class OperationImpl implements Operation {
	@Override
	public int increment(int num) {
		return ++num;
	}
}