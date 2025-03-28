package com.bridgelabz.setinterface;

import java.util.*;

public class SortedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = getSet(sc);

        // Convert to list and sort
        List<Integer> sortedList = new LinkedList<>(set);
        Collections.sort(sortedList);

        System.out.println("Original Set: " + set);
        System.out.println("Sorted List: " + sortedList);

        sc.close();
    }

    static Set<Integer> getSet(Scanner sc) {
        System.out.println("Enter elements for the set (Enter 0 to stop):");
        Set<Integer> set = new LinkedHashSet<>();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            set.add(n);
        }
        return set;
    }
}
/* Enter elements for the set (Enter 0 to stop):
1 4 7 2 9 0
Original Set: [1, 4, 7, 2, 9]
Sorted List: [1, 2, 4, 7, 9]
 */