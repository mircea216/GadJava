package com.company.collections.leaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Leader {
    public static void findLeaders(ArrayList<Integer> list) {
        int maxim = list.get(list.size() - 1);
        System.out.println(maxim);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > maxim) {
                maxim = list.get(i);
                System.out.println(maxim);
            }
        }
    }

    public static void reversedFindLeaders(ArrayList<Integer> list) {
        Collections.reverse(list);
        int maxim = list.get(0);
        System.out.println(maxim);
        for (Integer integer : list) {
            if (integer > maxim) {
                maxim = integer;
                System.out.println(maxim);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 0, 3, 12));
        findLeaders(integerList);
        reversedFindLeaders(integerList);
    }
}
