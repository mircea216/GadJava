package com.company.functional.codechallenge;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;
import java.util.function.Predicate;

public class ProducerLambda {
    @Test
    public void predicate1() {
        Predicate<String> predicate = String::isEmpty;
        Predicate<String> notPredicate = predicate.negate();
        Assert.assertFalse(notPredicate.test(""));
        Assert.assertTrue(notPredicate.test("not empty"));
    }

    @Test
    public void predicate2() {
        Predicate<String> predicate1 = Objects::nonNull;
        Predicate<String> predicate2 = s -> !s.isEmpty();
        Predicate<String> predicate3 = predicate1.and(predicate2);
        Assert.assertFalse(predicate3.test(""));
        Assert.assertFalse(predicate3.test(null));
        Assert.assertTrue(predicate3.test("not empty not null"));
    }
}
