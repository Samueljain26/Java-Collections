package com.bridgelabz.setinterface;

import java.util.*;

public class Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = getSet(sc, "Set 1");
        Set<Integer> set2 = getSet(sc, "Set 2");

        // Check if Set1 is a subset of Set2
        boolean isSubset = set2.containsAll(set1);

        System.out.println("Subset: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Is Set 1 a subset of Set 2? " + isSubset);

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
/* Enter elements for Set 1 (Enter 0 to stop):
1 3 0
Enter elements for Set 2 (Enter 0 to stop):
1 2 3 4 0
Subset: [1, 3]
Set 2: [1, 2, 3, 4]
Is Set 1 a subset of Set 2? true
 */