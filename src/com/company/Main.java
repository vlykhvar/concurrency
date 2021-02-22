package com.company;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Runnables.class);

    public static void main(String[] args) {

        logger.info("Program is started");
        Counter counter = new Counter();
        Thread first = new Threads(counter);
        Thread second = new Thread(new Runnables(counter));
        first.getContextClassLoader().getResource("src\\resources\\log4j.properties");
        first.start();
        second.start();
        logger.info("Program is over");
    }
}
