package com.scaleupindia;


public class Demo1 implements Runnable {
	public static void main(String[] args) {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			Runnable runnable = new Demo1();
			Thread thread = new Thread(runnable);
			thread.start();
		}
	}

	@Override
	public void run() {
		try {
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
