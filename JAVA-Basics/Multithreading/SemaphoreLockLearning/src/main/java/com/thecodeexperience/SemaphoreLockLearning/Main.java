package com.thecodeexperience.SemaphoreLockLearning;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore lock = new Semaphore(2);

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
            resource3.producer(lock);
        });

        SharedResource resource4 = new SharedResource();
        Thread th4 = new Thread(()->{
            resource4.producer(lock);
        });

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}