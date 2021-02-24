package com.company.hw2;

import com.company.Counter;
import com.company.Runnables;
import com.company.Threads;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = Logger.getLogger(Runnables.class);

    public static void main(String[] args) throws Exception {
        logger.info("Program is started");
        Counter counter = new Counter();
        Thread first = new Threads(counter);
        Thread second = new Thread(new Runnables(counter));
        first.getContextClassLoader().getResource("src\\resources\\log4j.properties");
        first.start();
        second.start();
        logger.info("Program is over");

        List<Integer> list = new ArrayList<>();
        while (list.size() <= 999_999) {
            list.add(1);
        }
        Recursive recursive = new Recursive(list);
        CallableCustom callableCustom = new CallableCustom(list);
        System.out.println(recursive.compute());
        System.out.println(callableCustom.call());
    }
}
