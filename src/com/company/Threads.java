package com.company;

public class Threads extends Thread {
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            Counter.setCount(1);
            System.out.println("Thread-0: counter is " + Counter.getCount());
        }
    }
}
