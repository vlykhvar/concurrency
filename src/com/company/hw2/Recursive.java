package com.company.hw2;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Recursive extends RecursiveTask<Integer> {
    private List<Integer> list;

    public Recursive(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected Integer compute() {
        return list.stream().mapToInt(x->x).sum();
    }
}
