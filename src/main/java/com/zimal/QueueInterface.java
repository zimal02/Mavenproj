package com.zimal;
import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // add elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // peek() → front element
        System.out.println("Front element: " + queue.peek());

        // remove() → dequeue
        System.out.println("Removed element: " + queue.remove());

        System.out.println("Queue after remove: " + queue);

        // isEmpty()
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Max Priority Queue (largest first)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Queue: " + pq);

        System.out.println("Peek (largest): " + pq.peek());

        System.out.println("Removed: " + pq.remove());

        System.out.println("After remove: " + pq);
    }
    }

