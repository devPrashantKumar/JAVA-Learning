package com.thecodeexperience;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfacePractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(1000);
        queue.add(10);
        System.out.println(queue);

        System.out.println(queue.poll()); // return removed element in case of success
        System.out.println(queue.remove()); // return removed element in case of success

        System.out.println(queue.poll()); //return null in case of failure
        try {
            System.out.println(queue.remove()); // throws exception in case of failure
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(queue);
    }

}
