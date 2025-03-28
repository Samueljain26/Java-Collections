package com.bridgelabz.listinterface;

import java.util.*;

public class ElementFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = createList();
        System.out.println("Enter the Nth element from the end: ");
        int n = sc.nextInt();
        System.out.print("Elements of list: " + ls);
        getEndElement(n,ls);

    }

    static List<Integer> createList() {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new LinkedList<>();
        System.out.println("Enter the elements in list || enter 0 to exit: ");
        int n = sc.nextInt();

        while (n != 0) {
            ls.add(n);
            n = sc.nextInt();
        }
        return ls;
    }

    static void getEndElement(int n, List<Integer> ls) {
    int k =ls.size() -n;
        System.out.println("\nElement at end from "+ n + " is: "+ ls.get(k));
    }
}
/*Enter the elements in list || enter 0 to exit:
1
2
3
4
5
0
Enter the Nth element from the end:
2
Elements of list: [1, 2, 3, 4, 5]
Element at end from 2 is: 4
 */