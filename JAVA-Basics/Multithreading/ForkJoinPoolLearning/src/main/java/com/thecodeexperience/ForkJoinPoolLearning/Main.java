package com.thecodeexperience.ForkJoinPoolLearning;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ForkJoinPool ex = (ForkJoinPool) Executors.newWorkStealingPool();
        Future<Integer> future1 = ex.submit(new ComputeSubTask(0,100));

        try {
            System.out.println(future1.get());
        } catch (Exception e) {

        }

        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> futureObj = pool.submit(new ComputeSubTask(0,100));

        try {
            System.out.println(futureObj.get());
        } catch (Exception e) {

        }

    }
}
