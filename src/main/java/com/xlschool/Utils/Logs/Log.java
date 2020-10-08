package com.xlschool.Utils.Logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

    private static Logger log;

    private static void setLog(String pName){
        log = LoggerFactory.getLogger(pName);
    }


    // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite

    public static void startTestCase(String pName, String sTestCaseName){

        log = LoggerFactory.getLogger(pName);

        log.info("****************************************************************************************");

        log.info("****************************************************************************************");

        log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");

        log.info("****************************************************************************************");

        log.info("****************************************************************************************");

    }

    //This is to print log for the ending of the test case

    public static void endTestCase(String pName){

        setLog(pName);

        log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");

        log.info("X");

        log.info("X");

        log.info("X");

        log.info("X");

    }

    // Need to create these methods, so that they can be called

    public static void info(String pName, String message) {
        setLog(pName);
        log.info(message);
    }

    public static void warn(String pName, String message) {
        setLog(pName);
        log.warn(message);
    }

    public static void error(String pName, String message) {
        setLog(pName);
        log.error(message);
    }

    public static void trace(String pName, String message) {
        setLog(pName);
        log.trace(message);
    }

    public static void debug(String pName, String message) {
        setLog(pName);

        log.debug(message);

    }

}