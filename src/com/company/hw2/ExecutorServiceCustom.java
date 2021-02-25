package com.company.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceCustom {
    public int getSum(List<Integer> list, int threads) {
        if (threads <= 0) {
            throw new RuntimeException("Threads can't be less that zero");
        }
        ExecutorService executorService = Executors.newFixedThreadPool(threads);
        List<Callable<Integer>> tasks = new ArrayList<>();
        for (int i = 0; i < list.size(); i += list.size() / threads) {
            int to = Math.min((i + list.size() / threads), list.size());
            tasks.add(new CallableCustom(list.subList(i, to)));
        }
        try {
            List<Future<Integer>> listFuture = executorService.invokeAll(tasks);
            int result = 0;
            for (Future<Integer> future : listFuture) {
                result += future.get();
            }
            executorService.shutdown();
            return result;
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Exception! try again", e);
        }
    }

}
