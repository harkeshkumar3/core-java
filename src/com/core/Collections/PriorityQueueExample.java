package com.core.Collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(52);
        queue.add(11);
        queue.add(10);
        queue.add(22);
        queue.add(5);
        queue.add(12);
        queue.add(2);

//        while (queue.isEmpty() == false) {
//            queue.remove();
//            System.out.println(queue.remove());
//        }
        while (queue.isEmpty() == false)
            System.out.printf("%d ", queue.remove());

        System.out.println("\n");

    }
}
