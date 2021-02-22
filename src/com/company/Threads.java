package com.company;

public class Threads extends Thread {
    public final Counter counter;

    public Threads(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            counter.setCount(1);
            System.out.println("Thread-0: counter is " + counter.getCount());
        }
    }
}
