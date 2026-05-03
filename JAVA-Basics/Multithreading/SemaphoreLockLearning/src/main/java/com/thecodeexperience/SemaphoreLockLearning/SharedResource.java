package com.thecodeexperience.SemaphoreLockLearning;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(Semaphore lock){
        try {
            lock.acquire();
            System.out.println("Lock acquired by: "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }
        catch (Exception e){

        }
        finally {
            System.out.println("Lock released by: "+Thread.currentThread().getName());
            lock.release();
        }
    }

}
