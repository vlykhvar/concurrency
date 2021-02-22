package com.company;

import org.apache.log4j.Logger;

public class Runnables implements Runnable {
    public final Counter counter;
    private static final Logger logger = Logger.getLogger(Runnables.class);

    public Runnables(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        logger.info("Thread-1 is running!");
        for (int j = 0; j < 100; j++) {
            counter.addPlusOne();
            logger.info("Thread-1: counter is " + counter.getCount());
        }
        logger.info("Thread-1 is over!");
    }
}
