package com.company.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class Recursive extends RecursiveTask<Integer> {
    private static final int AMOUNT_OF_THREADS = 10;
    private static final int THRESHOLD = 100_000;
    private final List<Integer> list;

    public Recursive(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer compute() {
        if (list.size() > THRESHOLD) {
            return ForkJoinTask.invokeAll(createSubtasks())
                    .stream()
                    .mapToInt(ForkJoinTask::join)
                    .sum();
        }
        return calculateSum();
    }

    private List<Recursive> createSubtasks() {
        List<Recursive> subtasks = new ArrayList<>();
        for (int i = 0; i < AMOUNT_OF_THREADS; i++) {
            subtasks.add(new Recursive(list
                    .subList(i * list.size() / AMOUNT_OF_THREADS,
                            (i + 1) * list.size() / AMOUNT_OF_THREADS)));
        }
        return subtasks;
    }

    private Integer calculateSum() {
        return list
                .stream()
                .mapToInt(s -> s)
                .sum();
    }
}
