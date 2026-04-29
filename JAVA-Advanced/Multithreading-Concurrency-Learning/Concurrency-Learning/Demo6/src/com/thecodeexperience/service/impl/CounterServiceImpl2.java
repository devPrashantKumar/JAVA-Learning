package com.thecodeexperience.service.impl;

import com.thecodeexperience.service.CounterService;


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
