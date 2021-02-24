package com.company.hw2;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CallableCustomTest {
    private static CallableCustom callableCustom;
    private Recursive recursive;
    private CreateList createList;

    @Before
    public void setUp(){
        createList = new CreateList();
    }

    @Test
    public void compute() {
        callableCustom = new CallableCustom(createList.createList(1));
        Assertions.assertEquals(1_000_000, recursive.compute());
        setUp();
        callableCustom = new CallableCustom(createList.createList(2));
        Assertions.assertEquals(2_000_000, recursive.compute());
        setUp();
        callableCustom = new CallableCustom(createList.createList(-2));
        Assertions.assertEquals(-2_000_000, recursive.compute());
    }
}
