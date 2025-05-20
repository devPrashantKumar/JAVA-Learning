package com.scaleupindia.utility;


public class MyThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("Executing " + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}