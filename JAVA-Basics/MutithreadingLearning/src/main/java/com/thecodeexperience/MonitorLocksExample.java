package com.thecodeexperience;

public class MonitorLocksExample {
    public synchronized void task1(){
        try{
            System.out.println("inside task1");
            Thread.sleep(5000);
            System.out.println("task1 completed");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void task2(){
        System.out.println("task2, but before synchronized");
        synchronized (this){
            System.out.println("task2, inside synchronized");
        }
    }

    public void task3(){
        System.out.println("inside task3");
    }

    public static void main(String[] args) {
        MonitorLocksExample monitorLocksExample = new MonitorLocksExample();
        Thread thread1 = new Thread(()->{monitorLocksExample.task1();});
        Thread thread2 = new Thread(()->{monitorLocksExample.task2();});
        Thread thread3 = new Thread(()->{monitorLocksExample.task3();});

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
