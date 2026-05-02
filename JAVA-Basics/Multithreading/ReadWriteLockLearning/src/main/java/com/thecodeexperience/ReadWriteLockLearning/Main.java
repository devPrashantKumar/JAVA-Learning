package com.thecodeexperience.ReadWriteLockLearning;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {

        ReadWriteLock lock = new ReentrantReadWriteLock();

        SharedResource resource1 = new SharedResource();
        Thread th1 = new Thread(()->{
            resource1.producer(lock);
        });

        SharedResource resource2 = new SharedResource();
        Thread th2 = new Thread(()->{
            resource2.producer(lock);
        });

        SharedResource resource3 = new SharedResource();
        Thread th3 = new Thread(()->{
            resource3.consumer(lock);
        });

        th1.start();
        th2.start();
        th3.start();
    }
}