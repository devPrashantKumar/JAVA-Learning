package com.thecodeexperience.demo4.service.impl;

import com.thecodeexperience.demo4.service.CounterService;


public class CounterServiceImpl implements CounterService {
	private int count;

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void incrementCount() {
		++count;
	}
}
