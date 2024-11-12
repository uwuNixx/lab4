package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static final Logger rootLogger = LogManager.getRootLogger();

    public static void main(String[] args) {

        rootLogger.info("info message");

        // debug
        if (rootLogger.isDebugEnabled()) {
            rootLogger.debug("In debug message");
        }
        try {
            throw new NullPointerException("Null!!!");
        } catch (NullPointerException ex) {
            rootLogger.error("error message: " + ex.getMessage());
            rootLogger.fatal("fatal error message: " + ex.getMessage());
        }

    }
}
