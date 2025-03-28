package com.bridgelabz.queue;

import java.util.*;

public class ReverseQueue {
        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter elements for the queue (Enter 0 to stop):");
            while (true) {
                int n = sc.nextInt();
                if (n == 0) break;
                queue.add(n);
            }

            System.out.println("Original Queue: " + queue);
            queue = reverseQueue(queue);

            System.out.println("Reversed Queue: " + queue);
            sc.close();
        }

        public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
            Stack<Integer> stack = new Stack<>();

            while (!queue.isEmpty()) {
                stack.push(queue.poll());
            }

            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
            return queue;
        }
    }
    /* Enter elements for the queue (Enter 0 to stop):
1 4 7 2 9 0
Original Queue: [1, 4, 7, 2, 9]
Reversed Queue: [9, 2, 7, 4, 1]
     */