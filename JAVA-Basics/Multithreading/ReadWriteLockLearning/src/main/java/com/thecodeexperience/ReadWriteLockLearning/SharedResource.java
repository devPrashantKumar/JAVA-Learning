package com.thecodeexperience.ReadWriteLockLearning;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(ReadWriteLock lock){
        try {
            lock.readLock().lock();
            System.out.println("Lock acquired by: "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }
        catch (Exception e){

        }
        finally {
            System.out.println("Lock released by: "+Thread.currentThread().getName());
            lock.readLock().unlock();
        }
    }

    public void consumer(ReadWriteLock lock){
        try {
            lock.writeLock().lock();
            System.out.println("Lock acquired by: "+ Thread.currentThread().getName());
            isAvailable = false;
            Thread.sleep(4000);
        }
        catch (Exception e){

        }
        finally {
            System.out.println("Lock released by: "+Thread.currentThread().getName());
            lock.writeLock().unlock();
        }
    }

}
