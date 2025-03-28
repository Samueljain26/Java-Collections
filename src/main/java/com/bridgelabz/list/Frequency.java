package com.bridgelabz.list;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        List<String> list = createList();
        System.out.println("Elements of list: " + list);

        Map<String, Integer> frequencyMap = getFrequencyMap(list);
        System.out.println("Frequency of elements: " + frequencyMap);
    }

    static List<String> createList() {
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Banana");
        return list;
    }

    static Map<String, Integer> getFrequencyMap(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : list) {
            frequencyMap.put(item, Collections.frequency(list, item));
        }
        return frequencyMap;
    }
}
/*Elements of list: [Apple, Mango, Apple, Banana, Banana]
Frequency of elements: {Apple=2, Mango=1, Banana=2}
 */