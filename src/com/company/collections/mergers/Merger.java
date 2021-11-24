package com.company.collections.mergers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Merger {
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> toReturn = new ArrayList<>();
        Iterator<Integer> iterator1 = list1.iterator();
        Iterator<Integer> iterator2 = list2.iterator();
        int current1 = iterator1.next();
        int current2 = iterator2.next();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            if (current1 < current2) {
                toReturn.add(current1);
                current1 = iterator1.next();
            } else {
                toReturn.add(current2);
                current2 = iterator2.next();
            }
        }
        Integer last;
        Iterator<Integer> lastIterator;
        if (current1 < current2) {
            toReturn.add(current1);
            last = current2;
        } else {
            toReturn.add(current2);
            last = current1;
        }
        if (iterator1.hasNext()) {
            lastIterator = iterator1;
        } else {
            lastIterator = iterator2;
        }
        Integer current;
        while (lastIterator.hasNext()) {
            current = lastIterator.next();
            if (last != null && last < current) {
                toReturn.add(last);
                last = null;
            }
            toReturn.add(current);
        }
        return toReturn;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 5, 6));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 4));
        List<Integer> list = merge(list1, list2);
        list.forEach(System.out::println);
    }
}
