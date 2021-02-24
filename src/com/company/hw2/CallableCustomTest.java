package com.company.hw2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class CallableCustomTest {
    private static List<Integer> list;
    private static CallableCustom callableCustom;

    @Test
    public void call() {
        try {
            initializeList(1);
            Assertions.assertEquals(1_000_000, callableCustom.call());
            initializeList(2);
            Assertions.assertEquals(2_000_000, callableCustom.call());
            initializeList(-2);
            Assertions.assertEquals(-2_000_000, callableCustom.call());
        } catch (Exception e)
        {
            throw new RuntimeException("Try again");
        }
    }

    public void initializeList(int number) {
        list = new ArrayList<>();
        while (list.size() <= 999_999) {
            list.add(number);
        }
        callableCustom = new CallableCustom(list);
    }
}