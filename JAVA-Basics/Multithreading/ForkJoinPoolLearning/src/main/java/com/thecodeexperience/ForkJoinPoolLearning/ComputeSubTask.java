package com.thecodeexperience.ForkJoinPoolLearning;

import java.util.concurrent.RecursiveTask;

public class ComputeSubTask extends RecursiveTask<Integer> {
    int start;
    int end;

    ComputeSubTask(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        System.out.printf("Task running on thread: %s%n", Thread.currentThread().getName());
        if(end-start<=4){
            int totalSum=0;
            for(int i=start;i<=end;i++){
                totalSum += i;
            }
            return totalSum;
        }
        else{
            int mid = (start+end)/2;
            ComputeSubTask leftTask = new ComputeSubTask(start,mid);
            ComputeSubTask rightTask = new ComputeSubTask(mid+1, end);

            leftTask.fork();
            rightTask.fork();

            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            return leftResult+rightResult;
        }
    }
}
