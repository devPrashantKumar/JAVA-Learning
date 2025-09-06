package com.thecodeexperience;

public class MyThreadByExtendingThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println("Current Thread - "+Thread.currentThread().getName());

    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThreadByExtendingThreadClass();
        System.out.println("Current Thread - "+Thread.currentThread().getName());
        t1.start();
       //  t1.start(); can not be called more than once per Thread

        Thread.sleep(1000);

        MyThreadByExtendingThreadClass t2 = new MyThreadByExtendingThreadClass();
        System.out.println("Current Thread - "+Thread.currentThread().getName());
        t2.run();
    }
}
