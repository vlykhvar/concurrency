package com.company;

public class Runnables implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j<100; j++) {
            Counter.setCount(1);
            System.out.println("Thread-1: counter is " + Counter.getCount());
        }
    }
}
