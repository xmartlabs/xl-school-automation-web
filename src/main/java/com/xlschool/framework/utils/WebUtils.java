package com.xlschool.framework.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.xlschool.framework.driver.DriverHandler.getDriver;

public class WebUtils {
    public static void pauseDriver() {
        int waitTime = 500;
        try {
            Thread.sleep(waitTime);
        } catch (Exception e) {

        }
    }

    public static void highlighElement(WebElement pWebElement) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].style.backgroundColor = '#FDFF47';", pWebElement);
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
