package com.thecodeexperience.demo5;

import com.thecodeexperience.demo5.utility.MyThread;


public class Demo extends Thread {
	public static void main(String[] args) {
		Thread thread = new MyThread();
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Executing " + Thread.currentThread().getName());
	}
}
