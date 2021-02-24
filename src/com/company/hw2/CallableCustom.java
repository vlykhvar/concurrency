package com.company.hw2;

import java.util.List;
import java.util.concurrent.Callable;

public class CallableCustom implements Callable<Integer> {
    private List<Integer> list;

    public CallableCustom(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() {
        return list.stream().mapToInt(x->x).sum();
    }
}
