package com.scaleupindia.service.impl;

import java.util.concurrent.atomic.AtomicInteger;

import com.scaleupindia.service.CounterService;


public class CounterServiceImpl4 implements CounterService {
	private AtomicInteger count = new AtomicInteger(0);

	@Override
	public int getCount() {
		return count.get();
	}

	@Override
	public void incrementCount() {
		count.incrementAndGet();
	}
}
