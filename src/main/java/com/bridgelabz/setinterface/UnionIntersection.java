package com.bridgelabz.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = getSet(sc, "Set 1");
        Set<Integer> set2 = getSet(sc, "Set 2");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Union
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // Intersection
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);

        sc.close();
    }

    static Set<Integer> getSet(Scanner sc, String setName) {
        System.out.println("Enter elements for " + setName + " (Enter 0 to stop):");
        Set<Integer> set = new HashSet<>();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            set.add(n);
        }
        return set;
    }
}
/*Enter elements for Set 1 (Enter 0 to stop):
1 2 3 4 5
0
Enter elements for Set 2 (Enter 0 to stop):
2 3 4 5 6 7
0
Set 1: [1, 2, 3, 4, 5]
Set 2: [2, 3, 4, 5, 6, 7]
Union: [1, 2, 3, 4, 5, 6, 7]
Intersection: [2, 3, 4, 5]
 */