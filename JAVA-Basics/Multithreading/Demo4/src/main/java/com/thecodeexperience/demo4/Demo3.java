package com.thecodeexperience.demo4;

import com.thecodeexperience.demo4.service.CounterService;
import com.thecodeexperience.demo4.service.impl.CounterServiceImpl2;


public class Demo3 extends Thread {
	private static final int NUM_THREADS = 20;
	private static final int NUM_INCREMENTS = 1000;
	private CounterService counterUtil;

	public Demo3(CounterService counterUtil) {
		this.counterUtil = counterUtil;
	}

	public static void main(String[] args) throws InterruptedException {
		CounterService counterUtil = null;
		do {
			Thread[] threads = new Thread[NUM_THREADS];
			counterUtil = new CounterServiceImpl2();
			for (int i = 0; i < NUM_THREADS; ++i) {
				threads[i] = new Demo3(counterUtil);
				threads[i].start();
			}
			for (int i = 0; i < NUM_THREADS; ++i) {
				threads[i].join();
			}
			System.out.println("Actual count = " + counterUtil.getCount() + " vs. Expected count = "
					+ (NUM_THREADS * NUM_INCREMENTS));
		} while (counterUtil.getCount() != (NUM_THREADS * NUM_INCREMENTS));
	}

	@Override
	public void run() {
		for (int i = 0; i < NUM_INCREMENTS; ++i) {
			counterUtil.incrementCount();
		}
	}
}
