package com.company.hw2;

import org.apache.commons.collections4.ListUtils;

import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.Collectors;

public class Join {
    private List<Integer> list;
    private static final int THREADS = Runtime.getRuntime().availableProcessors();

    public Join(List<Integer> list) {
        this.list = list;
    }

    public int execure() {
        List<List<Integer>> partition = ListUtils.partition(list, THREADS);
        List<Recursive> list = partition.stream().map(Recursive::new).collect(Collectors.toList());
        return ForkJoinTask.invokeAll(list).stream().map(ForkJoinTask::join).mapToInt(i -> i).sum();
    }
}
