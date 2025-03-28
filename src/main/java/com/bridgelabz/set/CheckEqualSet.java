package com.bridgelabz.set;

import java.util.*;

public class CheckEqualSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = getSet(sc, "Set 1");
        Set<Integer> set2 = getSet(sc, "Set 2");

        boolean areEqual = set1.equals(set2);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Are sets equal? " + areEqual);

        sc.close();
    }

    static Set<Integer> getSet(Scanner sc, String setName) {
        System.out.println("Enter elements for " + setName + " (Enter 0 to stop):");
        Set<Integer> set = new HashSet<>();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            set.add(n);
        }
        return set;
    }
}
/*Enter elements for Set 1 (Enter 0 to stop):
1 2 3 4
0
Enter elements for Set 2 (Enter 0 to stop):
1 2 3 4
0
Set 1: [1, 2, 3, 4]
Set 2: [1, 2, 3, 4]
Are sets equal? true
 */