package com.prashant.service.impl;

import com.prashant.service.Operation;


public class OperationImpl implements Operation {
	@Override
	public void print(int num) {
		System.out.println("You are learning Java - " + num);
	}
}