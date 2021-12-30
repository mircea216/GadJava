package com.company.functional.codechallenge;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumer {
    @Test
    public void consumer1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b,", "c"));
        Consumer<List<String>> consumer = List::clear;
        consumer.accept(list);
        Assert.assertEquals(list, new ArrayList<>());
    }

    @Test
    public void consumer2() {
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b,", "c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a", "b,", "c", "first", "second"));

        Consumer<List<String>> consumer1 = list -> list.add("first");
        Consumer<List<String>> consumer2 = list -> list.add("second");
        Consumer<List<String>> consumer = consumer1.andThen(consumer2);
        consumer.accept(list1);
        Assert.assertEquals(list1, list2);
    }
}
