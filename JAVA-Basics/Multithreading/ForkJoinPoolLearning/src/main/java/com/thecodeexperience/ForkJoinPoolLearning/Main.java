package com.thecodeexperience.ForkJoinPoolLearning;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());

        ForkJoinPool ex = (ForkJoinPool) Executors.newWorkStealingPool();
        Future<Integer> future1 = ex.submit(new ComputeSubTask(0,100));

        try {
            System.out.println(future1.get());
        } catch (Exception e) {

        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {

        }
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> futureObj = pool.submit(new ComputeSubTask(0,100));

        try {
            System.out.println(futureObj.get());
        } catch (Exception e) {

        }

    }
}
