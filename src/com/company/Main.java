package com.company;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread first = new Threads();
        Thread second = new Thread(new Runnables());
        first.start();
        second.start();
    }
}
