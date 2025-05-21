package com.prashant.service.impl;

import java.time.LocalDateTime;

import com.prashant.service.Operation;


public class OperationImpl implements Operation {
	@Override
	public LocalDateTime generate() {
		return LocalDateTime.now();
	}
}