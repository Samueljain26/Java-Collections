package com.bridgelabz.mapinterface;

import java.util.*;

public class MaxValue {
    public static String findMax(Map<String, Integer> map) {
        if (map.isEmpty()) {
            System.out.println("Empty");
        }

        String maxKey = null;
        int maxValue = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 8);
        inputMap.put("C", 35);

        System.out.println("Key with max value: " + findMax(inputMap));
    }
}
/*Key with max value: C
 */