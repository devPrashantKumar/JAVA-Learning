package com.prashant.service.impl;

import com.prashant.service.Operation;


public class OperationImpl implements Operation {
	@Override
	public void print(String language, int version) {
		System.out.println("You are learning " + language + " - " + version);
	}
}