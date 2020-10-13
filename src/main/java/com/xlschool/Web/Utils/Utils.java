package com.xlschool.Web.Utils;

import com.xlschool.Web.Driver.DriverHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Utils {
    public static void pauseDriver() {
        int waitTime = 500;
        try {
            Thread.sleep(waitTime);
        } catch (Exception e) {

        }
    }

    public void highlighElement(WebElement pWebElement) {
        JavascriptExecutor jse = (JavascriptExecutor) DriverHandler.getDriver();
        jse.executeScript("arguments[0].style.backgroundColor = '#FDFF47';", pWebElement);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) DriverHandler.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
