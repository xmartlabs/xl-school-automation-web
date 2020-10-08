package com.xlschool.Utils.Logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log {

    private static Logger log;


    // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite

    public static void startTestCase(Class pClass, String sTestCaseName){

        log = LogManager.getLogger(pClass);

        log.info("****************************************************************************************");

        log.info("****************************************************************************************");

        log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");

        log.info("****************************************************************************************");

        log.info("****************************************************************************************");

    }

    //This is to print log for the ending of the test case

    public static void endTestCase(Class pClass, String sTestCaseName){

        log = LogManager.getLogger(pClass);

        log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");

        log.info("X");

        log.info("X");

        log.info("X");

        log.info("X");

    }

    // Need to create these methods, so that they can be called

    public static void info(Class pClass, String message) {
        log = LogManager.getLogger(pClass);

        log.info(message);

    }

    public static void warn(Class pClass, String message) {
        log = LogManager.getLogger(pClass);

        log.warn(message);

    }

    public static void error(Class pClass, String message) {
        log = LogManager.getLogger(pClass);

        log.error(message);

    }

    public static void fatal(Class pClass, String message) {
        log = LogManager.getLogger(pClass);

        log.fatal(message);

    }

    public static void debug(Class pClass, String message) {
        log = LogManager.getLogger(pClass);

        log.debug(message);

    }

}
