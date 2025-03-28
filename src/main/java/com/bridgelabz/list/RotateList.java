package com.bridgelabz.list;

import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = createList(sc);
        System.out.println("Enter the number of positions to rotate: ");
        int k=sc.nextInt();
        System.out.println("Elements in list: :" + ls);
        Collections.rotate(ls, -k);
        System.out.println("Rotated list: " + ls);
    }

    static List<Integer> createList(Scanner sc){
        List<Integer> ls = new LinkedList<>();
        System.out.println("Enter the elements in list || enter 0 to exit: ");
        int n =sc.nextInt();

        while(n!=0){
            ls.add(n);
            n=sc.nextInt();
        }
        return ls;
    }
}
/*Elements in list: :[1, 4, 7, 3]
Rotated list: [7, 3, 1, 4]
 */