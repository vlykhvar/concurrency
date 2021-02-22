package com.company;

import org.apache.log4j.Logger;

public class Threads extends Thread {
    public final Counter counter;
    private static final Logger logger = Logger.getLogger(Threads.class);

    public Threads(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        logger.info("Thread-0 is running!");
        for (int j = 0; j < 100; j++) {
            counter.addPlusOne();
            logger.info("Thread-0: counter is " + counter.getCount());
        }
        logger.info("Thread-0 is over");
    }
}
