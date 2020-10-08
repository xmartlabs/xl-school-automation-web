package com.xlschool.Test.Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver getDriver() {
        return driver;
    }

    private WebDriver driver = null;


    @BeforeMethod
    public void beforeMethod(){
        //Step 1
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("https://demoqa.com/");
        pauseDriver();
    }



    @AfterMethod
    public void afterMethod(){
        dispose();
    }

    public static void pauseDriver() {
        int waitTime = 500;
        try {
            Thread.sleep(waitTime);
        } catch (Exception e) {

        }
    }

    private void dispose() {
        this.driver.close();
        this.driver.quit();
    }

    public void highlighElement(WebElement pWebElement) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].style.backgroundColor = '#FDFF47';", pWebElement);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
