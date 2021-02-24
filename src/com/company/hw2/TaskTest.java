package com.company.hw2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import java.util.ArrayList;
import java.util.List;

class TaskTest {
    private static List<Integer> list;
    private static Recursive first;
    private static Join join;

    @BeforeAll
    public void setUp() {
        first = new Recursive(list);
        join = new Join(list);
    }

    @Test
    public void getSumRecursive_ok() {
        setList(1);
        Assertions.assertEquals(1_000_000, first.compute());
        setList(2);
        Assertions.assertEquals(2_000_000, first.compute());
    }

    @Test
    public void getSumJoin_ok() {
        setList(1);
        Assertions.assertEquals(1_000_000, join.execure());
        setList(2);
        Assertions.assertEquals(2_000_000, join.execure());
    }

    public void setList(int number) {
        list = new ArrayList<>();
        while (list.size() <= 999_999) {
                list.add(number);
        }
    }
}
