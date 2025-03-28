package com.bridgelabz.queue;

import java.util.*;

public class CircularBuffer {
    private Queue<Integer> queue;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }

    public void enqueue(int value) {
        if (queue.size() == capacity) {
            queue.poll(); // Remove oldest element when full
        }
        queue.add(value);
    }

    public int dequeue() {
        return queue.poll(); // Returns null if empty
    }

    public void display() {
        System.out.println("Current Buffer: " + queue);
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.enqueue(1);
        cb.enqueue(2);
        cb.enqueue(3);
        cb.display();

        cb.enqueue(4);
        cb.display();

    }
}
/* Current Buffer: [1, 2, 3]
Current Buffer: [2, 3, 4]
 */
