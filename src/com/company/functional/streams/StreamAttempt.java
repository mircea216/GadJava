package com.company.functional.streams;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAttempt {
    public static List<String> removeOdd(List<String> words) {
        return words
                .stream()
                .filter(s -> s.length() % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<String> toUpperCase(List<String> words) {
        return words
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(removeOdd(List.of("aaa", "b", "eeee", "dd")));
        System.out.println(toUpperCase(List.of("aaa", "b", "eeee", "dd")));
    }
}
