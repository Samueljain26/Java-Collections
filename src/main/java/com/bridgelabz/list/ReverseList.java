package com.bridgelabz.list;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> ls = createList();
        System.out.print("Elements of list: "+ ls);
        Collections.reverse(ls);
        System.out.print("\nReverse list: "+ ls);
    }
    static List<Integer> createList(){
        Scanner sc = new Scanner(System.in);
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
