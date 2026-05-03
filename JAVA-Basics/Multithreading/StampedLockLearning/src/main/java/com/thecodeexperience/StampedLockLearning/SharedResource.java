package com.thecodeexperience.StampedLockLearning;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int a = 10;

    public void producer(StampedLock lock){
        long stamp = lock.tryOptimisticRead();
        try{
            System.out.println("Optimistic lock is taken");
            a = 11;
            Thread.sleep(2000);
            if(lock.validate(stamp)){
                System.out.println("perform update operation successfully "+Thread.currentThread().getName());
            }else{
                System.out.println("rollback of work "+Thread.currentThread().getName());
                a = 10;
            }
        } catch (Exception e) {

        }
    }

    public void consumer(StampedLock lock){
        long stamp = lock.writeLock();
        try {
            System.out.println("Lock acquired by: "+ Thread.currentThread().getName());
            a = 15;
            Thread.sleep(3000);
        }
        catch (Exception e){

        }
        finally {
            System.out.println("Lock released by: "+Thread.currentThread().getName());
            lock.unlockWrite(stamp);
        }
    }

}
