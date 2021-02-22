package com.company;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread first = new Threads(counter);
        Thread second = new Thread(new Runnables(counter));
        first.start();
        second.start();
    }
}
