package com.company;

public class Runnables implements Runnable {
    public final Counter counter;

    public Runnables(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            counter.setCount(1);
            System.out.println("Thread-1: counter is " + counter.getCount());
        }
    }
}
