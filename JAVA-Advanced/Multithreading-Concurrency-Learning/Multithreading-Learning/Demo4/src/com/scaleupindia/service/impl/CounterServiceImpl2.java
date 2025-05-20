package com.scaleupindia.service.impl;

import com.scaleupindia.service.CounterService;


public class CounterServiceImpl2 implements CounterService {
	private int count;

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public synchronized void incrementCount() {
		++count;
	}
}
