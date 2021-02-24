package com.company.hw2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class RecursiveTest {
    private static List<Integer> list;
    Recursive recursive;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void compute() {
        try {
            initializeList(1);
            Assertions.assertEquals(1_000_000, recursive.compute());
            initializeList(2);
            Assertions.assertEquals(2_000_000, recursive.compute());
            initializeList(-2);
            Assertions.assertEquals(-2_000_000, recursive.compute());
        } catch (Exception e) {
            throw new RuntimeException("Try again");
        }
    }

    public void initializeList(int number) {
        list = new ArrayList<>();
        while (list.size() <= 999_999) {
            list.add(number);
        }
        recursive = new Recursive(list);
    }
}