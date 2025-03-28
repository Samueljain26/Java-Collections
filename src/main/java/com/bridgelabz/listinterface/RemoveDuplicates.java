package com.bridgelabz.listinterface;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Set<Integer> ls = new HashSet<>();
        System.out.println("Enter the elements || enter 0 to exit writing- ");
        int n=sc.nextInt();
        while(n!=0){
            ls.add(n);
            n=sc.nextInt();
        }
        System.out.print("New list: " +ls);
    }
}
/*Enter the elements || enter 0 to exit writing-
1
4
6
2
1
2
0
New list: [1, 2, 4, 6]
 */