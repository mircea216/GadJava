package com.company.collections;

import java.util.*;

public class Main {
    public static void createSet() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 5, 5));
        Collection<Integer> set = new HashSet<>(list);
        System.out.println(set);

    }

    public static void createMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(5, "five");
        System.out.println(map);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        createSet();
        createMap();
    }
}
