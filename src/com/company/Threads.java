package com.company;

import org.apache.log4j.Logger;

public class Threads extends Thread {
    private final Counter counter;
    private static final Logger logger = Logger.getLogger(Threads.class);

    public Threads(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        logger.info("Thread-0 is running!");
        while (counter.getCount() < 100) {
            logger.info("Thread-0: counter is " +  counter.increment());
        }
        logger.info("Thread-0 is over");
    }
}
