package com.thecodeexperience;

public class MyThreadByImplementingRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("Current Thread - "+Thread.currentThread().getName());

    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThreadByImplementingRunnable());
        System.out.println("Current Thread - "+Thread.currentThread().getName());
        t1.start();
        //  t1.start(); can not be called more than once per Thread

        Thread.sleep(1000);

        MyThreadByExtendingThreadClass t2 = new MyThreadByExtendingThreadClass();
        System.out.println("Current Thread - "+Thread.currentThread().getName());
        t2.run();

        Thread.sleep(1000);

        Thread t3 = new Thread(new MyThreadByImplementingRunnable());
        System.out.println("Current Thread - "+Thread.currentThread().getName());
        t3.run();

    }
}
