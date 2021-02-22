package com.company;

public class Counter {
    private static int count;

    public Counter() {
        count = 0;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Counter.count += count;
    }
}
